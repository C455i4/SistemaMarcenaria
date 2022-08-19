/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidades.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miriam
 */
public class funcionariosDAO {
     private static String SQL_INSERT ="INSERT INTO funcionarios (nome,endereco,cargo, telefone,salario) VALUES (?,?,?,?,?)";
    private static String SQL_UPDATE="UPDATE funcionarios SET nome=?, endereco=? , cargo=? ,telefone=?, salario=? WHERE id=?";
    private static String SQL_DELETE = "DELETE FROM funcionarios WHERE id=?";
    private static String SQL_SELECT = "SELECT * FROM funcionarios";
    
    public static int cadastrar(Funcionarios usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, usu.getNome());
            stmt.setString(2, usu.getEndereco());
             stmt.setString(3, usu.getCargo());
            stmt.setString(4, usu.getTelefone());
            stmt.setString(5,usu.getSalario());
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(funcionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return result;
}
    public static int alterar(Funcionarios usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usu.getNome());
            stmt.setString(2, usu.getEndereco());
             stmt.setString(3, usu.getCargo());
            stmt.setString(4, usu.getTelefone());
            stmt.setString(5,usu.getSalario());

            stmt.setInt(6,usu.getId());
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(funcionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return result;
}
    public static int excluir(int id){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE);
            stmt.setInt(1,id);
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(funcionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return result;
}
    public static  ResultSet consulta(){
        Connection con = BDConexao.getConnection();
        ResultSet rs =null;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT);
            
            
            rs =stmt.executeQuery();
            
        } catch (SQLException ex) {
             Logger.getLogger(funcionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rs   ;
}
    
}
