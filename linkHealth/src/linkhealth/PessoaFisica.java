package linkhealth;

public class PessoaFisica extends Usuario{
    
    private String cpf;
    private int idade;
    private boolean receita = false;
    
    public PessoaFisica()
    {}
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public String getCpf()
    {
        return this.cpf;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public int getIdade()
    {
        return this.idade;
    }
    
    public void setReceita(boolean receita)
    {
        this.receita = receita;
    }
    
    public boolean getReceita()
    {
        return this.receita;
    }
    
    public void cadastraPessoaFisica(String _cpf, int _idade, boolean _receita)
    {
        this.cpf = _cpf;
        this.idade = _idade;
        this.receita = _receita;
    }
            
}
