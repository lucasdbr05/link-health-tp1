package classes;

import java.util.ArrayList;

public abstract class Usuario {
    
    //Coisas comuns a todos os usuarios da aplicação
    
    protected String nome, senha;
    protected int id;
    protected ArrayList<String> endereco;
    protected ArrayList<FormaDePagamento> formasDePagamento;

    public Usuario(){};

    public Usuario(String nome, String senha, int id, ArrayList<String> endereco,
            ArrayList<FormaDePagamento> formasDePagamento) {
        this.nome = nome;
        this.senha = senha;
        this.id = id;
        this.endereco = endereco;
        this.formasDePagamento = formasDePagamento;
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.endereco = new ArrayList<String>();
        this.formasDePagamento = new ArrayList<FormaDePagamento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<String> getEnderco() {
        return endereco;
    }

    public void setEnderco(ArrayList<String> endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void cadastraNewEndereco(String endereco){
        
        //Como o usuario pode ter a necessidade de apresentar mais de um endereço
        //Ele podera cadastrar um novo enderço
        this.endereco.add(endereco);
        
        //alterar no gerenciador de arquivos tambem
    }
    
    public void cadastraFormaDePagamento(String cartao, boolean debito, boolean credito, int senha){
        
        //cadastra uma nova forma de Pagamento para o usuario        
        FormaDePagamento formaDePagamento = new FormaDePagamento(cartao, debito, credito, senha);
        
        formasDePagamento.add(formaDePagamento);
    }
    public String mostrarDadosUsuario()
    {
        return ("Nome: " + this.nome);
    }

    @Override
    public String toString() {
        String address = "";

        for(String s: this.endereco) {
            address += s;
        }
        return String.format("%d|%s|%s|%s||", this.id, this.nome, this.senha,address );
    }

    
}
