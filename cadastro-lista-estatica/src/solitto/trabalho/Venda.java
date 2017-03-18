/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitto.trabalho;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aliss_000
 */
public class Venda {
    
    Cliente c = new Cliente();
    List itens = new LinkedList<Produto>();

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public List getItens() {
        return itens;
    }

    public void setItens(List itens) {
        this.itens = itens;
    }
    
    
    
}
