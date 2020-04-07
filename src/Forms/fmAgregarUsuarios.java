/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import entidades.Chat;
import entidades.Rel_UsuariosChats;
import entidades.Usuario;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.DefaultListModel;
import repositories.ChatRepository;
import repositories.UsuarioRepository;

/**
 *
 * @author laura
 */
public class fmAgregarUsuarios extends javax.swing.JFrame {

    UsuarioRepository usuarioRepository;
    ChatRepository chatRepository;
    Chat chat;
    Usuario[] usuariosInvitados;
    
    public fmAgregarUsuarios(Frame padre, Chat chat) {
        initComponents();
        this.setTitle("Agregar usuarios");
        this.setLocationRelativeTo(null); 
        usuarioRepository = new UsuarioRepository();
        chatRepository = new ChatRepository();
        this.chat = chat;
        mostrarUsuarios();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblAgregar = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlUsuarios = new javax.swing.JList<>();
        btnAgregarUsuarios = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblAzul = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregar.setForeground(new java.awt.Color(0, 0, 0));
        lblAgregar.setText("Agregar");
        getContentPane().add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 20, 60, 20));

        lblUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuarios.setText("usuarios");
        getContentPane().add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, -1));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguidores.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 50));

        jScrollPane2.setViewportView(jlUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 290, 180));

        btnAgregarUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/si.png"))); // NOI18N
        btnAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibido.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 70));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuariosActionPerformed
  
       actualizarChat();
       setVisible(false);
    }//GEN-LAST:event_btnAgregarUsuariosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed
    
    /**
     * Metodo que se encarga de actualizar el chat con los nuevos usuarios 
     * seleccionados.
     */
    private void actualizarChat(){
        usuariosInvitados = new Usuario[jlUsuarios.getSelectedValues().length];
        //Se obtiene los usuarios seleccionados
        for (int i = 0; i < jlUsuarios.getSelectedValues().length; i++) {
            usuariosInvitados[i] = (Usuario)jlUsuarios.getSelectedValues()[i];
        }
        
        //Relaciones usuarios a chat
        List<Rel_UsuariosChats> rel_usuariosChats = this.chat.getUsuarios();
        
        for (Usuario usuario : usuariosInvitados) {
            rel_usuariosChats.add(new Rel_UsuariosChats(usuario, chat));
        }
    }
    
    /**
     * Método que se encarga de mostrar los usuarios disponibles que se pueden
     * agregar al chat.
     */
    private void mostrarUsuarios(){
        //Los usuarios se muestran en JList
        
        //Se agregan los usuarios al JList
        DefaultListModel listModel = new DefaultListModel();
        for (Usuario usuario : usuarioRepository.buscarTodas()) {
            if(!verificarUsuario(usuario)){
                listModel.addElement(usuario);
            } 
        }
        jlUsuarios.setModel(listModel);
    }
    
    /**
     * Método que se encarga de verificar si el usuario existe en el chat
     * @param usuario Usuario a verificar
     * @return Decide si existe o no en el chat
     */
    private boolean verificarUsuario(Usuario usuario) {
        for (Rel_UsuariosChats usuario1 : chat.getUsuarios()) {
            if (usuario1.getUsuario().getId().equals(usuario.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/seguidoresAzul.png"));
        return retValue;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuarios;
    private javax.swing.JButton btnVolver;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlUsuarios;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}
