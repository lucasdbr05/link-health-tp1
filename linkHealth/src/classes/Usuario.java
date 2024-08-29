package classes;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Usuario {
    
    //Coisas comuns a todos os usuarios da aplicação
    
    protected String nome, senha;
    protected int id;
    protected ArrayList<String> endereco;
    protected HashMap<String, FormaDePagamento> formasDePagamento;

    public Usuario(){};

    public Usuario(String nome, String senha, int id, ArrayList<String> endereco,
            HashMap<String, FormaDePagamento> formasDePagamento) {
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
        this.formasDePagamento = new HashMap<String, FormaDePagamento>();
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

    public void setEnderco(String endereco) {
        // Como o usuario pode ter a necessidade de apresentar mais de um endereço
        // Ele podera cadastrar um novo enderço
        this.endereco.add(endereco);
        // deixamos a adição de um endereço como algo para o usuario fazer ao acessar seu perfil
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cadastraFormaDePagamento(String cartao, boolean debito, boolean credito, int senha){
        
        //cadastra uma nova forma de Pagamento para o usuario        
        FormaDePagamento formaDePagamento = new FormaDePagamento(cartao, debito, credito, senha);
        // assumimos a mesma postura do q o endereço e deixamos para o usuario adicionar um metodo
        // quando acessar sua tela de perfil
        formasDePagamento.put(cartao, formaDePagamento);
    }
    
    public void removeFormaDePagamento(String cartao){
        
        // a gente remove um cartao para atualizar ou apenas remover mesmo
        // essa opção está disponivel para o usuario na tela de edição de uma forma
        // de pagamento
        
        formasDePagamento.remove(cartao);
    }
    public String mostrarDadosUsuario()
    {
        return ("Nome: " + this.nome);
    }

    @Override
    public String toString() {
        String address = "", forms = "";

        for(String s: this.endereco) {
            address += s + ";";
        }
        
        for(FormaDePagamento form : formasDePagamento.values())    
            forms += form + ";";
        
        
        return String.format("%d|%s|%s|%s|%s", this.id, this.nome, this.senha, address, forms);
    }

    
}
