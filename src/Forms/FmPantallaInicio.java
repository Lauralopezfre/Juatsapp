package Forms;

import entidades.Rel_UsuariosChats;
import entidades.Usuario;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositories.UsuarioRepository;

/**
 *
 * @author Estefanía Aguilar
 */
public class FmPantallaInicio extends javax.swing.JFrame {
    UsuarioRepository usuarioRepository;
    Usuario usuario;
    
    
    public FmPantallaInicio(Frame padre, Usuario usuario) {
        initComponents();
        this.setTitle("Juatsapp");
        this.setLocationRelativeTo(null);
        usuarioRepository = new UsuarioRepository();
        
        //Usuario que inicio sesion
        this.usuario = usuario;
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbChats = new javax.swing.JTable();
        btnCrearChat = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNumChats = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtNumChats = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBuscarChat = new javax.swing.JTextField();
        lblBuscarChat = new javax.swing.JLabel();
        lblAzul = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblGris = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbChats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del chat", "Ultimo mensaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbChats);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 310, 380));

        btnCrearChat.setText("Crear chat");
        btnCrearChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearChatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibido.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 60));

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(0, 153, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        lblNumChats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumChats.setText("Chats");
        getContentPane().add(lblNumChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 50, -1));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar perfil");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, -1));

        txtNumChats.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNumChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 50, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transparenciaC.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        txtBuscarChat.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscarChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtBuscarChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 230, 30));

        lblBuscarChat.setText("Buscar chat");
        getContentPane().add(lblBuscarChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul638.jpg"))); // NOI18N
        getContentPane().add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 140, 480));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blancosolido.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 70));

        lblGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gris500.jpg"))); // NOI18N
        getContentPane().add(lblGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 470));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 280, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        FmEditarPerfil fmEditarPerfil = new FmEditarPerfil(this, usuario);
        fmEditarPerfil.show();
        setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCrearChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearChatActionPerformed
        if (validarUsuariosBD()) {
            FmCrearChat fmCrearChat = new FmCrearChat(this, usuario);
            fmCrearChat.show();
            setVisible(false);
        }else{
            mostrarMensaje();
        }

    }//GEN-LAST:event_btnCrearChatActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Método que se encarga de validar que existan usuarios registrados antes de
     * crear un chat.
     * @return Indica si contiene usuarios registrados la base de datos o no.
     */
    private boolean validarUsuariosBD(){
        if(!usuarioRepository.buscarTodas().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Se muestra un mensaje indicando que no hay usuarios registrados en la base de datos
     * para invitar a un chat.
     */
    private void mostrarMensaje(){
        JOptionPane.showMessageDialog(this, "No hay usuarios registrados en la base de "
                + "datos.", "Alerta", JOptionPane.WARNING_MESSAGE); 
    
    }
    
    /**
     * Metodo que mostrara la información del cliente que inicio sesion en la pantalla principal.
     */
    private void mostrarDatos(){
        //Se muestra solamente el nombre del usuario en la pantalla principal.
        txtNombre.setText(usuario.getNombre());
        
        //Mostrar los chats del usuario en la pantalla de inicio.
        mostrarChats();
     }
    
    /**
     * Método que se encarga de mostrar en una tabla los chats que tiene el usuario.
     */
    private void mostrarChats() {
        if (!usuario.getMensajes().isEmpty()) {
            //Mostrar la cantidad de chats que tiene el usuario.
            int contador = 0;

            DefaultTableModel modelo = (DefaultTableModel) tbChats.getModel();
            modelo.setRowCount(0);
            Object[] columna = new Object[2];

            //Mostrar los chats en la tabla
            for (Rel_UsuariosChats chat : usuario.getChats()) {

                columna[0] = chat.getChat().getTitulo();

                //Obtener el ultimo mensaje para mostrarlo en los chats
                columna[1] = chat.getChat().getMensajes().get(chat.getChat().getMensajes().size() - 1).getTexto();

                //Agregar el chat a la tabla.
                modelo.addRow(columna);
                contador++;
            }
            txtNumChats.setText(String.valueOf(contador));
            txtNumChats.setEnabled(false);
        }else{
            txtNumChats.setText("0");
            txtNumChats.setEnabled(false);
        }

    }

     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/whatsapp.png"));
        return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearChat;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblBuscarChat;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGris;
    private javax.swing.JLabel lblNumChats;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tbChats;
    private javax.swing.JTextField txtBuscarChat;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumChats;
    // End of variables declaration//GEN-END:variables
}
