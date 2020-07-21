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
public class codigo_recuperacion {
    private String codigo;
    private int usuario_id;

    public codigo_recuperacion(String codigo, int usuario_id) {
        this.codigo = codigo;
        this.usuario_id = usuario_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
}
