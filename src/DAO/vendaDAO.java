/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class vendaDAO {
    private static String SQL_INSERT ="INSERT INTO venda (idcliente,data,hora) VALUES (?,?,?)";
    private static String SQL_UPDATE="UPDATE venda SET idcliente=?,data=? , hora=?  WHERE idvenda=?";
    private static String SQL_DELETE = "DELETE FROM venda WHERE idvenda=?";
    private static String SQL_SELECT = "SELECT * FROM venda";
   private static String SQL_SELECT2 = "SELECT * FROM venda WHERE idvenda=?";
    
    public static int cadastrar(Venda usu){
        Connection con = BDConexao.getConnection();
        int result =0;
         int idGerado = -1;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT,Statement.RETURN_GENERATED_KEYS);
             stmt.setInt(1, usu.getIdcliente());
            stmt.setString(2, usu.getData().toString());
            stmt.setString(3, usu.getHora().toString());
            
            result =stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                idGerado=rs.getInt(1);
            }
            rs.close(); 
            
        } catch (SQLException ex) {
             Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return   idGerado;
}
    public static int alterar(Venda usu){
        Connection con = BDConexao.getConnection();
        int result =0;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_UPDATE);
             stmt.setInt(1, usu.getIdcliente());
            stmt.setString(2, usu.getData().toString());
            stmt.setString(3, usu.getHora().toString());
            stmt.setInt(4,usu.getIdvenda());
            
            result =stmt.executeUpdate();
            
        } catch (SQLException ex) {
             Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rs   ;
}
  /*  
    public static  ResultSet consulta2(int id){
        Venda vd = new Venda();
        Connection con = BDConexao.getConnection();
        ResultSet rs =null;
        
        try{
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT2);
            stmt.setInt(1,id);
            
            rs =stmt.executeQuery();
            rs.next();
            vd.setIdvenda(rs.getInt("idvenda"));
            vd.setData(rs.getString("data"));
            vd.setHora(rs.getString("hora"));
            
            return vd;
            
        } catch (SQLException ex) {
             Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return vd  ;
}
   */ 
}
