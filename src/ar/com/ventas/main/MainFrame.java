package ar.com.ventas.main;

import ar.com.ventas.entities.EquipoActivo;
import ar.com.ventas.entities.MenuByPerfil;
import ar.com.ventas.entities.Perfil;
import ar.com.ventas.entities.Usuario;
import ar.com.ventas.frame.AbmPerfilFrame;
import ar.com.ventas.frame.AbmProductosFrame;
import ar.com.ventas.frame.NuevoPerfilFrame;
import ar.com.ventas.frame.AbmUsuarioFrame;
import ar.com.ventas.frame.MenuByPerfilFrame;
import ar.com.ventas.services.EquipoActivoService;
import ar.com.ventas.services.MenuByPerfilService;
import ar.com.ventas.services.UsuarioService;
import ar.com.ventas.structure.Constantes;
import ar.com.ventas.util.Globals;
import ar.com.ventas.util.UtilFrame;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author argia
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     *
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        limpiarFrame();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirBtn = new javax.swing.JButton();
        tstPrnBtn = new javax.swing.JButton();
        usuarioTxt = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivoMnu = new javax.swing.JMenu();
        clientesMnu = new javax.swing.JMenuItem();
        productosMnu = new javax.swing.JMenuItem();
        rubrosMnu = new javax.swing.JMenuItem();
        subRubrosMnu = new javax.swing.JMenuItem();
        proveedoresMnu = new javax.swing.JMenuItem();
        usuariosMnu = new javax.swing.JMenuItem();
        perfilesMnu = new javax.swing.JMenuItem();
        porcentIvaMnu = new javax.swing.JMenuItem();
        herramientasMenu = new javax.swing.JMenu();
        modificarPerfilesMnu = new javax.swing.JMenuItem();
        aMnu = new javax.swing.JMenu();
        versionMnu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MENU PRINCIPAL VENTAS");

        salirBtn.setText("SALIR");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        tstPrnBtn.setText("TST PRN");
        tstPrnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstPrnBtnActionPerformed(evt);
            }
        });

        usuarioTxt.setText("usuario");

        archivoMnu.setText("ARCHIVO");

        clientesMnu.setText("CLIENTES");
        clientesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(clientesMnu);

        productosMnu.setText("PRODUCTOS");
        productosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(productosMnu);

        rubrosMnu.setText("RUBROS");
        rubrosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubrosMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(rubrosMnu);

        subRubrosMnu.setText("SUB RUBROS");
        subRubrosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRubrosMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(subRubrosMnu);

        proveedoresMnu.setText("PROVEEDORES");
        proveedoresMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(proveedoresMnu);

        usuariosMnu.setText("USUARIOS");
        usuariosMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(usuariosMnu);

        perfilesMnu.setText("PERFILES");
        perfilesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilesMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(perfilesMnu);

        porcentIvaMnu.setText("PORC.IVA");
        porcentIvaMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentIvaMnuActionPerformed(evt);
            }
        });
        archivoMnu.add(porcentIvaMnu);

        jMenuBar1.add(archivoMnu);

        herramientasMenu.setText("HERRAMIENTAS");

        modificarPerfilesMnu.setText("MODIFICAR PERFILES");
        modificarPerfilesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPerfilesMnuActionPerformed(evt);
            }
        });
        herramientasMenu.add(modificarPerfilesMnu);

        jMenuBar1.add(herramientasMenu);

        aMnu.setText("?");

        versionMnu.setText("VERSION");
        versionMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionMnuActionPerformed(evt);
            }
        });
        aMnu.add(versionMnu);

        jMenuBar1.add(aMnu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarioTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                .addComponent(tstPrnBtn)
                .addGap(18, 18, 18)
                .addComponent(salirBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirBtn)
                    .addComponent(usuarioTxt)
                    .addComponent(tstPrnBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        salir();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void versionMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versionMnuActionPerformed
        versionDelSistema();
    }//GEN-LAST:event_versionMnuActionPerformed

    private void productosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosMnuActionPerformed
        abmProductos();
    }//GEN-LAST:event_productosMnuActionPerformed

    private void tstPrnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstPrnBtnActionPerformed
        tstPrn();
    }//GEN-LAST:event_tstPrnBtnActionPerformed

    private void clientesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesMnuActionPerformed
        clientes();
    }//GEN-LAST:event_clientesMnuActionPerformed

    private void usuariosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosMnuActionPerformed
        usuarios();
    }//GEN-LAST:event_usuariosMnuActionPerformed

    private void perfilesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilesMnuActionPerformed
        perfiles();
    }//GEN-LAST:event_perfilesMnuActionPerformed

    private void modificarPerfilesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPerfilesMnuActionPerformed
        menuByPerfil();
    }//GEN-LAST:event_modificarPerfilesMnuActionPerformed

    private void rubrosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubrosMnuActionPerformed
        rubros();
    }//GEN-LAST:event_rubrosMnuActionPerformed

    private void subRubrosMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRubrosMnuActionPerformed
        subRubros();
    }//GEN-LAST:event_subRubrosMnuActionPerformed

    private void proveedoresMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresMnuActionPerformed
        proveedores();
    }//GEN-LAST:event_proveedoresMnuActionPerformed

    private void porcentIvaMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentIvaMnuActionPerformed
        porcentualesIva();
    }//GEN-LAST:event_porcentIvaMnuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aMnu;
    private javax.swing.JMenu archivoMnu;
    private javax.swing.JMenuItem clientesMnu;
    private javax.swing.JMenu herramientasMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem modificarPerfilesMnu;
    private javax.swing.JMenuItem perfilesMnu;
    private javax.swing.JMenuItem porcentIvaMnu;
    private javax.swing.JMenuItem productosMnu;
    private javax.swing.JMenuItem proveedoresMnu;
    private javax.swing.JMenuItem rubrosMnu;
    private javax.swing.JButton salirBtn;
    private javax.swing.JMenuItem subRubrosMnu;
    private javax.swing.JButton tstPrnBtn;
    private javax.swing.JLabel usuarioTxt;
    private javax.swing.JMenuItem usuariosMnu;
    private javax.swing.JMenuItem versionMnu;
    // End of variables declaration//GEN-END:variables

    private void limpiarFrame() {
        getContentPane().setBackground(new java.awt.Color(Constantes.getR(),
                Constantes.getG(),
                Constantes.getB()));
        tstPrnBtn.setVisible(false);
        usuarioTxt.setText(UtilFrame.getUsuario());
        bloquearMenues();
    }

