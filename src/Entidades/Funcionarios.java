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
public class Funcionarios {
    private int id;
    private String cargo;
    private String nome;
    private String endereco;
    private String telefone;
    private String salario;

    public Funcionarios() {
    }

    public Funcionarios(int id, String cargo, String nome, String endereco, String telefone, String salario) {
        this.id = id;
        this.cargo = cargo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

   
    
    
}
