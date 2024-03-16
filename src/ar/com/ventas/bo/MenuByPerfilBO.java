/*
 * Aqui va toda la lógica de validaciones respecto a los Administradores.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.MenuByPerfilDAO;
import ar.com.ventas.dao.PerfilDAO;
import ar.com.ventas.entities.MenuByPerfil;
import ar.com.ventas.entities.Perfil;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class MenuByPerfilBO {

    private final MenuByPerfilDAO dao = new MenuByPerfilDAO();

    private static final Logger logger = Logger.getLogger("MenuByPerfilBO");

//    public List<Perfil> getAllClientes() throws Exception {
//        List<Perfil> listClientes = null;
//
//        try {
//            listClientes = dao.getAllPerfiles();
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return listClientes;
//    }

    public MenuByPerfil saveMenuByPerfil(MenuByPerfil perfil) throws Exception {
       
        try {
            dao.save(perfil);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return perfil;
    }

    public MenuByPerfil updateMenuByPerfil(MenuByPerfil perfil) throws Exception {
       
        try {
            dao.update(perfil);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return perfil;
    }

    public List<MenuByPerfil> getMenuByPerfilByPerfil(Perfil perfil) throws Exception {

        List<MenuByPerfil> listadoDeMenues = null;
        

        try {
            listadoDeMenues = dao.getMenuByPerfilByPerfil(perfil);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }

        return listadoDeMenues;

    }
//
//    public int getClientesCount() throws Exception {
//
//        int cantidad = 0;
//
//        try {
//            cantidad = dao.getCount(Cliente2.class);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//
//        return cantidad;
//
//    }
//
//    public void deleteCliente(Cliente2 cliente) throws Exception {
//
//        try {
//            dao.delete(cliente);
//
//        } catch (HibernateException ex) {
//
//            throw new Exception(ex);
//        }
//    }
//
//    public Cliente2 getClienteByCodigo(String codigo) throws Exception {
//        Cliente2 cliente = null;
//        try {
//            cliente = dao.getByCodigo(codigo);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return cliente;
//    }
//    
//    public Cliente2 getClienteByCodigoTodos(String codigo) throws Exception {
//        Cliente2 cliente = null;
//        try {
//            cliente = dao.getByCodigoTodos(codigo);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return cliente;
//    }
//
//    public List<Cliente2> getClientesOrdenado() throws Exception {
//
//        List<Cliente2> listadoClientes = null;
//        try {
//            listadoClientes = dao.getAllClientesOrdenado();
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return listadoClientes;
//
//    }
//
//    public List<Cliente2> getClientesInactivosOrdenado() throws Exception {
//        List<Cliente2> listadoClientes = null;
//        try {
//            listadoClientes = dao.getAllClientesInactivosOrdenado();
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return listadoClientes;
//    }
//
//    public List<Cliente2> getClientesNumerico() throws Exception {
//
//        List<Cliente2> listadoClientes = null;
//        try {
//            listadoClientes = dao.getAllClientesNumerico();
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return listadoClientes;
//
//    }
//
//    public List<Cliente2> getClientesNumericoInactivos() throws Exception {
//        List<Cliente2> listadoClientes = null;
//        try {
//            listadoClientes = dao.getAllClientesNumericoInactivos();
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return listadoClientes;
//    }
//
//    public List<Cliente2> getClientesByFiltro(String filtro) throws Exception {
//        List<Cliente2> clientes = null;
//        try {
//            clientes = dao.getClientesByFiltro(filtro);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return clientes;
//    }
//    
//    public List<Cliente2> getClientesByFiltroInactivos(String filtro) throws Exception {
//        List<Cliente2> clientes = null;
//        try {
//            clientes = dao.getClientesByFiltroInactivos(filtro);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return clientes;
//    }
//
//    public void saveListaClientes(List<Cliente2> listaClientes) throws Exception {
//        Domicilio2BO db = new Domicilio2BO();
//
//        if (listaClientes != null && !listaClientes.isEmpty()) {
//            for (Cliente2 cliente : listaClientes) {
//                Domicilio2 domicilio = cliente.getDomicilio();
//                try {
//                    domicilio = db.saveDomicilio(domicilio);
//                    cliente.setDomicilio(domicilio);
//                    dao.save(cliente);
//                } catch (HibernateException ex) {
//                    throw new Exception("Ha ocurrido un problema intentando guardar el Cliente.\nPor favor intente nuevamente mas tarde.");
//                }
//            }
//        }
//    }
//
//    public Cliente2 getClienteByCuit(String cuit) throws Exception {
//        Cliente2 cliente = null;
//        try {
//            cliente = dao.getByCuit(cuit);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return cliente;
//    }
}
