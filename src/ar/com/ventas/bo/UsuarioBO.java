/*
 * Aqui va toda la lógica de validaciones respecto a los Administradores.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.UsuarioDAO;
import ar.com.ventas.entities.Usuario;
import ar.com.ventas.util.Constantes;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class UsuarioBO {

    private final UsuarioDAO dao = new UsuarioDAO();

    private static final Logger logger = Logger.getLogger("ClienteBO");

    public List<Usuario> getAllUsuarios() throws Exception {
        List<Usuario> listUsuarios = null;

        try {
            listUsuarios = dao.getAll(Usuario.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listUsuarios;
    }

    public Usuario saveUsuario(Usuario usuario) throws Exception {
        // Primero guardo la dirección del cliente.

        try {
            dao.save(usuario);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return usuario;
    }

    public Usuario updateUsuario(Usuario usuario) throws Exception {
        try {
            usuario = (Usuario) dao.update(usuario);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return usuario;
    }

    public List<Usuario> getClienteByPagina(int paginaActual) throws Exception {

        List<Usuario> listadoClientes = null;
        int start = 0;
        if (paginaActual > 1) {
            start = ((paginaActual - 1) * Constantes.MAX_RESULTS) + 1;
        }

        try {
            listadoClientes = dao.getAll(Usuario.class, start);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }

        return listadoClientes;

    }

    public int getClientesCount() throws Exception {

        int cantidad = 0;

        try {
            cantidad = dao.getCount(Usuario.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }

        return cantidad;

    }

    public void deleteCliente(Usuario cliente) throws Exception {

        try {
            dao.delete(cliente);

        } catch (HibernateException ex) {

            throw new Exception(ex);
        }
    }

    public Usuario getClienteByCodigo(Integer codigo) throws Exception {
        Usuario cliente = null;
        try {
            cliente = dao.getByCodigo(codigo);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return cliente;
    }

    public Usuario getClienteByCodigoTodos(String codigo) throws Exception {
        Usuario cliente = null;
        try {
            cliente = dao.getByCodigoTodos(codigo);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return cliente;
    }

    public List<Usuario> getClientesOrdenado() throws Exception {

        List<Usuario> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesOrdenado();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;

    }

    public List<Usuario> getClientesInactivosOrdenado() throws Exception {
        List<Usuario> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesInactivosOrdenado();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;
    }

    public List<Usuario> getClientesNumerico() throws Exception {

        List<Usuario> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesNumerico();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;

    }

    public List<Usuario> getClientesNumericoInactivos() throws Exception {
        List<Usuario> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesNumericoInactivos();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;
    }

    public List<Usuario> getClientesByFiltro(String filtro) throws Exception {
        List<Usuario> clientes = null;
        try {
            clientes = dao.getClientesByFiltro(filtro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return clientes;
    }

    public List<Usuario> getClientesByFiltroInactivos(String filtro) throws Exception {
        List<Usuario> clientes = null;
        try {
            clientes = dao.getClientesByFiltroInactivos(filtro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return clientes;
    }

//    public void saveListaClientes(List<Usuario> listaClientes) throws Exception {
//        Domicilio2BO db = new Domicilio2BO();
//
//        if (listaClientes != null && !listaClientes.isEmpty()) {
//            for (Usuario cliente : listaClientes) {
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
//    public Usuario getClienteByCuit(String cuit) throws Exception {
//        Usuario cliente = null;
//        try {
//            cliente = dao.getByCuit(cuit);
//        } catch (HibernateException ex) {
//            throw new Exception(ex);
//        }
//        return cliente;
//    }
}
