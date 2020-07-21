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
import rescateanimal.Models.Voluntario;

/**
 *
 * @author chris
 * git 
 */
public class Conexion {

    private static Connection con;
    private static Statement stm;
    private static ResultSet rss;
    private static PreparedStatement pStatement;

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "admin2750";
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

    public void addVoluntario(Voluntario voluntario) {
        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.pStatement = this.con.prepareStatement("INSERT INTO voluntarios(identidad_voluntario, nombre_voluntario, apellido_voluntario, fecha_nacimiento, num_tel, correo_electronico, fecha_inicio, fecha_final, id_tipo_turno, id_estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            this.pStatement.setString(1, voluntario.getId());
            this.pStatement.setString(2, voluntario.getNombre());
            this.pStatement.setString(3, voluntario.getApellido());
            this.pStatement.setDate(4, Date.valueOf(voluntario.getFechaNacimiento()));
            this.pStatement.setString(5, voluntario.getNumTelefono());
            this.pStatement.setString(6, voluntario.getCorreo());
            this.pStatement.setDate(7, Date.valueOf(voluntario.getFechaInicio()));
            this.pStatement.setDate(8, Date.valueOf(voluntario.getFechaFinal()));
            this.pStatement.setInt(9, voluntario.getTurno());
            this.pStatement.setInt(10, voluntario.getEstado());
            this.pStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public ArrayList<Voluntario> getVoluntarios() {
        String estado = "";

        ArrayList<Voluntario> voluntarios = new ArrayList<>();

        try {
            this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.stm = con.createStatement();
            this.rss = stm.executeQuery("SELECT * FROM voluntarios where id_estado = 1");
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
            this.pStatement = this.con.prepareStatement("UPDATE voluntarios SET nombre_voluntario = ? , apellido_voluntario = ? , fecha_nacimiento = ? , num_tel = ? , correo_electronico = ? , fecha_inicio = ? , fecha_final = ?, id_tipo_turno = ?, id_estado = ? WHERE id_voluntario = " + voluntario.getIdUnico());
            this.pStatement.setString(1, voluntario.getNombre());
            this.pStatement.setString(2, voluntario.getApellido());
            this.pStatement.setDate(3, Date.valueOf(voluntario.getFechaNacimiento()));
            this.pStatement.setString(4, voluntario.getNumTelefono());
            this.pStatement.setString(5, voluntario.getCorreo());
            this.pStatement.setDate(6, Date.valueOf(voluntario.getFechaInicio()));
            this.pStatement.setDate(7, Date.valueOf(voluntario.getFechaFinal()));
            this.pStatement.setInt(8, voluntario.getTurno());
            this.pStatement.setInt(9, voluntario.getEstado());
            this.pStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
