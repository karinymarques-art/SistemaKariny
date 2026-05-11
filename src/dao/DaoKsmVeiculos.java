/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.KsmVeiculos;
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
public class DaoKsmVeiculos extends DaoKsmAbstract{
     @Override
    //object é o pai de todos entao ksm veiculos herda de object
    public void insert(Object object) {
        KsmVeiculos ksmVeiculos =(KsmVeiculos) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_veiculos values (?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement pst = cnt.prepareStatement(sql);
 pst.setInt(1, ksmVeiculos.getKsmCodigo());
    pst.setString(2, ksmVeiculos.getKsmStatus());
    pst.setString(3, ksmVeiculos.getKsmMarca());
    pst.setString(4, ksmVeiculos.getKsmModelo());
    pst.setInt(5, ksmVeiculos.getKsmAno());
    pst.setString(6, ksmVeiculos.getKsmCor());
    pst.setString(7, ksmVeiculos.getKsmPlaca());
    pst.setString(8, ksmVeiculos.getKsmChassi());
    pst.setDouble(9, ksmVeiculos.getKsmValorCompra());
    pst.setDouble(10, ksmVeiculos.getKsmValorVenda());

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
