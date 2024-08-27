package classes.database;

import java.io.IOException;

import java.util.ArrayList;

import classes.Compra;
import classes.database.repositories.IComprasDBRepository;

public class ComprasDB extends Database implements IComprasDBRepository {
    
    static String file = "C:\\Users\\emers\\OneDrive\\Documentos\\projetos\\projeto-tp1\\link-health-tp1\\linkHealth\\src\\classes\\database\\data\\compras.txt";
    
    // quem for rodar não esquece de colocar a path pro seu arquivo
    // não sei como padronizar isso
    
    @Override
    public Compra  findOne(int id) throws IOException {
        String[] comprasRows = this.splitFileWrite(this.fileReader(file));

        for(String row: comprasRows) {
            Compra compra = this.fromStringToBuyObject(row);
            if(compra.getId() == id) return compra;
        }
        throw new UnsupportedOperationException("User not found");
    }
    
    @Override
    public ArrayList<Compra> findAll() throws IOException {
        ArrayList<Compra> compra = new ArrayList<Compra>();
        String[] buyRows = this.splitFileWrite(this.fileReader(file));

        for(String row: buyRows) {
            Compra buy = this.fromStringToBuyObject(row);
            compra.add(buy);
        }

        return compra;
    }   

    @Override
    public Compra create(Compra buy) throws IOException {
        String data = "";       
        int id;
        try{
            id = this.getNextId(file, 0);

        }catch(Exception e){
            id = 1;
        }
        buy.setId(id);
        
        data = buy.toString();

        this.fileWriter(file, data);

        return buy;
    }

    @Override
    public Compra deleteCompra(int id) throws IOException {
        
        this.fileClear(file);
        String[] buyRows = this.splitFileWrite(this.fileReader(file));
        
        Compra removedProduct = null;
        
        if(buyRows.length == 0) {
            return null;
        }
        
        String[] newRows = new String[buyRows.length -1];
       
        for(int i=0, j=0; i< buyRows.length; i++) {
            Compra buys = this.fromStringToBuyObject(buyRows[i]);
            if(id == buys.getId()) {
                removedProduct = buys;
                continue;
            }
            newRows[j++] = buyRows[i]; 
        }
        
        this.fileWriteRows(file, newRows);
        return removedProduct;
    }

    
    
    @Override
    public Compra update(Compra newUserData) throws IOException {
        String[] buyRows = this.splitFileWrite(this.fileReader(file));
        
        
        for(int i=0; i< buyRows.length; i++) {
            Compra buy = this.fromStringToBuyObject(buyRows[i]);
            if(newUserData.getId() == buy.getId()) {
                buyRows[i] = newUserData.toString();
            }
        }
        
        this.fileClear(file);
        this.fileWriteRows(file, buyRows);
        
        return newUserData;
    }

    @Override
    public Compra fromStringToBuyObject(String productString) {
        String[] productSplited = this.splitRowString(productString);
    
        int id = Integer.parseInt(productSplited[0]);
        
        // String produtos = VAMO TER ESSA RELAÇÃOZINHA de botar produtos OU NÃO?
        
        return new Compra(id, Compra.fromStringToStatus(productSplited[1]));
    }
}
