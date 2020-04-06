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
        this.setTitle("Juatsapp");
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
        lblAgregarUsuarios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlUsuarios = new javax.swing.JList<>();
        btnAgregarUsuarios = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgregarUsuarios.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblAgregarUsuarios.setText("Agregar usuarios");

        jScrollPane2.setViewportView(jlUsuarios);

        btnAgregarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/si.png"))); // NOI18N
        btnAgregarUsuarios.setText("Agregar");
        btnAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuariosActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarUsuarios)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgregarUsuarios)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarUsuarios)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuarios;
    private javax.swing.JButton btnVolver;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlUsuarios;
    private javax.swing.JLabel lblAgregarUsuarios;
    // End of variables declaration//GEN-END:variables
}
