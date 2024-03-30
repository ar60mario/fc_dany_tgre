/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.Rubro2Dao;
import ar.com.ventas.entities.Rubro2;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class Rubro2Bo {

    private final Rubro2Dao dao = new Rubro2Dao();

    public Rubro2 saveRubro(Rubro2 rubro) throws Exception {
        Rubro2 rub = null;
        try {
            rub = (Rubro2) dao.save(rubro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return rub;
    }
    
    public Rubro2 updateRubro(Rubro2 rubro) throws Exception {
        Rubro2 rub = null;
        try {
            rub = (Rubro2) dao.update(rubro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return rub;
    }

    public List<Rubro2> getRubrosActivosOrdenados() throws Exception {
        List<Rubro2> rub = null;
        try {
            rub = (List<Rubro2>) dao.getRubrosActivosOrdenados();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return rub;
    }
    
//    public Domicilio2 updateDomicilio(Domicilio2 domicilio) throws Exception {
//        try {
//            domicilio = (Domicilio2) dao.update(domicilio);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return domicilio;
//    }
//    
//    public List<Domicilio2> getAllDomicilios() throws Exception {
//        List<Domicilio2> domicilios = null;
//        try {
//            domicilios = (List<Domicilio2>) dao.getAll(Domicilio2.class);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return domicilios;
//    }
}
