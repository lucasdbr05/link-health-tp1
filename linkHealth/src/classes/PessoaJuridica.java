package classes;

import java.util.ArrayList;
import java.util.HashMap;

public class PessoaJuridica extends Usuario {

    private String cnpj;
    private boolean hospital = false;
    private Carrinho meuCarrinho;
    

    public PessoaJuridica(int id,String nome, String senha, ArrayList<String> endereco,
            HashMap<String, FormaDePagamento> formasDePagamento, String cnpj, boolean hospital) {
        super(nome, senha, id, endereco, formasDePagamento);
        this.cnpj = cnpj;
        this.hospital = hospital;
        this.meuCarrinho = new Carrinho();
    }

    public PessoaJuridica(String _nome, String _senha, String _cnpj, boolean _hospital) {
        
        super(_nome, _senha);
        
        this.cnpj = _cnpj;
        this.hospital = _hospital;
    }
    
    public void setCarrinho(Carrinho c)
    {
        this.meuCarrinho = c;
    }
    public Carrinho getCarrinho()
    {
        return this.meuCarrinho;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isHospital() {
        return hospital;
    }

    public void setHospital(boolean hospital) {
        this.hospital = hospital;
    }
    
    public String mostrarDadosUsuario()
    {
        return("Nome: " + nome + "\nCnpj: " + cnpj);
    }

    @Override
    public String toString() {
        String h = this.hospital ? "true": "false";
        return String.format("PESSOA_JURIDICA|%s|%s|%s", super.toString(), this.cnpj,h);
    }
}
