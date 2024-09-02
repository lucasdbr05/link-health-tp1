package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
* A implementação da classe de Compra fica assim;
* Classe gerada pelo carrinho
* é o pedido após confirmado pelo usuário
* por conta disso deve guardar quem foi o comprador
* o Status dessa compra que pode variar de acordo com o Enum estabelecido
* além de guardar o carrinho que gerou essa compra, com o objetivo de saber
* quais produtos, preços e quantidades
* apresenta metodos também para o manuseio da informação de seu status
*/
public class Compra {
    
    private int id;
    private Status status;
    private int codigoStatus;
    private boolean entregaOuRetirada;
    private Carrinho carrinhoIni;
    private int compradorId;

    public Compra(int id, Status status){
        this.id = id;
        this.status = status;
    }

    public Compra(Status status, boolean entregaOuRetirada, Carrinho carrinhoIni, int _id, int _compradorId) {
        
        //o codigo de status é gerado aleatoriamente
        
        this.status = status;
        this.entregaOuRetirada = entregaOuRetirada;
        this.carrinhoIni = carrinhoIni;
        this.id = _id;
        this.compradorId = _compradorId;
        
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
    
    public String getStringStatus(){
            
        switch(this.status){
        
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
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCompradorId() {
        return this.compradorId;
    }

    public void setCompradorId(int id) {
        this.compradorId = id;
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
        String isEntrega = this.entregaOuRetirada ? "true":"false";


        return String.format("%d|%s|%s|%s|%d", this.id, this.getStringStatus(), isEntrega, this.carrinhoIni.toString(), this.compradorId);
    }
}
