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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;
import rescateanimal.Models.Usuario;
import rescateanimal.Models.codigo_recuperacion;
import rescateanimal.Views.Login.Codigo_Confirmacion;
import rescateanimal.Models.Voluntario;

/**
 *
 * @author chris
 * git 
 */
public class ConexionLogin {

    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    private static PreparedStatement pStatement;
    private static CallableStatement callableStatement;

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "cearacely00";
    private static final String url = "jdbc:mysql://localhost:3306/refugio";
   
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
   

    public void addVoluntario(Voluntario voluntario) {
        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.callableStatement = this.con.prepareCall("{call proc_agregarVoluntario(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            
            this.callableStatement.setString(1, voluntario.getId());
            this.callableStatement.setString(2, voluntario.getNombre());
            this.callableStatement.setString(3, voluntario.getApellido());
            this.callableStatement.setDate(4, Date.valueOf(voluntario.getFechaNacimiento()));
            this.callableStatement.setString(5, voluntario.getNumTelefono());
            this.callableStatement.setString(6, voluntario.getCorreo());
            this.callableStatement.setDate(7, Date.valueOf(voluntario.getFechaInicio()));
            this.callableStatement.setDate(8, Date.valueOf(voluntario.getFechaFinal()));
            this.callableStatement.setInt(9, voluntario.getTurno());
            this.callableStatement.setInt(10, voluntario.getEstado());
            this.callableStatement.execute();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public ArrayList<Voluntario> getVoluntarios(String idEstado) {
        String estado = "";

        ArrayList<Voluntario> voluntarios = new ArrayList<>();

        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM voluntarios where id_estado = " + idEstado);
            while (rss.next()) {
                String ID_UNICO = rss.getString("id_voluntario");
                String ID = rss.getString("identidad_voluntario");
                String NOMBRE = rss.getString("nombre_voluntario");
                String APELLIDO = rss.getString("apellido_voluntario");
                String FECHA_NACIMIENTO = rss.getString("fecha_nacimiento");
                String NUMERO_TELEFONO = rss.getString("num_tel");
                String FECHA_INICIO = rss.getString("fecha_inicio");
                String FECHA_FINAL = rss.getString("fecha_final");
                String CORREO = rss.getString("correo_electronico");
                String ID_TURNO = rss.getString("id_tipo_turno");
                Integer ESTADO = rss.getInt("id_estado");

                voluntarios.add(new Voluntario(ID_UNICO, ID, NOMBRE, APELLIDO, LocalDate.parse(FECHA_NACIMIENTO), NUMERO_TELEFONO, CORREO, LocalDate.parse(FECHA_INICIO), LocalDate.parse(FECHA_FINAL), Integer.parseInt(ID_TURNO), ESTADO));
                estado = "Correcto";
            }
        } catch (SQLException e) {
            estado = "Error de conexion: " + e;
        }

        return voluntarios;
    }

    public ArrayList<Voluntario> getFiltroVoluntario(String filtro, String condicion) {
        String estado = "";

        ArrayList<Voluntario> voluntarios = new ArrayList<>();

        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM voluntarios where " + filtro + " = '" + condicion + "'");
            while (rss.next()) {
                String ID_UNICO = rss.getString("id_voluntario");
                String ID = rss.getString("identidad_voluntario");
                String NOMBRE = rss.getString("nombre_voluntario");
                String APELLIDO = rss.getString("apellido_voluntario");
                String FECHA_NACIMIENTO = rss.getString("fecha_nacimiento");
                String NUMERO_TELEFONO = rss.getString("num_tel");
                String FECHA_INICIO = rss.getString("fecha_inicio");
                String FECHA_FINAL = rss.getString("fecha_final");
                String CORREO = rss.getString("correo_electronico");
                String ID_TURNO = rss.getString("id_tipo_turno");
                Integer ESTADO = rss.getInt("id_estado");

                voluntarios.add(new Voluntario(ID_UNICO, ID, NOMBRE, APELLIDO, LocalDate.parse(FECHA_NACIMIENTO), NUMERO_TELEFONO, CORREO, LocalDate.parse(FECHA_INICIO), LocalDate.parse(FECHA_FINAL), Integer.parseInt(ID_TURNO), ESTADO));
                estado = "Correcto";
            }
        } catch (SQLException e) {
            estado = "Error de conexion: " + e;
        }

        return voluntarios;
    }

    public void updateVoluntario(Voluntario voluntario) {
        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.callableStatement = this.con.prepareCall("{call proc_actualizarVoluntario(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");

            this.callableStatement.setString(1, voluntario.getNombre());
            this.callableStatement.setString(2, voluntario.getApellido());
            this.callableStatement.setDate(3, Date.valueOf(voluntario.getFechaNacimiento()));
            this.callableStatement.setString(4, voluntario.getNumTelefono());
            this.callableStatement.setString(5, voluntario.getCorreo());
            this.callableStatement.setDate(6, Date.valueOf(voluntario.getFechaInicio()));
            this.callableStatement.setDate(7, Date.valueOf(voluntario.getFechaFinal()));
            this.callableStatement.setInt(8, voluntario.getTurno());
            this.callableStatement.setInt(9, voluntario.getEstado());
            this.callableStatement.setInt(10, Integer.parseInt(voluntario.getIdUnico()));
            this.callableStatement.execute();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
