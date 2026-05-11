/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bean.KsmFornecedores;
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
public class DaoKsmFornecedores extends DaoKsmAbstract {
     @Override
    //object é o pai de todos entao ksm fornecedores herda de object
    public void insert(Object object) {
        KsmFornecedores ksmFornecedores =(KsmFornecedores) object;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_kariny_marques";
            user="kariny_marques";
            password="kariny_marques";
            Connection cnt;
            cnt=DriverManager.getConnection(url, user, password);
           String sql = "insert into ksm_fornecedores values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement pst = cnt.prepareStatement(sql);
       pst.setInt(1, ksmFornecedores.getKsmCodigo());
pst.setString(2, ksmFornecedores.getKsmCnpj());
pst.setString(3, ksmFornecedores.getKsmEmail());
pst.setString(4, ksmFornecedores.getKsmEndereco());
pst.setString(5, ksmFornecedores.getKsmNome());
pst.setString(6, ksmFornecedores.getKsmTelefone());
pst.setString(7, ksmFornecedores.getKsmNumero());
pst.setString(8, ksmFornecedores.getKsmRazao());
pst.setString(9, ksmFornecedores.getKsmCelular());
pst.setString(10, ksmFornecedores.getKsmBairro());
pst.setString(11, ksmFornecedores.getKsmInscricao());
pst.setString(12, ksmFornecedores.getKsmCep());
pst.setString(13, ksmFornecedores.getKsmCidade());
pst.setString(14, ksmFornecedores.getKsmResponsavel());
pst.setString(15, ksmFornecedores.getKsmAtivo());

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