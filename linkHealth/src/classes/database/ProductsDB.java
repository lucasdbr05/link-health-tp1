package classes.database;

import classes.ENV;
import java.io.IOException;
import java.util.ArrayList;

import classes.Produto;
import classes.database.repositories.IProductsDBRepository;

//Responsável por fazer altterações na tabela de produtos
public  class ProductsDB extends Database implements IProductsDBRepository {
    
    static String file = String.format("%s\\produtos.txt", ENV.databasePath);
    

    
    @Override
    public Produto  findOne(int id) throws IOException {
        String[] productRows = this.splitFileWrite(this.fileReader(file));

        for(String row: productRows) {
            Produto produto = this.fromStringToProductObject(row);
            if(produto.getId() == id) return produto;
        }
        return null;
    }
    
    @Override
    public ArrayList<Produto> findAll() throws IOException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String[] productsRows = this.splitFileWrite(this.fileReader(file));

        for(String row: productsRows) {
            if(row.isBlank()) continue;
            
            Produto user = this.fromStringToProductObject(row);
            produtos.add(user);
        }

        return produtos;
    }
    
     @Override
    public ArrayList<Produto> findAllByUser(int distribuidorId) throws IOException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String[] productsRows = this.splitFileWrite(this.fileReader(file));

        for(String row: productsRows) {
            if(row.isBlank()) continue;
            
            Produto produto = this.fromStringToProductObject(row);
            if(distribuidorId == produto.getDistId())
                produtos.add(produto);
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
        
        
        String[] productRows = this.splitFileWrite(this.fileReader(file));
        
        Produto removedProduct = null;
        
        if(productRows.length == 0) {
            return null;
        }
        
        String[] newRows = new String[productRows.length -1];
       
        for(int i=0, j=0; i< productRows.length; i++) {
            if(productRows[i].isBlank()) continue;
            Produto product = this.fromStringToProductObject(productRows[i]);
            if(id == product.getId()){
                product.setQuantidade(0);
                
                productRows[i] = product.toString();
            }
            newRows[j++] = productRows[i]; 
        }
        this.fileClear(file);
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
        String nome = productSplited[1];
        Double preco = Double.parseDouble(productSplited[2]);
        int quantity = Integer.parseInt(productSplited[3]);
        boolean exigeReceita = productSplited[4].equals("true");
        int distId = Integer.parseInt(productSplited[5]);
        Produto produto =  new Produto(nome, id, preco, exigeReceita, quantity, distId);
                
        return produto;
    }    
    
    public static String getPath(){
        return ProductsDB.file;
    }
}

