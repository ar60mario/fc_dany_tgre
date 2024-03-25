/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.Domicilio2DAO;
import ar.com.ventas.entities.Domicilio2;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class PorcentajeIvaBo {

    private final Domicilio2DAO dao = new Domicilio2DAO();

    public Domicilio2 saveDomicilio(Domicilio2 domicilioCliente) throws Exception {
        Domicilio2 domic = null;
        try {
            domic = (Domicilio2) dao.save(domicilioCliente);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return domic;
    }

    public Domicilio2 updateDomicilio(Domicilio2 domicilio) throws Exception {
        try {
            domicilio = (Domicilio2) dao.update(domicilio);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return domicilio;
    }
    
    public List<Domicilio2> getAllDomicilios() throws Exception {
        List<Domicilio2> domicilios = null;
        try {
            domicilios = (List<Domicilio2>) dao.getAll(Domicilio2.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return domicilios;
    }
}
