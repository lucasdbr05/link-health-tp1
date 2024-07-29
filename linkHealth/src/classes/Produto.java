package classes;

public class Produto {
       private String nome;
       private Integer id;
       private Double precoDeCusto;
       private boolean exigeReceita;
       private Integer quantidade; // this needs improvements :)

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, Integer id, Double precoDeCusto, boolean exigeReceita, Integer estoque) {
        this.nome = nome;
        this.id = id;
        this.precoDeCusto = precoDeCusto;
        this.exigeReceita = exigeReceita;
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
       
    
}
