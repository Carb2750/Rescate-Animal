/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Utils.Cache;

import java.time.LocalDate;
import rescateanimal.Models.Voluntario;

/**
 *
 * @author chris
 */
public class Cache {

    private static Voluntario voluntario;

    public static Voluntario getVoluntario() {
        return voluntario;
    }

    public static void setVoluntario(Voluntario voluntario) {
        Cache.voluntario = voluntario;
    }
}
