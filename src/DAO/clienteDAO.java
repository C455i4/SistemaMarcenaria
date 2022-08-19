/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Cliente;
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
public class clienteDAO {
    private static String SQL_INSERT ="INSERT INTO cliente (nome,endereço,email, telefone) VALUES (?,?,?,?)";
    private static String SQL_UPDATE="UPDATE cliente SET nome=? , endereço=? ,email=?, telefone=? WHERE id=?";
    private static String SQL_DELETE = "DELETE FROM cliente WHERE id=?";
    private static String SQL_SELECT = "SELECT * FROM cliente";
    
    public static int cadastrar(Cliente usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT);
            stmt.setString(1, usu.getNome());
            stmt.setString(2, usu.getEndereço());
            stmt.setString(3, usu.getEmail());
            stmt.setString(4, usu.getTelefone());
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return result;
}
    public static int alterar(Cliente usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usu.getNome());
            stmt.setString(2, usu.getEndereço());
            stmt.setString(3, usu.getEmail());
            stmt.setString(4, usu.getTelefone());
            stmt.setInt(5,usu.getId());
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rs   ;
}
    
}
