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

    public String getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
