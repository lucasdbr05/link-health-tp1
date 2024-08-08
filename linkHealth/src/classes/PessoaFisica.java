package classes;

public class PessoaFisica extends Usuario{
    
    private String cpf;
    private int idade;
    private boolean receita = false;
    
    public PessoaFisica(String _nome, String _senha, String _cpf, int _idade)
    {
        
        super(_nome, _senha);
        this.cpf = _cpf;
        this.idade = _idade;
    
    }
    
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
    
    @Override
    public String mostrarDadosUsuario()
    {
        return("Nome: " + nome + "\nIdade: " + idade + "\nCpf: " + cpf);
    }
}
