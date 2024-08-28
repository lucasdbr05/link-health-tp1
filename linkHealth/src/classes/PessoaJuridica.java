package classes;

import java.util.ArrayList;

public class PessoaJuridica extends Usuario {

    private String cnpj;
    private boolean hospital = false;


    

    public PessoaJuridica(int id,String nome, String senha, ArrayList<String> endereco,
            ArrayList<FormaDePagamento> formasDePagamento, String cnpj, boolean hospital) {
        super(nome, senha, id, endereco, formasDePagamento);
        this.cnpj = cnpj;
        this.hospital = hospital;
    }

    public PessoaJuridica(String _nome, String _senha, String _cnpj, boolean _hospital) {
        
        super(_nome, _senha);
        
        this.cnpj = _cnpj;
        this.hospital = _hospital;
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
        return String.format("PESSOA_JURIDICA|%s|%s|%s\n", super.toString(), this.cnpj,h);
    }
}
