package ar.com.ventas.structure;

import ar.com.ventas.entities.Perfil;
import ar.com.ventas.entities.Usuario;
import ar.com.ventas.main.MainFrame;
import ar.com.ventas.services.UsuarioService;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JMenuItem;

/**
 *
 * @author argia
 */
public class Menu {

    private static Map<Integer, JMenuItem> mapa;

    public Menu(MainFrame mainFrame) {
        mapa = new HashMap();

        mapa.put(1, mainFrame.getClienteMnu());
        mapa.put(2, mainFrame.getProductoMnu());
        mapa.put(3, mainFrame.getRubroMnu());
        mapa.put(4, mainFrame.getSubRubroMnu());
        mapa.put(5, mainFrame.getProveedoresMnu());
        mapa.put(6, mainFrame.getUsuariosMnu());
        mapa.put(7, mainFrame.getPerfilesMnu());
        mapa.put(8, mainFrame.getPorcentIvaMnu());
        mapa.put(9, mainFrame.getModificarPerfilesMnu());
        mapa.put(10, mainFrame.getVersionMnu());
    }

    public JMenuItem setMostrarMenuByCodigo(Integer codigo) {
        JMenuItem jMenu = mapa.get(codigo);
        jMenu.setVisible(true);
        return jMenu;
    }

    public JMenuItem setOcultarMenuByCodigo(Integer codigo) {
        JMenuItem jMenu = mapa.get(codigo);
        jMenu.setVisible(false);
        return jMenu;
    }
    
    public String getNombreMenu(Integer codigo){
        JMenuItem jMenu = mapa.get(codigo);
        String nombre = jMenu.getName();
        return nombre;
    }
}
