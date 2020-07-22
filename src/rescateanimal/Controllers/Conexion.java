package rescateanimal.Controllers;

import com.mysql.jdbc.Connection;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import rescateanimal.Models.Proveedor;

public class Conexion {
    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    private static PreparedStatement pStatement;
    private static CallableStatement callableStatement;
    
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="emma63194";
    private static final String url="jdbc:mysql://localhost:3306/refugio";
    
    public String conector() {
        String estado="";
        con=null;
        try{
            Class.forName(driver);
            con= (Connection) DriverManager.getConnection(url, user, pass);
            if (con!=null){
                estado= "Conexion establecida";
            }
        }
        catch (ClassNotFoundException | SQLException e){
            estado= ""+e;
        }
        return estado;
    }
    
    public ArrayList<Proveedor> getProveedores() {
        String estado = "";

        ArrayList<Proveedor> prov = new ArrayList<>();

        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM proveedor");
            while (rss.next()) {
                String Id = rss.getString("id_proveedor");
                String Nombre = rss.getString("nombre_proveedor");
                String Apellido = rss.getString("apellido_proveedor");
                String Telefono = rss.getString("numero_tel_proveedor");
                String Correo = rss.getString("correo_elec_proveedor");
                String NomEmpresa = rss.getString("nombre_empresa");
                String Direccion = rss.getString("direccion");
                String Rtn = rss.getString("rtn");

                prov.add(new Proveedor(Id, Nombre, Apellido, Telefono, Correo, NomEmpresa, Direccion, Rtn));
                estado = "Correcto";
            }
        } catch (SQLException e) {
            estado = "Error de conexion: " + e;
        }

        return prov;
    }
    
    public void insertProveedor(Proveedor pro) {
        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.callableStatement = this.con.prepareCall("{call AgregarProveedor(?, ?, ?, ?, ?, ?, ?)}");

            this.callableStatement.setString(1, pro.getNombre());
            this.callableStatement.setString(2, pro.getApellido());
            this.callableStatement.setString(3, pro.getTelefono());
            this.callableStatement.setString(4, pro.getCorreo());
            this.callableStatement.setString(5, pro.getEmpresa());
            this.callableStatement.setString(6, pro.getDireccion());
            this.callableStatement.setString(7, pro.getRtn());

            this.callableStatement.execute();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public ArrayList<Proveedor> getFiltroProveedor(String filtro, String condicion) {
        String estado = "";

        ArrayList<Proveedor> prove = new ArrayList<>();

        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM proveedor where " + filtro + " = '" + condicion + "'");
            while (rss.next()) {
                String Id = rss.getString("id_proveedor");
                String Nombre = rss.getString("nombre_proveedor");
                String Apellido = rss.getString("apellido_proveedor");
                String Telefono = rss.getString("numero_tel_proveedor");
                String Correo = rss.getString("correo_elec_proveedor");
                String NomEmpresa = rss.getString("nombre_empresa");
                String Direccion = rss.getString("direccion");
                String Rtn = rss.getString("rtn");

                prove.add(new Proveedor(Id, Nombre, Apellido, Telefono, Correo, NomEmpresa, Direccion, Rtn));
                estado = "Correcto";
            }
        } catch (SQLException e) {
            estado = "Error de conexion: " + e;
        }

        return prove;
    }
    
    public void UpdateProveedor(Proveedor pro) {
        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.callableStatement = this.con.prepareCall("{call UpdateProveedor(?, ?, ?, ?, ?, ?, ?, ?)}");

            this.callableStatement.setString(1, pro.getId());
            this.callableStatement.setString(2, pro.getNombre());
            this.callableStatement.setString(3, pro.getApellido());
            this.callableStatement.setString(4, pro.getTelefono());
            this.callableStatement.setString(5, pro.getCorreo());
            this.callableStatement.setString(6, pro.getEmpresa());
            this.callableStatement.setString(7, pro.getDireccion());
            this.callableStatement.setString(8, pro.getRtn());

            this.callableStatement.execute();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
