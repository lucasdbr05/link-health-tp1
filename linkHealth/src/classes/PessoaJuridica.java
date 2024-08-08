package classes;

public class PessoaJuridica extends Usuario {

    private String cnpj;
    private boolean hospital = false;

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
}
