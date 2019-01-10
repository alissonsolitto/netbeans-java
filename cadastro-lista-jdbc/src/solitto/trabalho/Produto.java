/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitto.trabalho;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author aliss_000
 */
public class Produto {
    
    private String descricao;

    public static final String PROP_DESCRICAO = "descricao";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
    }

    private String categoria;

    public static final String PROP_CATEGORIA = "categoria";

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        propertyChangeSupport.firePropertyChange(PROP_CATEGORIA, oldCategoria, categoria);
    }

    private String marca;

    public static final String PROP_MARCA = "marca";

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        propertyChangeSupport.firePropertyChange(PROP_MARCA, oldMarca, marca);
    }

    private int estoque;

    public static final String PROP_ESTOQUE = "estoque";

    public int getEstoque() {
        return estoque;
    }
    
    @Override
    public String toString()
    {
        return "Descrição: " + this.descricao + " Estoque: " + this.estoque;
    }    
    

    public void setEstoque(int estoque) {
        int oldEstoque = this.estoque;
        this.estoque = estoque;
        propertyChangeSupport.firePropertyChange(PROP_ESTOQUE, oldEstoque, estoque);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    

    
}
