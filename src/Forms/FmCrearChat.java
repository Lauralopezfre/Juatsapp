package Forms;

import entidades.Chat;
import entidades.Rel_UsuariosChats;
import entidades.Usuario;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import repositories.ChatRepository;
import repositories.UsuarioRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmCrearChat extends javax.swing.JFrame {
    UsuarioRepository usuarioRepository;
    ChatRepository chatRepository;
    JScrollPane scrollLista;
    Usuario usuario;
    Usuario[] usuariosInvitados;
    
    public FmCrearChat(Frame padre, Usuario usuario) {
        initComponents();
        this.setTitle("Juatsapp");
        this.setLocationRelativeTo(null);                
        usuarioRepository = new UsuarioRepository();
        chatRepository = new ChatRepository();
        scrollLista = new JScrollPane();
        
        //Usuario que inicion sesion
        this.usuario = usuario;
        
        //Se muestran los usuarios que se pueden agregar al chat.
        mostrarUsuarios(obtenerUsuariosBD());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGIntegrantes = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();
        lblChat = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblIntegrantes = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblAzul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlUsuarios = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(400, 470));
        setPreferredSize(new java.awt.Dimension(400, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrear.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCrear.setText("Crear");
        getContentPane().add(lblCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        lblChat.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblChat.setText("Chat");
        getContentPane().add(lblChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bocadillo.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        lblTitulo.setText("Titulo:");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        lblIntegrantes.setText("Integrantes:");
        getContentPane().add(lblIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, -1));

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/si.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibido.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 100));

        jScrollPane1.setViewportView(jlUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 260, 140));

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Si desea seleccionar mas de un usuario, precione Ctrl.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       if(validarCampos()){
           FmChat fmChat = new FmChat(this, usuario, guardarChatBD());
           fmChat.show();
           setVisible(false);
       }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FmPantallaInicio fmPantallaInicio = new FmPantallaInicio(this, usuario);
        fmPantallaInicio.show();
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Método que se encarga obtener todos los usuarios almacenados en la base de datos.
     * @return Usuarios que se pueden agregar al chat
     */
    private ArrayList<Usuario> obtenerUsuariosBD(){
        
        //Se obtiene todos los usuarios registrados en la base de datos.
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        //Solamente se muestran todos los usuarios menos el que inicio sesion
        for (Usuario usuario : usuarioRepository.buscarTodas()) {
            //No se almacena el usuario que se esta utilizando
            if(!this.usuario.getId().equals(usuario.getId())){
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
    
    /**
     * Mostrar los usuarios registrados de la base de datos en la pantalla de crear chat.
     * @param usuarios Usuarios registrados en la base de datos.
     */
    private void mostrarUsuarios(ArrayList<Usuario> usuarios) {
        //Los usuarios se muestran en JList
        
        //Se agregan los usuarios al JList
        DefaultListModel listModel = new DefaultListModel();
        for (Usuario usuario : usuarios) {
            listModel.addElement(usuario);
        }
        jlUsuarios.setModel(listModel);
        
    }
    
    /**
     * Método que se encarga de validar que los campos para crear el chat en la base de
     * datos no esten vacios.
     * @return 
     */
    private boolean validarCampos(){
        if(!txtTitulo.getText().isEmpty() &&
                jlUsuarios.getSelectedIndex() != -1){
            return true;
        }
        mostrarMensajeError();
        return false;
    }
    
    /**
     * Metodo que se encarga de mostrar un mensaje de error en la pantalla de crear chat 
     * cuando los campos no esten completamente llenos.
     */
    private void mostrarMensajeError(){
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Alerta", JOptionPane.WARNING_MESSAGE); 
    }
    
    /**
     * Metodo que se encarga de guardar en la base de datos el chat creado.
     */
    private Chat guardarChatBD(){
        //Se crea un nuevo chat con el nombre que indique el usuario.
        Chat chat = new Chat(txtTitulo.getText());              
        
        usuariosInvitados = new Usuario[usuarioRepository.buscarTodas().size()];
        //Se obtiene los usuarios seleccionados
        for (int i = 0; i < jlUsuarios.getSelectedValues().length; i++) {
            usuariosInvitados[i] = (Usuario)jlUsuarios.getSelectedValues()[i];
        }
                
        //Relaciones usuarios a chat
        ArrayList<Rel_UsuariosChats> rel_usuariosChats = new ArrayList<>();
        
        for (Usuario usuario : usuariosInvitados) {
            rel_usuariosChats.add(new Rel_UsuariosChats(usuario, chat));
        }
        
        /*
        Ademas de agregar al chat a los usuarios que se invitaron, tambien se agrega 
        al usuario que lo creo.
        */
        rel_usuariosChats.add(new Rel_UsuariosChats(usuario, chat));
        
        //Se agrega la relacion de los usuario con el chat, al chat creado.
        chat.setUsuarios(rel_usuariosChats);
        
        //Se almacena en la base de datos.
        chatRepository.guardar(chat);
        
        return chat;
      
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/whatsapp.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGIntegrantes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlUsuarios;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblChat;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIntegrantes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
