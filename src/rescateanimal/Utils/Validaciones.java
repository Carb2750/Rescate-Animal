/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Utils;

/**
 *
 * @author chris
 */
public class Validaciones {

    public Boolean validarNumeros(String num) {
        if (num.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    public Boolean validarLetras(String letras) {
        if (letras.matches("[a-zA-Z]+")) {
            return true;
        }
        return false;
    }

    public Boolean validarEmail(String email) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        if (email.matches(regex)) {
            return true;
        }
        return false;
    }
    
    public Boolean validarMaximo(Double num, int rangoMax) {
        if(num <= rangoMax) {
            return true;
        }
        return false;
    }

    public Boolean validarRango(Double num, int rangoMin, int rangoMax) {
        if (num >= rangoMin && num <= rangoMax) {
            return true;
        }
        return false;
    }
}
