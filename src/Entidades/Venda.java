/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Aluno
 */
public class Venda {
    private int idvenda;
    private int idcliente;
    private LocalDate data;
    private LocalTime hora;

    public Venda(int idvenda, int idcliente, LocalDate data, LocalTime hora) {
        this.idvenda = idvenda;
        this.idcliente = idcliente;
        this.data = data;
        this.hora = hora;
    }

    public Venda() {
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    
    @Override
    public  String toString(){
        return data + "" + hora;
    }
    @Override
    public boolean equals(Object obj) {
   String venda = this.data+""+this.hora;
    if(venda.equals(obj.toString())){
    return true;
    }
    else{
    return false;
 }
 }
}
