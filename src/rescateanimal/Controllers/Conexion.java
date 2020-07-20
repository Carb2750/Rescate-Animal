/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Controllers;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ELIETH COLINDRES
 */
public class Conexion {

    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    private static PreparedStatement pStatement;

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/refugio";

    public String conector() {
        String estado = "";
        con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
                estado = "Conexion establecida";
            }
        } catch (ClassNotFoundException | SQLException e) {
            estado = "" + e;
        }
        return estado;
    }
}
