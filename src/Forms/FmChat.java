/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import com.sun.glass.events.KeyEvent;
import entidades.Chat;
import entidades.Mensaje;
import entidades.Usuario;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import repositories.ChatRepository;
import repositories.MensajeRepository;
import repositories.UsuarioRepository;
import java.awt.Color;
import java.awt.Font; 
/**
 *
 * @author Estefanía Aguilar
 */
public class FmChat extends javax.swing.JFrame {

    public static final String newline = "\n";
    UsuarioRepository usuarioRepository;
    MensajeRepository mensajeRepository;
    ChatRepository chatRepository;
    Usuario usuario;
    //Lista de mensajes del chat
    List<Mensaje> mensajes;
    Chat chat;

    public FmChat(Frame padre, Usuario usuario, Chat chat) {
        initComponents();
        this.setTitle("Juatsapp");
        this.setLocationRelativeTo(null);
        
        //Barra de menu
        jMenu1.setText("Agregar usuarios");
        jMenu2.setText("Cambiar nombre de chat");
        
        usuarioRepository = new UsuarioRepository();
        mensajeRepository = new MensajeRepository();
        chatRepository = new ChatRepository();
        
        this.usuario = usuario;
        this.chat = chat;
        
        txtTituloChat.setEnabled(false);
        
        mensajes = this.chat.getMensajes();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloChat = new javax.swing.JTextField();
        lblIcon = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        txtMensaje = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        lblGris = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloChat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtTituloChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloChatKeyPressed(evt);
            }
        });
        getContentPane().add(txtTituloChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 240, 30));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bocadillo32.png"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar.png"))); // NOI18N
        btnEnviar.setToolTipText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 50));

        txtMensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMensajeKeyPressed(evt);
            }
        });
        getContentPane().add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 280, 50));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso.png"))); // NOI18N
        btnSalir.setToolTipText("Regresar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, 30));

        txtChat.setEditable(false);
        txtChat.setBackground(new java.awt.Color(204, 204, 204));
        txtChat.setColumns(20);
        txtChat.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txtChat.setForeground(new java.awt.Color(0, 0, 0));
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 430, 370));

        lblGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gris500.jpg"))); // NOI18N
        getContentPane().add(lblGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 430, 350));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 490));

        jmenu.setToolTipText("");

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jmenu.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jmenu.add(jMenu2);

        setJMenuBar(jmenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FmPantallaInicio fmPantallaInicio = new FmPantallaInicio(this, usuarioRepository.buscarPorId(usuario.getId()));
        fmPantallaInicio.show();
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        fmAgregarUsuarios fmAgregarUsuarios = new fmAgregarUsuarios(this, chat);
        fmAgregarUsuarios.show();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        txtTituloChat.setEnabled(true);
        txtTituloChat.setBorder(new LineBorder(Color.blue));
    }//GEN-LAST:event_jMenu2MouseClicked

    private void txtTituloChatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloChatKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            chat.setTitulo(txtTituloChat.getText());
            chatRepository.actualizar(chat);
            txtTituloChat.setEnabled(false);
        }
    }//GEN-LAST:event_txtTituloChatKeyPressed

    private void txtMensajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (validarMensaje()) {
            
            //Crear mensaje
            Mensaje mensaje = new Mensaje(txtMensaje.getText(), this.usuario, this.chat, new Date());
            
            //Mostrar en pantalla el mensaje
            //Obtener la fecha en un diferente formato
            SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a dd-MMMM-yyyy");
            txtChat.append(mensaje.getUsuario().getNombre() + ": " + mensaje.getTexto() + newline 
                    + "     " +formater.format(mensaje.getFecha())+newline);
            txtMensaje.selectAll();
            txtChat.setCaretPosition(txtChat.getDocument().getLength());
            
            //Guardar el mensaje en la base de datos.
            mensajeRepository.guardar(mensaje);
            //Agregar el mensaje a la lista de mensajes del chat
            mensajes.add(mensaje);
            
            //Se actualiza los mensajes en el chat que ya existia
            this.chat.setMensajes(mensajes);

            //Actualizar en la base de datos el chat con los mensajes
            chatRepository.actualizar(this.chat);
            
            usuarioRepository.actualizar(usuario);

            txtMensaje.setText("");
        }
        }
    }//GEN-LAST:event_txtMensajeKeyPressed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (validarMensaje()) {
            
            //Crear mensaje
            Mensaje mensaje = new Mensaje(txtMensaje.getText(), this.usuario, this.chat, new Date());
            
            //Mostrar en pantalla el mensaje
            //Obtener la fecha en un diferente formato
            SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a dd-MMMM-yyyy");
            txtChat.append(mensaje.getUsuario().getNombre() + ": " + mensaje.getTexto() + newline 
                    + "     " +formater.format(mensaje.getFecha())+newline);
            txtMensaje.selectAll();
            txtChat.setCaretPosition(txtChat.getDocument().getLength());
            
            //Guardar el mensaje en la base de datos.
            mensajeRepository.guardar(mensaje);
            //Agregar el mensaje a la lista de mensajes del chat
            mensajes.add(mensaje);
            
            //Se actualiza los mensajes en el chat que ya existia
            this.chat.setMensajes(mensajes);

            //Actualizar en la base de datos el chat con los mensajes
            chatRepository.actualizar(this.chat);
            
            usuarioRepository.actualizar(usuario);

            txtMensaje.setText("");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    /**
     * Método que se encarga de mostrar los datos del chat en la ventana de
     * chat.
     */
    public void mostrarDatos() {        
        //Mostrar en pantalla el nombre del chat
        txtChat.setEditable(false);
        txtTituloChat.setText(chat.getTitulo());
        txtTituloChat.setEnabled(false);
        Font fuente = new Font("Calibri", 2, 19);
        

        //Validacion que identifica si el chat tiene o no mensajes.
        if (!chat.getMensajes().isEmpty()) {
            //Mostrar en pantalla el mensaje
            for (Mensaje mensaje : chat.getMensajes()) {                
                //Obtener la fecha en un diferente formato
                SimpleDateFormat formater = new SimpleDateFormat("hh: mm: ss a dd-MMMM-yyyy");                
                txtChat.append(mensaje.getUsuario().getNombre() + ": " + mensaje.getTexto() + newline 
                        + "     " + formater.format(mensaje.getFecha())
                        +newline);
                txtMensaje.selectAll();
                txtChat.setCaretPosition(txtChat.getDocument().getLength());
            }
        }
    }

    /**
     * Método que se encarga de no generar ningun mensaje vacio el chat.
     * @return Indica si el campo esta vacio o no,
     */
    public boolean validarMensaje() {
        if (!txtMensaje.getText().isEmpty()){
            for(int i =0; i<txtMensaje.getText().length(); i++){
                 if(txtMensaje.getText().charAt(i) != ' '){
                     return true;
                 }
            }            
        }
        return false;        
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/whatsapp.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar jmenu;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGris;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtTituloChat;
    // End of variables declaration//GEN-END:variables
}
