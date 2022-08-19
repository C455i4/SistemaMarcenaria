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
public class Cliente {
    private int id;
    private String nome;
    private String endereço;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int id, String nome, String endereço, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Cliente)obj).getId();
    }
}
