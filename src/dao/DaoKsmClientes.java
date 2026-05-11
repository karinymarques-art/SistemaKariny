/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.KsmClientes;
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
public class DaoKsmClientes  extends DaoKsmAbstract {
    @Override
    //object é o pai de todos entao ksm clientes herda de object
    public void insert(Object object) {
        KsmClientes ksmClientes =(KsmClientes) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(1, ksmClientes.getKsmIdClientes());
            pst.setString(2, ksmClientes.getKsmNome());
            pst.setString(3, ksmClientes.getKsmApelido());
            pst.setString(4, ksmClientes.getKsmCpf());
            pst.setString(5, ksmClientes.getKsmRg());
            pst.setDate(6, null); // ksmDataNasc (Tratar conforme necessário)
            pst.setInt(7, ksmClientes.getKsmNivel());
            pst.setString(8, ksmClientes.getKsmEmail());
            pst.setString(9, ksmClientes.getKsmCelular());
            pst.setString(10, ksmClientes.getKsmCep());
            pst.setString(11, ksmClientes.getKsmLogradouro());
            pst.setString(12, ksmClientes.getKsmNumero());
            pst.setString(13, ksmClientes.getKsmBairro());
            pst.setString(14, ksmClientes.getKsmCidade());
            pst.setString(15, ksmClientes.getKsmAtivo());
      
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


