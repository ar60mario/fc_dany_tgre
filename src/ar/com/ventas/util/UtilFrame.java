/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.util;

import ar.com.ventas.entities.Usuario;
import ar.com.ventas.main.MainFrame;
import ar.com.ventas.services.UsuarioService;
import ar.com.ventas.structure.Menu;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mario
 */
public class UtilFrame {

    private static Integer maxMenu = ar.com.ventas.structure.Constantes.getCantidadMenu();

    public static JTable limpiarTabla(JTable tabla) {
        int rows = tabla.getRowCount();
        if (rows > 0) {
            DefaultTableModel tbl = (DefaultTableModel) tabla.getModel();
            for (int i = 0; i < rows; i++) {
                tbl.removeRow(0);
            }
            tabla.setModel(tbl);
        }
        return tabla;
    }

    public static String fecha(String fe) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int largo = fe.length();
        String fe1 = fe;
        String str = sdf.format(new Date());
        if (fe.equals("")) {
            fe = sdf.format(new Date());
        } else {
            if (largo == 2) {
                fe = fe1 + str.substring(2, 10);
            } else {
                if (largo == 5) {
                    fe = fe1 + str.substring(5, 10);
                }
            }
        }
        return fe;
    }

    public static String getUsuario() {
        String str1 = Globals.USR.get();
        String str3 = str1.substring(3, 9);
        String str5 = str3;
        Integer codigo = Integer.valueOf(str3);
        Usuario u = null;
        try {
            u = new UsuarioService().getUsuarioByCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(UtilFrame.class.getName()).log(Level.SEVERE, null, ex);
            return str5;
        }
        str5 = str5 + " - " + u.getNombre();
        return str5;
    }

    public static List<Menu> getListaMenus() {
        List<Menu> lista = new ArrayList<>();
        for (int i = 1; i < maxMenu + 1; i++) {
            MainFrame mf = new MainFrame();
//            System.out.println(mf);
            Menu menu = new Menu(mf);
            System.out.println(menu.getNombreMenu(i));
            lista.add(menu);
//            System.out.println(menu.setMostrarMenuByCodigo(i).getName());
        }
        System.out.println(lista.get(1));
        System.out.println(lista.get(1).setMostrarMenuByCodigo(2));
        System.exit(0);
        return lista;
    }
}
