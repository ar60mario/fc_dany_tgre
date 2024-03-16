/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.dao;

import ar.com.ventas.entities.MenuByPerfil;
import ar.com.ventas.entities.Perfil;
import ar.com.ventas.util.HibernateUtils;
//import org.hibernate.classic.Session;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.criterion.Order;

/**
 *
 * @author Mar y Mar Informatica
 */
public class MenuByPerfilDAO extends GenericDAO {

//    public Perfil getByCodigo(String codigo) {
//        Cliente2 cliente = null;
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(Cliente2.class);
//        criteria.add(Restrictions.eq("codigo", codigo));
//        criteria.add(Restrictions.eq("activo", true));
//        cliente = (Cliente2) criteria.uniqueResult();
//        return cliente;
//    }
    
//    public Cliente2 getByCodigoTodos(String codigo) {
//        Cliente2 cliente = null;
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(Cliente2.class);
//        criteria.add(Restrictions.eq("codigo", codigo));
//        //criteria.add(Restrictions.eq("activo", true));
//        cliente = (Cliente2) criteria.uniqueResult();
//        return cliente;
//    }

    public List<MenuByPerfil> getMenuByPerfilByPerfil(Perfil perfil) {
        List<MenuByPerfil> menues = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(MenuByPerfil.class);
        criteria.add(Restrictions.eq("perfil", perfil));
//        criteria.addOrder(Order.asc("razonSocial"));
        menues = (List<MenuByPerfil>) criteria.list();
        return menues;
    }

//    public List<Cliente2> getAllClientesInactivosOrdenado() {
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(Cliente2.class);
//        criteria.add(Restrictions.eq("activo", false));
//        criteria.addOrder(Order.asc("razonSocial"));
//        return (List<Cliente2>) criteria.list();
//    }
//
//    public List<Cliente2> getAllClientesNumerico() {
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(Cliente2.class);
//        criteria.addOrder(Order.asc("codigo"));
//        criteria.add(Restrictions.eq("activo", true));
//        return (List<Cliente2>) criteria.list();
//    }
//
//    public List<Cliente2> getAllClientesNumericoInactivos() {
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(Cliente2.class);
//        criteria.addOrder(Order.asc("codigo"));
//        criteria.add(Restrictions.eq("activo", false));
//        return (List<Cliente2>) criteria.list();
//    }
//
//    public List<Cliente2> getClientesByFiltro(String filtro) {
//        List<Cliente2> clientes = null;
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//
//        StringBuffer sb = new StringBuffer();
//        sb.append("from Cliente clie ");
//        sb.append("where clie.razonSocial like :filtro ");
//        sb.append("and clie.activo = true ");
//        sb.append("order by clie.razonSocial asc");
//
//        Query query = session.createQuery(sb.toString());
//        query.setParameter("filtro", "%" + filtro + "%");
//
//        clientes = (List<Cliente2>) query.list();
//
//        return clientes;
//    }
//
//    public List<Cliente2> getClientesByFiltroInactivos(String filtro) {
//        List<Cliente2> clientes = null;
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        StringBuffer sb = new StringBuffer();
//        sb.append("from Cliente clie ");
//        sb.append("where clie.razonSocial like :filtro ");
//        sb.append("and clie.activo = false ");
//        sb.append("order by clie.razonSocial asc");
//        Query query = session.createQuery(sb.toString());
//        query.setParameter("filtro", "%" + filtro + "%");
//        clientes = (List<Cliente2>) query.list();
//        return clientes;
//    }
//
//    public Cliente2 getByCuit(String cuit) {
//        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(Cliente2.class);
//        criteria.add(Restrictions.eq("cuit", cuit));
//        List<Cliente2> clientes = (List<Cliente2>) criteria.list();
//        Cliente2 cliente = clientes.get(0);
//        return cliente;
//    }
}
