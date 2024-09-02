package classes;
/*
* Classe usada para representar a abstração de um produto a ser vendido
* dentro da aplicação, o produto têm características de preço e de permitições
* diferenciadas com usuários de papéis distintos 
*/


public class Produto {
       private String nome;
       private Integer id;
       private Double precoDeCusto;
       private boolean exigeReceita;
       private Integer quantidade; 
       private Integer distId;
       
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public Produto(){}

    public Produto(String nome, Integer id, Double precoDeCusto,  boolean exigeReceita, Integer estoque, Integer dId) {
        this.nome = nome;
        this.id = id;
        this.precoDeCusto = precoDeCusto;
        this.exigeReceita = exigeReceita;
        this.distId = dId;
        this.quantidade = estoque;
    }
    
    public Produto(String nome, Double precoDeCusto, boolean exigeReceita, Integer estoque, Integer dId) {
        this.nome = nome;
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
        String preco = String.format("%.2f", this.precoDeCusto).replace(",", ".");
        return String.format("%d|%s|%s|%d|%s|%d", this.id, this.nome, preco, this.quantidade, receita, this.distId);
    }
}