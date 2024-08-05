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
    private Usuario usuario;

   
    public Carrinho(Usuario _user)
    {
        usuario = _user;
        produtosDesejados = new HashMap<>();
        total = 0;
    }
    
    public void carrinhoAdd(Produto _produto, Distribuidor _distribuidor, int _quantidade)
    {
        if(usuario instanceof PessoaJuridica)
        {
            double _preco = _produto.getPrecoDeCusto();
            produtosDesejados.put(_produto,_preco );
            total += _preco;
        }
        else
        {
            double _preco = _distribuidor.getPrecos().get(_produto); 
            produtosDesejados.put(_produto,_preco );
            total += _preco;
        }
        
        if(quantidade.get(_produto) != null) quantidade.put(_produto, 1);
        else
        {
            int v = quantidade.get(_produto);
            quantidade.remove(_produto);
            v += 1;
            quantidade.put(_produto, v);
        }
    }
    public void carrinhoRemove(Produto _produto, Distribuidor _distribuidor)
    {
        double _preco = _distribuidor.getPrecos().get(_produto); 
        produtosDesejados.remove(_produto, _distribuidor);
        total -= _preco;
        int v = quantidade.get(_produto);
        quantidade.remove(_produto);
        v -= 1;
        quantidade.put(_produto, v);
    }
 
    
}
