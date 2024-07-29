package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

enum Status{

    PENDENTE,
    PAGO,
    CANCELADO
}

public class Compra {
    
    private int id;
    private Status status;
    private int codigoStatus;
    private HashMap<Produto, Integer> pacote;
    private boolean entregaOuRetirada;
    private Carrinho carrinhoIni;

    public Compra(Status status, boolean entregaOuRetirada, HashMap<Produto, Integer> inPacote, Carrinho carrinhoIni, int _id) {
        
        //o codigo de status é gerado aleatoriamente
        
        this.status = status;
        this.entregaOuRetirada = entregaOuRetirada;
        this.carrinhoIni = carrinhoIni;
        this.pacote = inPacote; 
        this.id = _id;
        
    }
    
    public String checaStatus(int inCodigo){
        
        if(this.codigoStatus == inCodigo){
            
            switch(status){
            
                case PENDENTE:
                    return "PENDENTE";
                case PAGO:
                    return "PAGO";
                case CANCELADO:
                    return "CANCELADO";
            }
        }
        
        return "COMPRA NAO ENCONTRADA";
    }
    
    public ArrayList<Map.Entry<Produto, Integer>> checaProdutos(){
        
        //tratar o codigo da compra antes de chamar o checaProdutos;
        
        ArrayList<Map.Entry<Produto, Integer>> produtos = new ArrayList<Map.Entry<Produto, Integer>>();
        
        for (Map.Entry<Produto, Integer> entrada : this.pacote.entrySet()){
               
            produtos.add(entrada);
        }
        
        return produtos;
    }  
}
