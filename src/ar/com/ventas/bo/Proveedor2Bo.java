/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.Proveedor2Dao;
import ar.com.ventas.entities.Proveedor2;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class Proveedor2Bo {

    private final Proveedor2Dao dao = new Proveedor2Dao();

    public Proveedor2 saveProveedor(Proveedor2 proveedor) throws Exception {
        Proveedor2 prov = null;
        try {
            prov = (Proveedor2) dao.save(proveedor);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return prov;
    }

    public Proveedor2 getProveedorByCodigo(Integer codigo) throws Exception {
        Proveedor2 proveedor;
        try {
            proveedor = (Proveedor2) dao.getProveedorByCodigo(codigo);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return proveedor;
    }

    public List<Proveedor2> getProveedoresActivos() throws Exception {
        List<Proveedor2> proveedores;
        try {
            proveedores = (List<Proveedor2>) dao.getProveedoresActivos();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return proveedores;
    }

    public List<Proveedor2> getProveedoresActivosOrdenNombre() throws Exception {
        List<Proveedor2> proveedores;
        try {
            proveedores = (List<Proveedor2>) dao.getProveedoresActivosOrdenNombre();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return proveedores;
    }
}
