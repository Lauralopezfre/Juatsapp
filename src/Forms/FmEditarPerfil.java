/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Enum.Sexo;
import entidades.Usuario;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import repositories.UsuarioRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmEditarPerfil extends javax.swing.JFrame {
    UsuarioRepository usuarioRepository;
    Usuario usuario;

    public FmEditarPerfil(Frame padre, Usuario usuario) {
        initComponents();
        this.setTitle("Juatsapp");
        this.setLocationRelativeTo(null);
        
        //Usuario que inicio sesion
        this.usuario = usuario;
        mostrarDatos();
        usuarioRepository = new UsuarioRepository();
        txtID.setEnabled(false);
        
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
        lblFoto = new javax.swing.JLabel();
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
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(400, 520));
        setMinimumSize(new java.awt.Dimension(400, 520));
        setPreferredSize(new java.awt.Dimension(400, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, 30));

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 60, 30));

        getContentPane().add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 30));

        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 140, 30));

        btnContrasenia.setText("Contraseña");
        btnContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(btnContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 140, 30));

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/si.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        lblPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfil.setText("Perfil");
        getContentPane().add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, 30));

        lblEditar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        getContentPane().add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibido.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 530));

        txtID.setText("jTextField1");
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        /*
        Si todos los campos estan llenos, se procede a crear una nuevo usuario con los nuevos valores
        y a actualizar en la base de datos estos nuevos valores.
        */
        if(validarCampos() && validarCorreo()){
            usuario.setCorreo(txtCorreo.getText());
            usuario.setEdad(Integer.parseInt(txtEdad.getText()));
            usuario.setNombre(txtNombre.getText());
            usuario.setSexo((Sexo)cbSexo.getSelectedItem());
            
            //Actualizar en la base de datos.
            actualizarDatosBD();
            //Se devuelve a la pantalla de inicio.
            FmPantallaInicio fmPantallaInicio = new FmPantallaInicio(this, usuario);
            fmPantallaInicio.show();
            setVisible(false);
        }        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FmPantallaInicio fmPantallaInicio = new FmPantallaInicio(this, usuario);
        fmPantallaInicio.show();
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseniaActionPerformed
        FmCambioConstrasenia fmCambioConstrasenia = new FmCambioConstrasenia(this, usuario);
        fmCambioConstrasenia.show();
        setVisible(false);
    }//GEN-LAST:event_btnContraseniaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (!String.valueOf(evt.getKeyChar()).matches("^[a-zA-Z ñáéíóú]$")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        if (!String.valueOf(evt.getKeyChar()).matches("^[0-9]$")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("*.jpg, *.jpeg, *.png", "jpg", "jpeg", "png"));
        jfc.setVisible(true);
        int respuesta = jfc.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            Icon icon = new ImageIcon(jfc.getSelectedFile().getPath());
            this.lblFoto.setIcon(new ImageIcon(iconToImage(icon).getScaledInstance(
                    lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_lblFotoMouseClicked

    
    /**
     * Método que se encarga de actualizar en la base de datos los nuevos valores
     * de los atributos del usuario.
     */
    private void actualizarDatosBD(){
        usuarioRepository.actualizar(this.usuario);
        
        //Se mostrara un mensaje en el caso de que se haya realizado el registro con exito.
        JOptionPane.showMessageDialog(this, "Actualización exitosa.", "Alerta", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    /**
     * Método que se encarga de verificar que todos los campos esten llenos, 
     * que ninguno este vacio.
     * @return Indica si todos los campos estan llenos.
     */
    private boolean validarCampos(){
        if(!txtNombre.getText().isEmpty() &&
                !txtCorreo.getText().isEmpty()&&
                !txtEdad.getText().isEmpty()){
            return true;
        }else{
            mostrarMensaje();
            return false;
        }
    }
    
        public boolean validarCorreo() {
        // Patrón para validar el correo
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(txtCorreo.getText());
        if (mather.find() == true) {            
            return true;
        } else {            
            JOptionPane.showMessageDialog(this, "El correo ingresado es inválido.",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    /**
     * Método que se encarga de mostrar un mensaje indicando que hay campos vacios y
     * deben ser llenados.
     */
    private void mostrarMensaje(){
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Alerta", JOptionPane.WARNING_MESSAGE);     
    }
    
    /**
     * Metodo que se encarga de mostrar la información del usuario en la venta 
     * para tener la posibilidad de editarlo.
     */
    public void mostrarDatos(){
        //Mostrar la información del usuario en los campos de textos.
        txtID.setText(String.valueOf(usuario.getId()));
        txtNombre.setText(usuario.getNombre());
        txtCorreo.setText(usuario.getCorreo());
        txtEdad.setText(String.valueOf(usuario.getEdad()));
       
        //Cargar en el bombo box los sexos disponibles.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(Sexo.FEMENINO);
        modelo.addElement(Sexo.MASCULINO);
        modelo.addElement(Sexo.ROBOT);
        cbSexo.setModel(modelo);
    }
    
    private Image iconToImage(Icon icon) {
        if (icon instanceof ImageIcon) {
            return ((ImageIcon) icon).getImage();
        } else {
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            return image;
        }
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
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
