/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal;

import java.awt.Event;
import java.awt.event.KeyEvent;
import rescateanimal.Models.Usuario;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputMap;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import rescateanimal.Controllers.ConexionLogin;
import rescateanimal.Models.codigo_recuperacion;

/**
 *
 * @author ELIETH COLINDRES
 */
public class Validar {
       
        public Boolean charExists(String res, String[] posibilities) {

        Boolean exists = false;
        
        for(int i = 0; i < posibilities.length; i++) {
            if(!res.equals(posibilities[i])) {
                exists = true;
            }
            else {
                return true;
            }
        }
        
        if(exists) {
            return false;
        }
        
        return false;
    }
     
    public Boolean isempty(String text){
        Boolean res=true;
        if(text.length()>0)
        {
            res=false;
        }
        return res;
    }
    
    public Boolean isReapeted(String text, String[] array, int index) {
        Boolean repeated = false;
        for(int i = 0; i < array.length; i++) {
            if(i != index) {
                if(array[i].equals(text)) {
                    repeated = true;
                }   
            }
        }
        
        return repeated;
    }
      /*  public Boolean textovacio(String texto) {
        Boolean vac = false;
        if(texto.length()<=0 ){
            vac=true;
        }
        return vac;
    }*/
      public Boolean Usuariomin(String usuario) {
        Boolean Umin = false;
        if(usuario.length()>3 ){
            Umin=true;
        }
        return Umin;
    }
       public Boolean Contramin(String contraseña) {
        Boolean Cmin = false;
        if(contraseña.length()>7 ){
            Cmin=true;
        }
        return Cmin;
    }
       
       public Boolean formatomail(String email){
         
           Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mather = pattern.matcher(email);

		//true==Valido
                return mather.find() ;
       }
        
        ArrayList<codigo_recuperacion> codigo_recuperacion; 
         ConexionLogin con = new ConexionLogin();
      public Boolean Existe_codigo(String generado){
         
            Boolean Veri=false;
            this.codigo_recuperacion = this.con.buscarCodigo();
         for(int i = 0; i < codigo_recuperacion.size(); i++) {
             //System.out.println(codigo_recuperacion.get(i).getCodigo());
                if(codigo_recuperacion.get(i).getCodigo().contains(generado)){
                    Veri=true;
                }
         }
         // System.out.println(Veri);
         return Veri;        
       }
      
       public void evitarPegar(JTextField campo) {
 
        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
 
        }
}
