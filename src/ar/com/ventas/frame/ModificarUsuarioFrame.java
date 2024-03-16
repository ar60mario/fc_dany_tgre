/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ventas.frame;

import ar.com.ventas.entities.Perfil;
import ar.com.ventas.entities.Usuario;
import ar.com.ventas.services.PerfilService;
import ar.com.ventas.services.UsuarioService;
import ar.com.ventas.structure.Constantes;
import ar.com.ventas.util.UtilFrame;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author argia
 */
public class ModificarUsuarioFrame extends javax.swing.JFrame {

    private List<Perfil> perfiles;
    private Usuario us;

    /**
     * Creates new form AbmUsuariosFrame
     */
    public ModificarUsuarioFrame(Usuario us) {
        initComponents();
        this.us = us;
        limpiarCampos();
        llenarFrame();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        administradorChk = new javax.swing.JCheckBox();
        activoChk = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        codigoTxt = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        volverBtn = new javax.swing.JButton();
        guardarBtn = new javax.swing.JButton();
        usuarioTxt = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("NUEVO USUARIO");

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("PASSWORD:");

        administradorChk.setText("ADMINISTRADOR");

        activoChk.setText("ACTIVO");

        jLabel4.setText("PERFIL");

        nombreTxt.setText("NOMBRE");
        nombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreTxtKeyPressed(evt);
            }
        });

        codigoTxt.setText("CODIGO");
        codigoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoTxtKeyPressed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        volverBtn.setText("VOLVER");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        guardarBtn.setText("GUARDAR");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        usuarioTxt.setText("usuario");

        passwordTxt.setText("1234");
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioTxt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(activoChk)
                                .addComponent(administradorChk)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addComponent(codigoTxt)
                                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(administradorChk)
                .addGap(18, 18, 18)
                .addComponent(activoChk)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn)
                    .addComponent(volverBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTxt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTxtKeyPressed

    private void nombreTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtKeyPressed

    private void passwordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtKeyPressed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        volver();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        guardar();
    }//GEN-LAST:event_guardarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuarioFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activoChk;
    private javax.swing.JCheckBox administradorChk;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel usuarioTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        getContentPane().setBackground(new java.awt.Color(Constantes.getR(),
                Constantes.getG(),
                Constantes.getB()));
        codigoTxt.setText("");
        nombreTxt.setText("");
        passwordTxt.setText("");
        activoChk.setSelected(true);
        administradorChk.setSelected(false);
        perfiles = null;
        try {
            perfiles = new PerfilService().getAllPerfiles();
        } catch (Exception ex) {
            Logger.getLogger(ModificarUsuarioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (perfiles != null && !perfiles.isEmpty()) {
            combo.removeAllItems();
            combo.addItem("");
            for (Perfil pe : perfiles) {
                combo.addItem(pe.getNombre());
            }
        }
        usuarioTxt.setText(UtilFrame.getUsuario());
    }

    private void volver() {
        AbmUsuarioFrame auf = new AbmUsuarioFrame();
        auf.setVisible(true);
        this.dispose();
    }

    private void guardar() {
        if (validar()) {
//            Usuario us = new Usuario();
            int row = combo.getSelectedIndex();
            int codigo = Integer.valueOf(codigoTxt.getText());
            Perfil pe = perfiles.get(row - 1);
            if (activoChk.isSelected()) {
                us.setActivo(true);
            } else {
                us.setActivo(false);
            }
            if (administradorChk.isSelected()) {
                us.setAdministrador(true);
            } else {
                us.setAdministrador(false);
            }
            us.setCodigo(codigo);
            us.setNombre(nombreTxt.getText());
            us.setPassword(passwordTxt.getText());
            us.setPerfil(pe);
            us.setVisible(true);
            try {
                new UsuarioService().updateCliente(us);
            } catch (Exception ex) {
                Logger.getLogger(ModificarUsuarioFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "ERROR");
                return;
            }
            JOptionPane.showMessageDialog(this, "USUARIO GRABADO CORRECTAMENTE");
        }
    }

    private boolean validar() {
        return true;
    }

    private void llenarFrame() {
        codigoTxt.setText(us.getCodigo().toString());
        nombreTxt.setText(us.getNombre());
        if(us.getAdministrador()){
            administradorChk.setSelected(true);
        }else{
            administradorChk.setSelected(false);
        }
        if(us.getActivo()){
            activoChk.setSelected(true);
        }else{
            activoChk.setSelected(false);
        }
        Long id_p1 = us.getPerfil().getId();
        int row = 1;
        int row1 = 0;
        for(Perfil pe:perfiles){
            Long id_p2 = pe.getId();
            if(id_p1.equals(id_p2)){
                row1 = row;
            }
            row += 1;
        }
        combo.setSelectedIndex(row1);
    }
}
