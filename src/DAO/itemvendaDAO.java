/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Itemvenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class itemvendaDAO {
    private static String SQL_INSERT ="INSERT INTO itemvenda (idvenda,id,qtditem, totalitem) VALUES (?,?,?,?)";
    private static String SQL_UPDATE="UPDATE itemvenda SET idvenda=? ,id=?, qtditem=? ,totalitem=? WHERE iditemvenda=?";
    private static String SQL_DELETE = "DELETE FROM itemvenda WHERE iditemvenda=?";
    private static String SQL_SELECT = "SELECT * FROM itemvenda";
     private static String SQL_SELECT2 = "SELECT * FROM itemvenda WHERE iditemvenda=?";
    
    
    public static int cadastrar(Itemvenda usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT);
            stmt.setInt(1, usu.getIdvenda());
            stmt.setInt(2, usu.getId());
            stmt.setInt(3, usu.getQtditem());
            stmt.setInt(4, usu.getTotalitem());
            
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(itemvendaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return result;
}
    public static int alterar(Itemvenda usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);
             stmt.setInt(1, usu.getIdvenda());
            stmt.setInt(2, usu.getId());
            stmt.setInt(3, usu.getQtditem());
            stmt.setInt(4, usu.getTotalitem());
            
            stmt.setInt(5,usu.getIditemvenda());
           
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(itemvendaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(itemvendaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(itemvendaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rs   ;
}
    
}
