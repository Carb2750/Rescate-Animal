/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Models;

/**
 *
 * @author ELIETH COLINDRES
 */
public class Usuario {
         private Integer ID,rol;
     private String usuario,correo;

    public Usuario(Integer ID, Integer rol, String usuario, String correo) {
        this.ID = ID;
        this.rol = rol;
        this.usuario = usuario;
        this.correo = correo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
