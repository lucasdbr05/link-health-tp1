package classes.database;

import java.io.IOException;
import java.util.ArrayList;

import classes.Produto;
import classes.database.repositories.IProductsDBRepository;

public  class ProductsDB extends Database implements IProductsDBRepository {
    
    static String file = "C:\\Users\\emers\\OneDrive\\Documentos\\projetos\\projeto-tp1\\link-health-tp1\\linkHealth\\src\\classes\\database\\data\\produtos.txt";
    
    // quem for rodar não esquece de colocar a path pro seu arquivo
    // não sei como padronizar isso
    
    @Override
    public Produto  findOne(int id) throws IOException {
        String[] productRows = this.splitFileWrite(this.fileReader(file));

        for(String row: productRows) {
            Produto produto = this.fromStringToProductObject(row);
            if(produto.getId() == id) return produto;
        }
        throw new UnsupportedOperationException("User not found");
    }
    
    @Override
    public ArrayList<Produto> findAll() throws IOException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String[] productsRows = this.splitFileWrite(this.fileReader(file));

        for(String row: productsRows) {
            Produto user = this.fromStringToProductObject(row);
            produtos.add(user);
        }

        return produtos;
    }

    @Override
    public Produto create(Produto produto) throws IOException {
        String data = "";       
        int id;
        try{
            id = this.getNextId(file, 0);

        }catch(Exception e){
            id = 1;
        }
        produto.setId(id);
        
        data = produto.toString();

        this.fileWriter(file, data);

        return produto;
    }

    @Override
    public Produto deleteProduto(int id) throws IOException {
        
        this.fileClear(file);
        String[] productRows = this.splitFileWrite(this.fileReader(file));
        
        Produto removedProduct = null;
        
        if(productRows.length == 0) {
            return null;
        }
        
        String[] newRows = new String[productRows.length -1];
       
        for(int i=0, j=0; i< productRows.length; i++) {
            Produto product = this.fromStringToProductObject(productRows[i]);
            if(id == product.getId()) {
                removedProduct = product;
                continue;
            }
            newRows[j++] = productRows[i]; 
        }
        
        this.fileWriteRows(file, newRows);
        return removedProduct;
    }

    
    
    @Override
    public Produto update(Produto newUserData) throws IOException {
        String[] productRows = this.splitFileWrite(this.fileReader(file));
        
        
        for(int i=0; i< productRows.length; i++) {
            Produto product = this.fromStringToProductObject(productRows[i]);
            if(newUserData.getId() == product.getId()) {
                productRows[i] = newUserData.toString();
            }
        }
        
        this.fileClear(file);
        this.fileWriteRows(file, productRows);
        
        return newUserData;
    }

    @Override
    public Produto fromStringToProductObject(String productString) {
        String[] productSplited = this.splitRowString(productString);
    
        int id = Integer.parseInt(productSplited[0]);
        // int distributorId = Integer.parseInt(productSplited[1]); VAMO TER ESSA RELAÇÃOZINHA OU NÃO
        String nome = productSplited[1];
        Double preco = Double.parseDouble(productSplited[2]);
        Integer quantity = Integer.parseInt(productSplited[3]);
        boolean exigeReceita = productSplited[4].equals("true");
        Produto produto =  new Produto(nome, id, preco, exigeReceita, quantity);
        
        
        return produto;
    }
}

