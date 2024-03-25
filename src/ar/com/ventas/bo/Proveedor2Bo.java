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
