package linkhealth;

import java.util.ArrayList;

public class Usuario {
    
    //Coisas comuns a todos os usuarios da aplicação
    
    protected String nome, senha;
    protected ArrayList<String> enderco;
    protected int id;
    protected ArrayList<String> endereco;

    public Usuario() {
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
        return enderco;
    }

    public void setEnderco(ArrayList<String> enderco) {
        this.enderco = enderco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public void cadastraUsuario(String nome, String senha, String endereco){
        
        // acessar proximo id a partir do bd
        
        this.nome = nome;
        this.senha = senha;
        this.endereco = new ArrayList<String>();
        this.endereco.add(endereco);
    }
    
    public void cadastraNewEndereco(String endereco){
        
        //Como o usuario pode ter a necessidade de apresentar mais de um endereço
        //Ele podera cadastrar um novo enderço
        
        this.endereco.add(endereco);
    }
}
