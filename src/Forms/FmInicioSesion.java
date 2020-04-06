package Forms;

import entidades.Usuario;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import repositories.UsuarioRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmInicioSesion extends javax.swing.JFrame {
    UsuarioRepository usuarioRepository;
    /**
     * Creates new form InicioSesion
     */
    public FmInicioSesion() {
        initComponents();
        this.setTitle("Juatsapp");
        this.setLocationRelativeTo(null);
        
        usuarioRepository = new UsuarioRepository();

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
        lblCorreo = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        lblContrasenia = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        lblAzul = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whatsappG.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, 130));

        lblCorreo.setText("Correo:");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 232, 210, 30));

        lblContrasenia.setText("Contraseña:");
        getContentPane().add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 210, 30));

        btnIngresar.setBackground(new java.awt.Color(51, 153, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 120, -1));

        lblRegistrar.setText("¿Aún no tienes una cuenta?");
        getContentPane().add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 20));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 400, 120));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        FmRegistrar fmRegistrar = new FmRegistrar(this);
        fmRegistrar.show();
        setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        verificarDatosBD();
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(FmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmInicioSesion().setVisible(true);
            }
        });
    }
    
    /**
     * Método de que encarga de verificar que el usuario que inicio sesion con su correo
     * y contraseña exista en la base de datos.
     */
    private void verificarDatosBD() {
    
        //Verificar que los dos campos de correos y contraseñas no esten vacios.
        if (!txtContrasenia.getText().isEmpty() && !txtCorreo.getText().isEmpty()) {

            if (obtenerUsuarioBD() != null) {
                //Llamar a la pantalla de inicio.
                FmPantallaInicio fmPantallaInicio = new FmPantallaInicio(this, obtenerUsuarioBD());
                fmPantallaInicio.show();
                setVisible(false);
                

            } else {
                /*
                Si se ha llegado hasta este paso, quiere decir que el usuario no se
                encuentra registrado en el sistema.
                 */
                mostrarMensaje();
            }
        } else {
            //Los campos de correo y contraseña no deben de estar vacios
            JOptionPane.showMessageDialog(this, "Llenar campos obligatorios", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Método que se encarga de mostrar un mensaje indicando de que el usuario no ha
     * sido registrado en la base de datos.
     */
    private void mostrarMensaje(){
       JOptionPane.showMessageDialog(this, "El usuario no se encuentra "
                        + "registrado o la contraseña es incorrecta.", "Alerta", JOptionPane.WARNING_MESSAGE); 
    }
    
    /**
     * Método que se encarga de obtener el usuario de la base de datos que coincide con
     * la contraseña y el correo indicado.
     * @return Usuario que coincida con contraseña y usuario
     */
    private Usuario obtenerUsuarioBD() {
        
        //Obtener todos los usuarios de la base de datos.
        ArrayList<Usuario> usuarios = usuarioRepository.buscarTodas();
        
        for (Usuario usuario : usuarios) {
            
            //Recorrer todos los usuarios y verificar en ellos que coinicida el nombre y la contraseña.
            if (usuario.getCorreo().equalsIgnoreCase(txtCorreo.getText()) && 
                   usuario.getContrasenia().equals(txtContrasenia.getText())) {
                        return usuario;                                                                               
            }            
        }
        /*
        Si se ha llegado hasta este paso, quiere decir que el usuario no se
        encuentra registrado en el sistema.
         */        
        return null;  
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/whatsapp.png"));
        return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
