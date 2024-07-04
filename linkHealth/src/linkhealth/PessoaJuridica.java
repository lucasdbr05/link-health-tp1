package linkhealth;

public class PessoaJuridica extends Usuario {

    private String cnpj;
    private boolean hospital = false;

    public PessoaJuridica() {
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
    
    public void cadastraPessoaJuridica(String inCnpj, boolean hospital){
        
        //Cadastra as informações de uma pessoa juridica no sistema
        this.cnpj = inCnpj;
        this.hospital = hospital;
    }
}
