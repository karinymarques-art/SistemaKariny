/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.KsmUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author u08766083141
 */
public class DaoKsmUsuarios  extends DaoKsmAbstract{
    @Override
    //object é o pai de todos entao ksm usuarios herda de object
    public void insert(Object object) {
        KsmUsuarios ksmUsuarios =(KsmUsuarios) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_usuarios values (?,?,?,?,?,?,?,?)";
       PreparedStatement pst = cnt.prepareStatement(sql);
       pst.setInt(1,ksmUsuarios.getKsmIdUsuarios());
       pst.setString(2, ksmUsuarios.getKsmNome());
       pst.setString(3, ksmUsuarios.getKsmApelido());
       pst.setString(4, ksmUsuarios.getKsmCpf());
       pst.setDate(5, null);//ksm_datanascimento USAR EM TODOS OS CAMPOS QUE USE DATE****
       pst.setInt(6, ksmUsuarios.getKsmNivel());
       pst.setString(7, ksmUsuarios.getKsmSenha());
       pst.setString(8, ksmUsuarios.getKsmAtivo());
      // pst.setDouble(9, ksmUsuarios.getKsmAtivo()); vai fazer assim quando for double
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
