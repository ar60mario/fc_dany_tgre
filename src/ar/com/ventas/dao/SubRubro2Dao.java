/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.ventas.dao;

import ar.com.ventas.entities.SubRubro2;
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
public class SubRubro2Dao extends GenericDAO{
    public List<SubRubro2> getRubrosActivosOrdenados() {
        List<SubRubro2> rubro = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(SubRubro2.class);
        criteria.add(Restrictions.eq("activo", true));
        criteria.addOrder(Order.asc("nombre"));
        rubro = (List<SubRubro2>) criteria.list();
        return rubro;
    }
}
