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

    public Compra(int id, Status status){
        this.id = id;
        this.status = status;
    }

    public Compra(Status status, boolean entregaOuRetirada, HashMap<Produto, Integer> inPacote, Carrinho carrinhoIni, int _id) {
        
        //o codigo de status é gerado aleatoriamente
        
        this.status = status;
        this.entregaOuRetirada = entregaOuRetirada;
        this.carrinhoIni = carrinhoIni;
        this.pacote = inPacote; 
        this.id = _id;
        
    }

    public static Status fromStringToStatus (String stringStatus){
        switch(stringStatus){
        
            case "PENDENTE":
                return Status.PENDENTE;
            case "PAGO":
                return Status.PAGO;
            default:
                return Status.CANCELADO;
                
        }
    }

    public String checaStatus(){
        
        
            
        switch(status){
        
            case PENDENTE:
                return "PENDENTE";
            case PAGO:
                return "PAGO";
            case CANCELADO:
                return "CANCELADO";
            default:
                return "NULL";
        }
        
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCodigoStatus() {
        return codigoStatus;
    }

    public void setCodigoStatus(int codigoStatus) {
        this.codigoStatus = codigoStatus;
    }

    public HashMap<Produto, Integer> getPacote() {
        return pacote;
    }

    public void setPacote(HashMap<Produto, Integer> pacote) {
        this.pacote = pacote;
    }

    public boolean isEntregaOuRetirada() {
        return entregaOuRetirada;
    }

    public void setEntregaOuRetirada(boolean entregaOuRetirada) {
        this.entregaOuRetirada = entregaOuRetirada;
    }

    public Carrinho getCarrinhoIni() {
        return carrinhoIni;
    }

    public void setCarrinhoIni(Carrinho carrinhoIni) {
        this.carrinhoIni = carrinhoIni;
    }  

    @Override
    public String toString(){
        String productsFromBuy = "";
        //TODO: ADICIONAR PRODUTOS DA COMPRA

        return String.format("%d|%s|", this.id, this.checaStatus());
    }
}
