/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.ventas.dao;

import ar.com.ventas.entities.Rubro2;
import ar.com.ventas.util.HibernateUtils;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Mar y Mar Informatica
 */
public class Rubro2Dao extends GenericDAO{
    
    public List<Rubro2> getRubrosActivosOrdenados() {
        List<Rubro2> rubros = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Rubro2.class);
        criteria.add(Restrictions.eq("activo", true));
        criteria.addOrder(Order.asc("nombre"));
        rubros = (List<Rubro2>) criteria.list();
        return rubros;
    }
    
}
