package ar.com.ventas.dao;

import ar.com.ventas.entities.Proveedor2;
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
public class Proveedor2Dao extends GenericDAO {

    public Proveedor2 getProveedorByCodigo(Integer codigo) {
        Proveedor2 proveedor;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Proveedor2.class);
        criteria.add(Restrictions.eq("codigo", codigo));
        proveedor = (Proveedor2) criteria.uniqueResult();
        return proveedor;
    }

    public List<Proveedor2> getProveedoresActivos() {
        List<Proveedor2> proveedores;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Proveedor2.class);
        criteria.add(Restrictions.eq("activo", true));
        criteria.addOrder(Order.asc("codigo"));
        proveedores = (List<Proveedor2>) criteria.list();
        return proveedores;
    }
    
    public List<Proveedor2> getProveedoresActivosOrdenNombre() {
        List<Proveedor2> proveedores;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Proveedor2.class);
        criteria.add(Restrictions.eq("activo", true));
        criteria.addOrder(Order.asc("nombre"));
        proveedores = (List<Proveedor2>) criteria.list();
        return proveedores;
    }
}
