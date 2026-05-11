/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.KsmVendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;
/**
 *
 * @author User
 */
public class DaoKsmVendas  extends DaoKsmAbstract{
    @Override
    //object é o pai de todos entao ksm vendas herda de object
    public void insert(Object object) {
        KsmVendas ksmVendas =(KsmVendas) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_vendas values (?,?,?,?,?,?,?)";
           PreparedStatement pst = cnt.prepareStatement(sql);
       pst.setInt(1, ksmVendas.getKsmIdVendas());
    pst.setDate(2, null); // Para datetime
    pst.setInt(3, ksmVendas.getKsmFkClientes());
    pst.setInt(4, ksmVendas.getKsmFkUsuario());
    pst.setString(5, ksmVendas.getKsmFormaPagamento());
    pst.setDouble(6, ksmVendas.getKsmValorTotal());
    pst.setString(7, ksmVendas.getKsmObservacoes());
      // pst.setDouble(9, ksmVendas.getKsmAtivo()); vai fazer assim quando for double
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
