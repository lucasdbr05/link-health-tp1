package classes;
import java.util.HashMap;
import java.util.ArrayList;


public class Distribuidor extends Usuario {
    private String cnpj;
    private ArrayList<Produto> produtos;
    private HashMap<Produto, Integer> estoque = new HashMap<>();
    private boolean aceitaPessoaFisica;
    private HashMap<Produto, Double> precos = new HashMap<>();

    public Distribuidor(
            String _nome, 
            String _senha,
            String _cnpj,
            boolean _aceitaPessoaFisica
    ) {
        super(_nome, _senha);
        this.cnpj = _cnpj;
        this.aceitaPessoaFisica = _aceitaPessoaFisica;
        this.produtos = new ArrayList<Produto>();
        // Fazer o cadastro primeiro depois registrar os produtos
        this.estoque = buildEstoque();
        this.precos = buildPrecos();
        
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public HashMap<Produto, Integer> getEstoque() {
        return estoque;
    }

    public HashMap<Produto, Double> getPrecos() {
        return precos;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isAceitaPessoaFisica() {
        return aceitaPessoaFisica;
    }

    public void setAceitaPessoaFisica(boolean aceitaPessoaFisica) {
        this.aceitaPessoaFisica = aceitaPessoaFisica;
    }

    public HashMap<Produto, Integer> buildEstoque() {
        HashMap<Produto, Integer> estoqueMap = new HashMap<>();
        for (int i = 0; i < this.produtos.size(); i ++) {
            estoqueMap.put(this.produtos.get(i), this.produtos.get(i).getQuantidade());
        }
        return estoqueMap;
    }
    
    public HashMap<Produto, Double> buildPrecos() {
        HashMap<Produto, Double> precosMap = new HashMap<>();
        for (int i = 0; i < this.produtos.size(); i ++) {
            precosMap.put(this.produtos.get(i), this.produtos.get(i).getQuantidade()*this.produtos.get(i).getPrecoDeCusto());
        }
        return precosMap;
    }
    public void addProduct(Produto produto) {
        this.precos.put(produto, this.precos.getOrDefault(produto, 0.0) + produto.getPrecoDeCusto());
        this.estoque.put(produto, this.estoque.getOrDefault(produto, 0) + produto.getQuantidade());
    }
}
