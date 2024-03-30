package ar.com.ventas.frame;

import ar.com.ventas.entities.MenuByPerfil;
import ar.com.ventas.entities.Perfil;
import ar.com.ventas.main.MainFrame;
import ar.com.ventas.services.MenuByPerfilService;
import ar.com.ventas.services.PerfilService;
import ar.com.ventas.structure.Constantes;
import ar.com.ventas.util.UtilFrame;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argia
 */
public class MenuByPerfilFrame extends javax.swing.JFrame {

    private List<Perfil> perfiles;
    private List<MenuByPerfil> menues;
    private Perfil perfil;
    

    /**
     * Creates new form PerfilFrame
     *
     */
    public MenuByPerfilFrame() {
        initComponents();
        limpiarCampos();
        llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        deshabilitarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        usuarioTxt = new javax.swing.JLabel();
        habilitarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PERFIL:");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO_MENU", "NOMBRE", "HABILITADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        deshabilitarBtn.setText("DESHABILITAR");
        deshabilitarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshabilitarBtnActionPerformed(evt);
            }
        });

        volverBtn.setText("VOLVER");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        usuarioTxt.setText("usuario");

        habilitarBtn.setText("HABILITAR");
        habilitarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilitarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deshabilitarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(habilitarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deshabilitarBtn)
                    .addComponent(volverBtn)
                    .addComponent(habilitarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTxt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        volver();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void deshabilitarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshabilitarBtnActionPerformed
        deshabilitar();
    }//GEN-LAST:event_deshabilitarBtnActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        int row = combo.getSelectedIndex();
        if (row > 0) {
            perfil = perfiles.get(row - 1);
            cargarListaDeMenues(perfil);
            llenarTabla();
        }
    }//GEN-LAST:event_comboActionPerformed

    private void habilitarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilitarBtnActionPerformed
        habilitar();
    }//GEN-LAST:event_habilitarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuByPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuByPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuByPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuByPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuByPerfilFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton deshabilitarBtn;
    private javax.swing.JButton habilitarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel usuarioTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        combo.removeAllItems();
        combo.addItem("");
        perfiles = null;
        try {
            perfiles = new PerfilService().getAllPerfiles();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "NO HAY PERFILES");
            return;
        }
        if (perfiles != null && !perfiles.isEmpty()) {
            for (Perfil pe : perfiles) {
                combo.addItem(pe.getNombre());
            }
        }
    }

    private void limpiarCampos() {
        getContentPane().setBackground(new java.awt.Color(Constantes.getR(),
                Constantes.getG(),
                Constantes.getB()));
        usuarioTxt.setText(UtilFrame.getUsuario());
    }

    private void volver() {
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }

    private void deshabilitar() {
        int row = tabla.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN MENU PARA DESHABILITAR");
            return;
        }
        if (menues != null && !menues.isEmpty()) {
            MenuByPerfil mp2 = menues.get(row);
            mp2.setHabilitado(false);
            try {
                new MenuByPerfilService().updateMenuByPerfil(mp2);
            } catch (Exception ex) {
                Logger.getLogger(MenuByPerfilFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargarListaDeMenues(perfil);
            llenarTabla();
        }
    }

    private void cargarListaDeMenues(Perfil perf) {
        menues = null;
        try {
            menues = new MenuByPerfilService().getMenuByPerfilByPerfil(perf);
        } catch (Exception ex) {
            Logger.getLogger(MenuByPerfilFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void llenarTabla() {
        UtilFrame.limpiarTabla(tabla);
        if (menues != null && !menues.isEmpty()) {
            DefaultTableModel tbl = (DefaultTableModel) tabla.getModel();
            for (MenuByPerfil mp : menues) {
                Object o[] = new Object[3];
                o[0] = mp.getCodigoMenu();
                o[1] = mp.getNombreMenu();
                if (mp.getHabilitado()) {
                    o[2] = "-SI-";
                } else {
                    o[2] = "NO";
                }
                tbl.addRow(o);
            }
            tabla.setModel(tbl);
        }
    }

    private void habilitar() {
        int row = tabla.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN MENU PARA HABILITAR");
            return;
        }
        if (menues != null && !menues.isEmpty()) {
            MenuByPerfil mp2 = menues.get(row);
            mp2.setHabilitado(true);
            try {
                new MenuByPerfilService().updateMenuByPerfil(mp2);
            } catch (Exception ex) {
                Logger.getLogger(MenuByPerfilFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargarListaDeMenues(perfil);
            llenarTabla();
        }
    }
}
