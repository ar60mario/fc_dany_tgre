/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.dao;

import ar.com.ventas.entities.Usuario;
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
public class UsuarioDAO extends GenericDAO {

    public Usuario getByCodigo(Integer codigo) {
        Usuario cliente = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("codigo", codigo));
        criteria.add(Restrictions.eq("activo", true));
        cliente = (Usuario) criteria.uniqueResult();
        return cliente;
    }
    
    public Usuario getByCodigoTodos(String codigo) {
        Usuario cliente = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("codigo", codigo));
        //criteria.add(Restrictions.eq("activo", true));
        cliente = (Usuario) criteria.uniqueResult();
        return cliente;
    }

    public List<Usuario> getAllClientesOrdenado() {
        List<Usuario> cli = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("activo", true));
        criteria.addOrder(Order.asc("razonSocial"));
        cli = (List<Usuario>) criteria.list();
        return cli;
    }

    public List<Usuario> getAllClientesInactivosOrdenado() {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("activo", false));
        criteria.addOrder(Order.asc("razonSocial"));
        return (List<Usuario>) criteria.list();
    }

    public List<Usuario> getAllClientesNumerico() {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.addOrder(Order.asc("codigo"));
        criteria.add(Restrictions.eq("activo", true));
        return (List<Usuario>) criteria.list();
    }

    public List<Usuario> getAllClientesNumericoInactivos() {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.addOrder(Order.asc("codigo"));
        criteria.add(Restrictions.eq("activo", false));
        return (List<Usuario>) criteria.list();
    }

    public List<Usuario> getClientesByFiltro(String filtro) {
        List<Usuario> clientes = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();

        StringBuffer sb = new StringBuffer();
        sb.append("from Cliente clie ");
        sb.append("where clie.razonSocial like :filtro ");
        sb.append("and clie.activo = true ");
        sb.append("order by clie.razonSocial asc");

        Query query = session.createQuery(sb.toString());
        query.setParameter("filtro", "%" + filtro + "%");

        clientes = (List<Usuario>) query.list();

        return clientes;
    }

    public List<Usuario> getClientesByFiltroInactivos(String filtro) {
        List<Usuario> clientes = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        StringBuffer sb = new StringBuffer();
        sb.append("from Cliente clie ");
        sb.append("where clie.razonSocial like :filtro ");
        sb.append("and clie.activo = false ");
        sb.append("order by clie.razonSocial asc");
        Query query = session.createQuery(sb.toString());
        query.setParameter("filtro", "%" + filtro + "%");
        clientes = (List<Usuario>) query.list();
        return clientes;
    }

    public Usuario getByCuit(String cuit) {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("cuit", cuit));
        List<Usuario> clientes = (List<Usuario>) criteria.list();
        Usuario cliente = clientes.get(0);
        return cliente;
    }
}
