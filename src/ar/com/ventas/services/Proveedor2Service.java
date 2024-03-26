/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.services;

import ar.com.ventas.bo.Proveedor2Bo;
import ar.com.ventas.entities.Proveedor2;
import ar.com.ventas.util.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mcvalls
 */
public class Proveedor2Service {

    public Proveedor2 saveProveedor(Proveedor2 proveedor) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            proveedor = new Proveedor2Bo().saveProveedor(proveedor);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return proveedor;
    }

    public Proveedor2 getProveedorByCodigo(Integer codigo) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Proveedor2 proveedor = null;
        try {
            proveedor = new Proveedor2Bo().getProveedorByCodigo(codigo);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return proveedor;
    }

    public List<Proveedor2> getProveedoresActivos() throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Proveedor2> proveedores = null;
        try {
            proveedores = new Proveedor2Bo().getProveedoresActivos();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return proveedores;
    }
    
    public List<Proveedor2> getProveedoresActivosOrdenNombre() throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Proveedor2> proveedores = null;
        try {
            proveedores = new Proveedor2Bo().getProveedoresActivosOrdenNombre();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return proveedores;
    }
}
