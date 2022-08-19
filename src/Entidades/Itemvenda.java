/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Aluno
 */
public class Itemvenda {
     private int iditemvenda;
    private int idvenda;
    private int id;
    private int qtditem;
    private int totalitem;  

    public Itemvenda() {
    }

    

    public Itemvenda(int iditemvenda, int idvenda, int id, int qtditem, int totalitem) {
        this.iditemvenda = iditemvenda;
        this.idvenda = idvenda;
        this.id = id;
        this.qtditem = qtditem;
        this.totalitem = totalitem;
    }

    public int getIditemvenda() {
        return iditemvenda;
    }

    public void setIditemvenda(int iditemvenda) {
        this.iditemvenda = iditemvenda;
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtditem() {
        return qtditem;
    }

    public void setQtditem(int qtditem) {
        this.qtditem = qtditem;
    }

    public int getTotalitem() {
        return totalitem;
    }

    public void setTotalitem(int totalitem) {
        this.totalitem = totalitem;
    }
    
    
}
