/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import solitto.trabalho.Cliente;

/**
 *
 * @author Alisson Solitto
 */
public class JDBConnection {

    public static Connection getConnection(String servidor, String banco, String usuario, String senha) {
        String strCon = "jdbc:mysql://" + servidor + "/" + banco;
        try {
            return DriverManager.getConnection(strCon, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setCliente(Cliente c) {
        try {
            
            Connection con = getConnection("localhost", "CRUD_JAVA", "admin", "admin");

            String sql = "insert into clientes"
                    + " (nome,endereco,numero,e_mail,telefone)"
                    + " values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getNum());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getTelefone());

            stmt.execute();
            stmt.close();
            
            con.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
        public static void updCliente(Cliente c) {
        try {
            
            Connection con = getConnection("localhost", "CRUD_JAVA", "admin", "admin");

            String sql = "insert into clientes"
                    + " (nome,endereco,numero,e_mail,telefone)"
                    + " values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getNum());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getTelefone());

            stmt.execute();
            stmt.close();
            
            con.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
