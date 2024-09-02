
package classes;

import java.util.HashMap;
import java.util.Map;

/*
* Classe usada para gerenciar os produtos desejados por
* uma pessoa física ou pessoa jurídica até que a compra seja executada
* e os produtos do carrinho sejam passados para a compra
*/
public class Carrinho {
    
    private HashMap<Integer, Double> produtosDesejados;
    private HashMap<Integer, Integer> quantidade;
    
    private double total;
    
    public Carrinho(HashMap<Integer, Double> precos, HashMap<Integer, Integer> quantidade, double total) {
        this.produtosDesejados = precos;
        this.quantidade = quantidade;
        this.total = total;
    }
   
    public Carrinho()
    {
        produtosDesejados = new HashMap<>();
        quantidade = new HashMap<>();
        total = 0;
    }
    public HashMap<Integer,Double> getMapaPreco()
    {
        return produtosDesejados;
    }
    public HashMap<Integer,Integer> getQuantidade()
    {
        return this.quantidade;
    }
    public double getTotal()
    {
        return this.total;
    }
    
    public void carrinhoAdd(Produto _produto, Distribuidor _distribuidor, Usuario usuario, int qtt)
    {
        if(usuario instanceof PessoaJuridica)
        {
            double _preco = _produto.getPrecoDeCusto();
            produtosDesejados.put(_produto.getId(),_preco );
            total += _preco * qtt;
        }
        else
        {

            double _preco = _distribuidor.getPrecos().get(_produto.getId()); 
            produtosDesejados.put(_produto.getId(),_preco );
            total += _preco *qtt;
        }
        
        this.quantidade.put(_produto.getId(), this.quantidade.getOrDefault(_produto.getId(), 0) +qtt);
        return;
        /*
        if(quantidade.get(_produto) != null) quantidade.put(_produto.getId(), 1);
        else
        {
            int v = quantidade.get(_produto);
            quantidade.remove(_produto);
            v += 1;
            quantidade.put(_produto.getId(), v);
        } */
    }
    public void carrinhoRemove(Produto _produto, Distribuidor _distribuidor)
    {
        double _preco = _distribuidor.getPrecos().get(_produto.getId()); 
        produtosDesejados.remove(_produto.getId());
        
        int qtt = quantidade.get(_produto.getId());
        quantidade.remove(_produto.getId());
        total -= _preco * qtt;
    }
    
    public Double getPrecoProduto(int id) {
        return this.produtosDesejados.getOrDefault(id, 0.0);
    }
    
    public Integer getQttProduto(int id) {
        return this.quantidade.getOrDefault(id, 0);
    }

    @Override
    public String toString() {
        String ret = "";
        
        for (Map.Entry<Integer, Double> set: produtosDesejados.entrySet()) {
            String val = String.format("%.2f", set.getValue()).replace(",", ".");
            ret += String.format("%d;%s;%d", set.getKey(), val, quantidade.get(set.getKey())) + "&";
        }
        
        
        return ret;
    }
 
    
}
