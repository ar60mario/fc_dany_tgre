/*
 * Aqui va toda la lógica de validaciones respecto a los Administradores.
 */
package ar.com.ventas.bo;

import ar.com.ventas.dao.Cliente2DAO;
import ar.com.ventas.entities.Cliente2;
import ar.com.ventas.entities.Domicilio2;
import ar.com.ventas.bo.Domicilio2BO;
import ar.com.ventas.util.Constantes;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.HibernateException;

/**
 *
 * @author Mar y Mar Informatica
 */
public class Cliente2BO {

    private final Cliente2DAO dao = new Cliente2DAO();

    private static final Logger logger = Logger.getLogger("ClienteBO");

    public List<Cliente2> getAllClientes() throws Exception {
        List<Cliente2> listClientes = null;

        try {
            listClientes = dao.getAll(Cliente2.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listClientes;
    }

    public Cliente2 saveCliente(Cliente2 cliente) throws Exception {
        // Primero guardo la dirección del cliente.
        Domicilio2BO domicilio2BO = new Domicilio2BO();
        Domicilio2 domicilioCliente = cliente.getDomicilio();
        domicilioCliente = domicilio2BO.saveDomicilio(domicilioCliente);
        cliente.setDomicilio(domicilioCliente);

        try {
            dao.save(cliente);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return cliente;
    }

    public void updateCliente(Cliente2 cliente) throws Exception {

        // Primero guardo la dirección del administrador.
        Domicilio2BO domicilioBO = new Domicilio2BO();
        Domicilio2 domicilioCliente = cliente.getDomicilio();
        domicilioCliente = domicilioBO.updateDomicilio(domicilioCliente);
        cliente.setDomicilio(domicilioCliente);

        try {
            cliente = (Cliente2) dao.update(cliente);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }

    }

    public List<Cliente2> getClienteByPagina(int paginaActual) throws Exception {

        List<Cliente2> listadoClientes = null;
        int start = 0;
        if (paginaActual > 1) {
            start = ((paginaActual - 1) * Constantes.MAX_RESULTS) + 1;
        }

        try {
            listadoClientes = dao.getAll(Cliente2.class, start);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }

        return listadoClientes;

    }

    public int getClientesCount() throws Exception {

        int cantidad = 0;

        try {
            cantidad = dao.getCount(Cliente2.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }

        return cantidad;

    }

    public void deleteCliente(Cliente2 cliente) throws Exception {

        try {
            dao.delete(cliente);

        } catch (HibernateException ex) {

            throw new Exception(ex);
        }
    }

    public Cliente2 getClienteByCodigo(String codigo) throws Exception {
        Cliente2 cliente = null;
        try {
            cliente = dao.getByCodigo(codigo);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return cliente;
    }
    
    public Cliente2 getClienteByCodigoTodos(String codigo) throws Exception {
        Cliente2 cliente = null;
        try {
            cliente = dao.getByCodigoTodos(codigo);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return cliente;
    }

    public List<Cliente2> getClientesOrdenado() throws Exception {

        List<Cliente2> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesOrdenado();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;

    }

    public List<Cliente2> getClientesInactivosOrdenado() throws Exception {
        List<Cliente2> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesInactivosOrdenado();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;
    }

    public List<Cliente2> getClientesNumerico() throws Exception {

        List<Cliente2> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesNumerico();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;

    }

    public List<Cliente2> getClientesNumericoInactivos() throws Exception {
        List<Cliente2> listadoClientes = null;
        try {
            listadoClientes = dao.getAllClientesNumericoInactivos();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listadoClientes;
    }

    public List<Cliente2> getClientesByFiltro(String filtro) throws Exception {
        List<Cliente2> clientes = null;
        try {
            clientes = dao.getClientesByFiltro(filtro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente2> getClientesByFiltroInactivos(String filtro) throws Exception {
        List<Cliente2> clientes = null;
        try {
            clientes = dao.getClientesByFiltroInactivos(filtro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return clientes;
    }

    public void saveListaClientes(List<Cliente2> listaClientes) throws Exception {
        Domicilio2BO db = new Domicilio2BO();

        if (listaClientes != null && !listaClientes.isEmpty()) {
            for (Cliente2 cliente : listaClientes) {
                Domicilio2 domicilio = cliente.getDomicilio();
                try {
                    domicilio = db.saveDomicilio(domicilio);
                    cliente.setDomicilio(domicilio);
                    dao.save(cliente);
                } catch (HibernateException ex) {
                    throw new Exception("Ha ocurrido un problema intentando guardar el Cliente.\nPor favor intente nuevamente mas tarde.");
                }
            }
        }
    }

    public Cliente2 getClienteByCuit(String cuit) throws Exception {
        Cliente2 cliente = null;
        try {
            cliente = dao.getByCuit(cuit);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return cliente;
    }
}
