/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.PorcentajeIvaDao;
import ar.com.ventas.entities.PorcentajeIva;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class PorcentajeIvaBo {

    private final PorcentajeIvaDao dao = new PorcentajeIvaDao();

    public PorcentajeIva savePorcentajeIva(PorcentajeIva domicilioCliente) throws Exception {
        PorcentajeIva domic = null;
        try {
            domic = (PorcentajeIva) dao.save(domicilioCliente);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return domic;
    }

    public PorcentajeIva updatePorcentajeIva(PorcentajeIva domicilio) throws Exception {
        try {
            domicilio = (PorcentajeIva) dao.update(domicilio);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return domicilio;
    }
    
    public List<PorcentajeIva> getAllPorcentajeIva() throws Exception {
        List<PorcentajeIva> domicilios = null;
        try {
            domicilios = (List<PorcentajeIva>) dao.getAll(PorcentajeIva.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return domicilios;
    }
}
