/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author flavio
 */
public class ConnectionFactory {
    public Connection Conexao() throws Exception
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/sistema?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Classe: ConnectionFactory" + erro.getMessage());
        }
        return conn;
    }
}
