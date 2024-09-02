package classes;


/*
* Essa classe armazena no sistema todos os atributos 
* que um cartão pode ter para o usuario
* facilita o processo do pagamento uma vez que essa forma
* já deve estar cadastrada no usuario anteriormente
*/
public class FormaDePagamento {
    
    private String cartao, titular, venc, cpf;
    private boolean debito, credito;
    private int cvv;
    
    //Constructor to use in Usuario class

    public FormaDePagamento(String cpf, String cartao, String titular, String venc, boolean debito, boolean credito, int cvv) {
        this.cartao = cartao;
        this.titular = titular;
        this.venc = venc;
        this.debito = debito;
        this.credito = credito;
        this.cvv = cvv;
        this.cpf = cpf;
    }
    
    public FormaDePagamento(String cartao, boolean debito, boolean credito) {
        this.cartao = cartao;
        this.debito = debito;
        this.credito = credito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getVenc() {
        return venc;
    }

    public void setVenc(String venc) {
        this.venc = venc;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    public FormaDePagamento() {};
 

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    
    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    
    
    @Override
    public String toString() {
        return (
                this.cartao + "#" + (this.debito ? "true" : "false") + "#"
                + (this.credito ? "true" : "false")
                + "#" + Integer.toString(this.cvv)
                + "#" + this.titular + "#" + this.venc + "#" + this.cpf + "#"
                );
    }
}
