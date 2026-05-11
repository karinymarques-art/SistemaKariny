/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.KsmFuncionarios;
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
public class DaoKsmFuncionarios extends DaoKsmAbstract{
    @Override
    //object é o pai de todos entao ksm funcionarios herda de object
    public void insert(Object object) {
        KsmFuncionarios ksmFuncionarios =(KsmFuncionarios) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_funcionarios values (?,?,?,?,?,?,?,?,?,)";
       PreparedStatement pst = cnt.prepareStatement(sql);
 pst.setInt(1, ksmFuncionarios.getKsmCodigo());
pst.setString(2, ksmFuncionarios.getKsmNome());
pst.setString(3, ksmFuncionarios.getKsmRg());
pst.setString(4, ksmFuncionarios.getKsmEmail());
pst.setString(5, ksmFuncionarios.getKsmCargo());
pst.setString(6, ksmFuncionarios.getKsmTelefone());
pst.setDouble(7, ksmFuncionarios.getKsmSalario());
pst.setString(8, ksmFuncionarios.getKsmCpf());
pst.setString(9, ksmFuncionarios.getKsmAtivo());


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