//    private Integer asignarOrden() {
//        return 1;
//    }
    private void salir() {
        int a = JOptionPane.showConfirmDialog(this, "DESEA ABANDONAR EL SISTEMA?", "SALIR COMPLETAMENTE",
                JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            int b = cerrarSistema();
            if (b == 1) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR CERRANDO SISTEMA");
            }
        }

    }

    private Integer cerrarSistema() {
        EquipoActivo ea = null;
        String str1 = Globals.USR.get();
        System.out.println(str1);
        String str2 = str1.substring(0, 3);
        String str3 = str1.substring(3, 9);
        String str4 = str1.substring(9, str1.length());
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
//        System.exit(0);
        Integer order_num = Integer.valueOf(str2);
        String order_name = str4;
        try {
            ea = new EquipoActivoService().getEquipoActivoByNombreAndOrden(order_name, order_num, "A");
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        ea.setActivo(false);
        try {
            new EquipoActivoService().updateEquipoActivo(ea);
            return 1;
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    private void versionDelSistema() {
        VersionFrame vf = new VersionFrame();
        vf.setVisible(true);
        this.dispose();
    }

//    private String asignarNombre() {
//        InetAddress localHost = null;
//        try {
//            localHost = InetAddress.getLocalHost();
//        } catch (UnknownHostException ex) {
//            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        String name = localHost.getHostName();
//        return name;
//    }
    private void abmProductos() {
        AbmProductosFrame apf = new AbmProductosFrame();
        apf.setVisible(true);
        this.dispose();
    }

    private void tstPrn() {
        String ruta = "c:/ventas/txt_folder/impre.bat";
        System.out.println(ruta);
        try {
            Runtime.getRuntime().exec(ruta);
            System.out.println("aqui si");
        } catch (Exception ioe) {
            System.out.println(ioe);
        }
        /*
        try {
            String cmd = "c:/ventas/copy.bat";
            Runtime.getRuntime().exec(cmd);
        } catch (Exception ioe) {
            System.out.println(ioe);
        }
         */
    }

    private void usuarios() {
        AbmUsuarioFrame auf = new AbmUsuarioFrame();
        auf.setVisible(true);
        this.dispose();
    }

    private void perfiles() {
        AbmPerfilFrame apf = new AbmPerfilFrame();
        apf.setVisible(true);
        this.dispose();
    }

    private void bloquearMenues() {
        Usuario u = null;
        String str1 = Globals.USR.get();
        String str3 = str1.substring(3, 9);
        Integer codigo = Integer.valueOf(str3);
        try {
            u = new UsuarioService().getUsuarioByCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (u != null) {
            Perfil perfil = u.getPerfil();
            List<MenuByPerfil> menues2 = null;
            try {
                menues2 = new MenuByPerfilService().getMenuByPerfilByPerfil(perfil);
            } catch (Exception ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (MenuByPerfil mbp : menues2) {
                if (!mbp.getHabilitado()) {
                    int op = mbp.getCodigo();
                    switch (op) {
                        case 1:
                            clientesMnu.setVisible(false);
                            break;
                        case 2:
                            productosMnu.setVisible(false);
                            break;
                        case 3:
                            rubrosMnu.setVisible(false);
                            break;
                        case 4:
                            subRubrosMnu.setVisible(false);
                            break;
                        case 5:
                            proveedoresMnu.setVisible(false);
                            break;
                        case 6:
                            usuariosMnu.setVisible(false);
                            break;
                        case 7:
                            perfilesMnu.setVisible(false);
                            break;
                        case 8:
                            modificarPerfilesMnu.setVisible(false);
                            break;
                    }
                }
            }
        }
    }

    private void clientes() {
        
    }

    private void menuByPerfil() {
        MenuByPerfilFrame mbpf = new MenuByPerfilFrame(null);
        mbpf.setVisible(true);
        this.dispose();
    }

    private void rubros() {
        
    }

    private void subRubros() {
        
    }

    private void proveedores() {
        
    }

    private void porcentualesIva() {
        
    }
}
