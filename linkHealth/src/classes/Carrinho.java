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
    
    private HashMap<Produto, Double> produtosDesejados;
    private HashMap<Produto, Integer> quantidade;
    
    private double total;
    private Usuario user;
   
    public Carrinho(Usuario _user, int _id)
    {
        user = _user;     
        produtosDesejados = new HashMap<>();
        total = 0;
    }
    
    public void carrinhoAdd(Produto _produto, Distribuidor _distribuidor)
    {
        double _preco = _distribuidor.getPrecos().get(_produto); 
        produtosDesejados.put(_produto,_preco );
        total += _preco;
        quantidade.merge(_produto, 1, (a,b) -> a + b);
    }
    public void carrinhoRemove(Produto _produto, Distribuidor _distribuidor)
    {
        double _preco = _distribuidor.getPrecos().get(_produto); 
        produtosDesejados.remove(_produto, _distribuidor);
        total -= _preco;
        int v = quantidade.get(_produto);
        quantidade.remove(_produto);
        v += 1;
        quantidade.put(_produto, v);
    }
 
    
}
