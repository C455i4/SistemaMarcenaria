/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidades.Produto;
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
public class produtoDAO {
     private static String SQL_INSERT ="INSERT INTO produto (descricao,preco,quant) VALUES (?,?,?)";
    private static String SQL_UPDATE="UPDATE produto SET descricao=?,preco=?,quant=? WHERE id=?";
    private static String SQL_DELETE = "DELETE FROM produto WHERE id=?";
    private static String SQL_SELECT = "SELECT * FROM produto";
    
    public static int cadastrar(Produto usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT);
        
            stmt.setString(1, usu.getDescricao());
            stmt.setDouble(2, usu.getPreco());
            stmt.setInt(3, usu.getQuant());
            
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return result;
}
    public static int alterar(Produto usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);
           
            stmt.setString(1, usu.getDescricao());
            stmt.setDouble(2, usu.getPreco());
            stmt.setInt(3, usu.getQuant());
            stmt.setInt(4,usu.getId());
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rs   ;
}
    
}
