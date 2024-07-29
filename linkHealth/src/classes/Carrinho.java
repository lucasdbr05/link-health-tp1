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
    private double total;
    private Usuario user;
    private int id;
    
    public Carrinho(Usuario _user, int _id)
    {
        user = _user;
        id = _id;
        produtosDesejados = new HashMap<>();
        total = 0;
    }
    
    public void carrinhoAdd(Produto _produto, Distribuidor _distribuidor)
    {
        double _preco = _distribuidor.getPrecos().get(_produto); 
        produtosDesejados.put(_produto,_preco );
        total += _preco;
    }
    public void carrinhoRemove(Produto _produto, Distribuidor _distribuidor)
    {
        double _preco = _distribuidor.getPrecos().get(_produto); 
        produtosDesejados.remove(_produto, _distribuidor);
        total -= _preco;
    }
 
    
}
