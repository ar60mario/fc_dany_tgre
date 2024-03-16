/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.main;

import ar.com.ventas.entities.MenuByPerfil;
import ar.com.ventas.entities.Perfil;
import ar.com.ventas.entities.Usuario;
import ar.com.ventas.services.MenuByPerfilService;
import ar.com.ventas.services.UsuarioService;
import ar.com.ventas.structure.Constantes;
import ar.com.ventas.util.Globals;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author argia
 */
public class VersionFrame extends javax.swing.JFrame {

    
    
    /**
     * Creates new form VersionFrame
     
     */
    public VersionFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        versionTxt = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();
        mainBtn = new javax.swing.JButton();
        usuarioTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("VERSION DEL SISTEMA");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DULCYLANDYA");

        versionTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        versionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        versionTxt.setText("VER");

        volverBtn.setText("VOLVER");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        mainBtn.setText(" ");
        mainBtn.setBorder(null);
        mainBtn.setBorderPainted(false);
        mainBtn.setContentAreaFilled(false);
        mainBtn.setFocusPainted(false);
        mainBtn.setFocusable(false);
        mainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtnActionPerformed(evt);
            }
        });

        usuarioTxt.setText("usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(versionTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuarioTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(versionTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(volverBtn)
                        .addComponent(mainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usuarioTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        volver();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void mainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtnActionPerformed
        JOptionPane.showMessageDialog(this, "SI");
    }//GEN-LAST:event_mainBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VersionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VersionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VersionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VersionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VersionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mainBtn;
    private javax.swing.JLabel usuarioTxt;
    private javax.swing.JLabel versionTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void volver() {
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }

    private void limpiarFrame() {
        getContentPane().setBackground(new java.awt.Color(Constantes.getR(), Constantes.getG(), Constantes.getB()));
        this.setLocationRelativeTo(null);
        String ver2 = "VERSION: 1.3 FEBRERO 19 de 2024";
        versionTxt.setText(ver2);
        String str1 = Globals.USR.get();
        System.out.println(str1);
        String str3 = str1.substring(3, 9);
        String str5 = str3;
        Integer codigo = Integer.valueOf(str3);
        Usuario u = null;
        try {
            u = new UsuarioService().getUsuarioByCodigo(codigo);

        } catch (Exception ex) {
            Logger.getLogger(VersionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        str5 = str5 + " " + u.getNombre();
        usuarioTxt.setText(str5);
//        String str1 = Globals.USR.get();
//        String str3 = str1.substring(3, 9);
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
                        case 9:
                            mainBtn.setVisible(false);
//                            break;
//                        case 2:
//                            productosMnu.setVisible(false);
//                            break;
//                        case 3:
//                            rubrosMnu.setVisible(false);
//                            break;
//                        case 4:
//                            subRubrosMnu.setVisible(false);
//                            break;
//                        case 5:
//                            proveedoresMnu.setVisible(false);
//                            break;
//                        case 6:
//                            usuariosMnu.setVisible(false);
//                            break;
//                        case 7:
//                            perfilesMnu.setVisible(false);
//                            break;
//                        case 8:
//                            modificarPerfilesMnu.setVisible(false);
//                            break;
                    }
                }
            }
        }
    }
}
