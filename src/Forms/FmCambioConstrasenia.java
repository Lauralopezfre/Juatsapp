/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import entidades.Usuario;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import repositories.UsuarioRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmCambioConstrasenia extends javax.swing.JFrame {
    UsuarioRepository usuarioRepository;
    FmEditarPerfil fmEditarPerfil;
    Usuario usuario;

    public FmCambioConstrasenia(Frame padre, Usuario usuario) {
        initComponents();
        this.setTitle("Editar perfil");
        this.setLocationRelativeTo(null);                

        //Usuario que inicio sesion
        this.usuario = usuario;
        
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

        lblContraActual = new javax.swing.JLabel();
        lblContraNueva = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        txtContraNueva = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblAzul = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContraActual.setForeground(new java.awt.Color(0, 0, 0));
        lblContraActual.setText("Contraseña actual:");
        getContentPane().add(lblContraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblContraNueva.setForeground(new java.awt.Color(0, 0, 0));
        lblContraNueva.setText("Contraseña nueva:");
        getContentPane().add(lblContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, 30));
        getContentPane().add(txtContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 190, 30));

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/si.png"))); // NOI18N
        btnAceptar.setToolTipText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibido.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("Contraseña");
        lblContraseña.setToolTipText("");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, 30));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblEditar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblEditar.setText("Editar");
        getContentPane().add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, -1));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 80));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        cambiarContrasenia();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fmEditarPerfil = new FmEditarPerfil(this, usuario);
        fmEditarPerfil.show();        
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void cambiarContrasenia(){
        if(validarDatos() && validarContrasenia()){
            this.usuario.setContrasenia(txtContraNueva.getText());
            actualizarDatosBD(usuario);        
        }else{
            
        }
    }
    
     /**
     * Método que se encarga de actualizar en la base de datos los nuevos valores
     * de los atributos del usuario.
     */
    private void actualizarDatosBD(Usuario usuarioActualizado){
        usuarioRepository.actualizar(usuarioActualizado);
        
        //Se mostrara un mensaje en el caso de que se haya realizado el registro con exito.
        JOptionPane.showMessageDialog(this, "Configuración exitosa.", "Alerta", JOptionPane.WARNING_MESSAGE);  
        
        fmEditarPerfil = new FmEditarPerfil(this, usuario);
        fmEditarPerfil.show();        
        setVisible(false);
    }
    
    public boolean validarDatos() {
        if (!txtContrasenia.getText().isEmpty()
                && !txtContraNueva.getText().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Alerta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public boolean validarContrasenia(){
            if(this.usuario.getContrasenia().equals(txtContrasenia.getText())){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, "La contraseña actual no coincide.", "Alerta", JOptionPane.WARNING_MESSAGE); 
            return false;
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/pluma.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblContraActual;
    private javax.swing.JLabel lblContraNueva;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JPasswordField txtContrasenia;
    // End of variables declaration//GEN-END:variables
}
