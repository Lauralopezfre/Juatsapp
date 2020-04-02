/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmEditarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form FmEditarDatos
     */
    public FmEditarPerfil() {
        initComponents();
        this.setTitle("Juatsapp");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        btnContrasenia = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblAzul = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, 30));

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, 30));

        getContentPane().add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 140, 30));

        btnContrasenia.setText("Contraseña");
        getContentPane().add(btnContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 140, 30));

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/si.png"))); // NOI18N
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        lblPerfil.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(0, 0, 0));
        lblPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfil.setText("Perfil");
        getContentPane().add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 30));

        lblEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        getContentPane().add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 20));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibido.png"))); // NOI18N
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FmEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmEditarPerfil().setVisible(true);
            }
        });
    }

     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/whatsapp.png"));
        return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContrasenia;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
