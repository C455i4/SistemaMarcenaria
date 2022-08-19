 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Miriam
 */
public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private int quant;

    public Produto() {
    }

    public Produto(int id, String descricao, double preco, int quant) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

   
  
    @Override
    public String toString() {
        return descricao + "" + quant;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Produto)obj).getId();
    }
    
}
