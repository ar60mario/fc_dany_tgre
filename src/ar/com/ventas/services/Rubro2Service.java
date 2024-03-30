/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.services;

import ar.com.ventas.bo.Rubro2Bo;
import ar.com.ventas.entities.Rubro2;
import ar.com.ventas.util.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mcvalls
 */
public class Rubro2Service {

    public Rubro2 saveRubro(Rubro2 rubro) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            rubro = new Rubro2Bo().saveRubro(rubro);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubro;
    }
    
    public Rubro2 updateRubro(Rubro2 rubro) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            rubro = new Rubro2Bo().updateRubro(rubro);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubro;
    }

    public List<Rubro2> getRubrosActivosOrdenados() throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Rubro2> rubros;
        try {
            rubros = new Rubro2Bo().getRubrosActivosOrdenados();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubros;
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
