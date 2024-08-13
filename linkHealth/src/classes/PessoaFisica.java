package classes;

import java.util.ArrayList;

public class PessoaFisica extends Usuario{
    
    private String cpf;
    private int idade;
    private boolean receita = false;

    public PessoaFisica(){};
    
    public PessoaFisica(int id, String nome, String senha, ArrayList<String> endereco,
            ArrayList<FormaDePagamento> formasDePagamento, String cpf, int idade, boolean receita) {
        super(nome, senha, id, endereco, formasDePagamento);
        this.cpf = cpf;
        this.idade = idade;
        this.receita = receita;
    }

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
    
    
    public String mostrarDadosUsuario()
    {
        return("Nome: " + nome + "\nIdade: " + idade + "\nCpf: " + cpf);
    }

    @Override
    public String toString() {
        String r = this.receita ? "true": "false";
        return String.format("PESSOA_FISICA|%s|%s|%d|%s\n", super.toString(), this.cpf, this.idade,r);
    }
}
