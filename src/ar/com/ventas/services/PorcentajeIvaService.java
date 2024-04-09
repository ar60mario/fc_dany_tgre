/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.services;

import ar.com.ventas.bo.PorcentajeIvaBo;
import ar.com.ventas.entities.PorcentajeIva;
import ar.com.ventas.util.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mcvalls
 */
public class PorcentajeIvaService {

    public PorcentajeIva savePorcentajeIva(PorcentajeIva domicilio) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            domicilio = new PorcentajeIvaBo().savePorcentajeIva(domicilio);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return domicilio;
    }

    public PorcentajeIva updateDomicilio(PorcentajeIva domicilio) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        try {
            domicilio = new PorcentajeIvaBo().updatePorcentajeIva(domicilio);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }

        return domicilio;
    }

    public List<PorcentajeIva> getAllPorcentajeIva() throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<PorcentajeIva> domicilios = null;
        try {
            domicilios = new PorcentajeIvaBo().getAllPorcentajeIva();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return domicilios;
    }
}
