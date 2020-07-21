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
import rescateanimal.Models.Usuario;
import rescateanimal.Models.codigo_recuperacion;
import rescateanimal.Views.Login.Codigo_Confirmacion;

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
    private static final String pass = "cearacely00";
    private static final String url = "jdbc:mysql://localhost:3306/refugio";
    private CallableStatement callableStatement;

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
    
    int cont=0;
    public ArrayList<Usuario> getUsuario() 
    {
        ArrayList<Usuario> Usuario = new ArrayList<Usuario>();

          try{
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM usuarios");
            while(rss.next()){
                Integer  ID= rss.getInt("id_usuario");
                String   usuario= rss.getString("usuario");
               
                Integer  rol = rss.getInt("id_rol");
                String   correo= rss.getString("correo_electronico");

              Usuario.add(new Usuario(ID,rol, usuario, correo));
               cont++;
               // estado="Correcto";
    
               
            }
             
            }
            catch (SQLException e){
                System.out.println(e);
                //estado="Error de conexion: " + e;
            }
           return Usuario;
    }
     public ArrayList<codigo_recuperacion> buscarCodigo() {
         ArrayList<codigo_recuperacion> codigo_recuperacion = new ArrayList<codigo_recuperacion>();
         int cont=0;
           try{
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM codigos_recuperacion");
            
            while(rss.next()){
                 String   cod= rss.getString("codigo_recuperacion");
                Integer  idU = rss.getInt("id_usuario");

            codigo_recuperacion.add(new codigo_recuperacion(cod,idU));
               cont++;
               // estado="Correcto";
               
            }
              
            }
            catch (SQLException e){
                System.out.println(e);
                //estado="Error de conexion: " + e;
            }
          
         return codigo_recuperacion;
    }
     public void insertarCodigo(String codigo, Integer id_usuario) {
            try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
           
              this.callableStatement = this.con.prepareCall("{call proc_agregarcodigo_recuperacion(?, ?)}");
            this.callableStatement.setString(1,  codigo);
            this.callableStatement.setInt(2, id_usuario);

            this.callableStatement.execute();
            
        }catch(SQLException e) {
            System.err.println(e);
        }   
    }
         
    public boolean validlog(String user , String pass) {
        
        boolean var=false ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
           this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            Statement stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM  refugio.usuarios WHERE usuario='"+user+"' && contraseña=MD5('"+pass+"')");
           
            if(rss.next()){
                var=true;
                
            }
            else{
                var=false;
            }
            con.close();
        }
        catch (ClassNotFoundException | NumberFormatException | SQLException e){
        System.err.println("Error:" +e);
           
        }
        //return true;
      //  System.out.println(var);
        return var;
    }
   
    
}
