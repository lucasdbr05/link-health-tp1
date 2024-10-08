package classes.database;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import classes.database.repositories.IDatabaseRepository;

/*
* Classe responsável por fazer as operações de CRUD 
* dentro das representações de tabelas do banco
*/

class Database implements IDatabaseRepository{
    @Override
    public void fileClear(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.write("");
        buffWrite.close();
    }
    
    
    @Override
    public  String fileReader(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String row = "";
        String ans = "";
        while (true) {
            row = buffRead.readLine();
            if (row != null && !row.isBlank()) {
                    if(row.startsWith("//")) continue; //indicate database pattern
                    ans += row +"\n";

            } else break;
        }
        buffRead.close();

        return ans;
    }
    
    @Override
    public void fileWriter(String path, String row) throws IOException {
        
        try {
            String text = fileReader(path) + row; 

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

            buffWrite.append(text + "\n");
            buffWrite.close();
        } catch (IOException ex) {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            buffWrite.append(row + "\n");
            buffWrite.close();
        }
    }

    @Override
    public String[] splitRowString(String userSplited2) {
        String[] rowSplit =  userSplited2.split("\\|");
        for(String data: rowSplit) {
            data = data.strip();
        }
        return rowSplit;
    }

    @Override
    public String[] splitFileWrite(String fileData) {
        return fileData.split("\n");
    }

    @Override
    public int getNextId(String path, int idPosition) throws IOException{
        try{
            String fileData = this.fileReader(path);
       
            String[] dataSplited = this.splitFileWrite(fileData);

            String data = "";
            for(int i=dataSplited.length-1; i>=0; i--){
               if(!dataSplited[i].isBlank()) {
                   data = dataSplited[i];
                   break;
               }   
            }

            String[] rowData = this.splitRowString(data);

            return (Integer.parseInt(rowData[idPosition]) + 1);
        } catch (Exception ex) {
            return 1;
        }
        
    }

    @Override
    public void fileWriteRows(String path, String[] newData) throws IOException {
        String data = "";
        
        
        for(String row: newData){
            data += (row + '\n');
        }
        
        
        this.fileWriter(path, data);
    }

}