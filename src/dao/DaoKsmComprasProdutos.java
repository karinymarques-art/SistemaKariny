/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.KsmComprasProdutos;
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
public class DaoKsmComprasProdutos  extends DaoKsmAbstract {
     @Override
    //object é o pai de todos entao ksm comprasProdutos herda de object
    public void insert(Object object) {
        KsmComprasProdutos ksmComprasProdutos =(KsmComprasProdutos) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_comprasProdutos values (?,?,?,?,?,)";
           PreparedStatement pst = cnt.prepareStatement(sql);
      pst.setInt(1, ksmComprasProdutos.getKsmIdComprasProdutos());
    pst.setInt(2, ksmComprasProdutos.getKsmIdVeiculos());
    pst.setDouble(3, ksmComprasProdutos.getKsmValorUnitario());
    pst.setInt(4, ksmComprasProdutos.getKsmDesconto());
    pst.setInt(5, ksmComprasProdutos.getKsmQuantidade());      // pst.setDouble(9, ksmComprasProdutos.getKsmAtivo()); vai fazer assim quando for double
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
