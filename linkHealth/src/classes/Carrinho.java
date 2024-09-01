/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.HashMap;

/**
 *
 * @author psisn
 */
public class Carrinho {
    
    private HashMap<Integer, Double> produtosDesejados;
    private HashMap<Integer, Integer> quantidade;
    
    private double total;
   
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
    
    public void carrinhoAdd(Produto _produto, Distribuidor _distribuidor, Usuario usuario)
    {
        if(usuario instanceof PessoaJuridica)
        {
            double _preco = _produto.getPrecoDeCusto();
            produtosDesejados.put(_produto.getId(),_preco );
            total += _preco;
        }
        else
        {
            System.out.println(_distribuidor.getPrecos());
            System.out.println(_produto.getId());
            double _preco = _distribuidor.getPrecos().get(_produto.getId()); 
            produtosDesejados.put(_produto.getId(),_preco );
            total += _preco;
        }
        
        this.quantidade.put(_produto.getId(), this.quantidade.getOrDefault(_produto.getId(), 0) + _produto.getQuantidade());
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
        double _preco = _distribuidor.getPrecos().get(_produto); 
        produtosDesejados.remove(_produto, _distribuidor);
        total -= _preco;
        int v = quantidade.get(_produto);
        quantidade.remove(_produto);
        v -= 1;
        quantidade.put(_produto.getId(), v);
    }
 
    
}
