package classes;

public class Produto {
       private String nome;
       private Integer id;
       private Double precoDeCusto;
       private boolean exigeReceita;
       private Integer quantidade; // this needs improvements :)
       private Integer distId;
       
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, Integer id, Double precoDeCusto, boolean exigeReceita, Integer estoque, Integer dId) {
        this.nome = nome;
        this.id = id;
        this.precoDeCusto = precoDeCusto;
        this.exigeReceita = exigeReceita;
        this.distId = dId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     public Integer getDistId() {
        return distId;
    }

    public void setDistId(Integer id) {
        this.distId = id;
    }

    public Double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(Double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public boolean isExigeReceita() {
        return exigeReceita;
    }

    public void setExigeReceita(boolean exigeReceita) {
        this.exigeReceita = exigeReceita;
    }
       
    @Override
    public String toString() {
        String receita = this.exigeReceita ? "true":"false";
        return String.format("%d|%s|%.2f|%d|%s|%d", this.id, this.nome, this.precoDeCusto, this.quantidade, receita, this.distId);
    }
}
