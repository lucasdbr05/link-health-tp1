package classes;

public class FormaDePagamento {
    
    private String cartao;
    private boolean debito, credito;
    private int senha;
    
    //Constructor to use in Usuario class
    
    public FormaDePagamento(String cartao, boolean debito, boolean credito, int senha) {
        this.cartao = cartao;
        this.debito = debito;
        this.credito = credito;
        this.senha = senha;
    }

    public FormaDePagamento() {};
    
    public boolean checaSenha(boolean debitoOuCredito, int inSenha){
        
        // checa se a senha e a forma de pagamento estão corretas
        if((debitoOuCredito && credito) || (!debitoOuCredito && debito)){
            
            return(this.senha == inSenha);
        }
        
        return false;
    }

    @Override
    public String toString() {
        return (
                this.cartao + "#" + (this.debito ? "true" : "false") + "#"
                + (this.credito ? "true" : "false")
                + "#" + Integer.toString(this.senha) + "#"
                );
    }
}
