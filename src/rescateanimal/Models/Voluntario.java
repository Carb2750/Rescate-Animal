/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chris
 */
public class Voluntario {

    private String idUnico;
    private String id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String numTelefono;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private String correo;
    private int turno;
    private int estado;

    public Voluntario(String idUnico, String id, String nombre, String apellido, LocalDate fechaNacimiento, String numTelefono, String correo, LocalDate fechaInicio, LocalDate fechaFinal, int turno, int estado) {
        this.idUnico = idUnico;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numTelefono = numTelefono;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.correo = correo;
        this.turno = turno;
        this.estado = estado;
    }

    public static String getNamedTurno(int idTurno) {
        if(idTurno == 1) {
            return "Diurno";
        }
        return "Nocturno";
    }
    
    public static Integer getIdTurno(String turno) {
        if(turno.equalsIgnoreCase("Diurno")) {
            return 1;
        }
        return 2;
    }
    
    public static String getParseId(String id) {
        String parsedId;
        parsedId = id.substring(0, 4) + "-" + id.substring(4, 8) + "-" + id.substring(8, 13);
        return parsedId;
    }
    
    public static String fromParseId(String parsedId) {
        String id;
        id = parsedId.replaceAll("-", "");
        return id;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTurno() {
        return turno;
    }

    public int getEstado() {
        return estado;
    }
}
