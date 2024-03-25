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

//    public Domicilio2 updateDomicilio(Domicilio2 domicilio) throws Exception {
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Transaction tx = session.beginTransaction();
//
//        try {
//            domicilio = new Domicilio2BO().updateDomicilio(domicilio);
//            tx.commit();
//        } catch (Exception ex) {
//            tx.rollback();
//            throw new Exception(ex);
//        }
//
//        return domicilio;
//    }
//
//    public List<Domicilio2> getAllDomicilio() throws Exception {
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        List<Domicilio2> domicilios = null;
//        try {
//            domicilios = new Domicilio2BO().getAllDomicilios();
//            tx.commit();
//        } catch (Exception ex) {
//            tx.rollback();
//            throw new Exception(ex);
//        }
//        return domicilios;
//    }
}
