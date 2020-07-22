/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Utils.Cache;

import rescateanimal.Models.Proveedor;

/**
 *
 * @author gtorr
 */
public class ProveedorCache {
    private static Proveedor proveedor;

    public static Proveedor getProveedor() {
        return proveedor;
    }

    public static void setProveedor(Proveedor prov) {
        ProveedorCache.proveedor = prov;
    }
}
