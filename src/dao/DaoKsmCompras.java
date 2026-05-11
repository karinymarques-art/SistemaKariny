/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.KsmCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author User
 */
public class DaoKsmCompras extends DaoKsmAbstract  {
      @Override
    //object é o pai de todos entao ksm compras herda de object
    public void insert(Object object) {
        KsmCompras ksmCompras =(KsmCompras) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_compras values (?,?,?,?,?,?,?)";
           PreparedStatement pst = cnt.prepareStatement(sql);
       pst.setInt(1, ksmCompras.getKsmIdCompras());
    pst.setInt(2, ksmCompras.getKsmIdUsuario());
    pst.setInt(3, ksmCompras.getKsmIdFornecedor());
    pst.setDate(4, null);
    pst.setString(5, ksmCompras.getKsmMetodoPagamento());
    pst.setDouble(6, ksmCompras.getKsmValorTotal());
    pst.setString(7, ksmCompras.getKsmAtivo());
      // pst.setDouble(9, ksmCompras.getKsmAtivo()); vai fazer assim quando for double
        pst.executeUpdate();
      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        
    }

    @Override
    public void delete(Object object) {
        
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
    
}
