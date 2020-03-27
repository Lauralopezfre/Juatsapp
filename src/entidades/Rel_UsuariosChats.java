package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author laura
 */

@Entity
@Table (name = "Rel_UsuariosChats")
public class Rel_UsuariosChats implements Serializable {

    //Atributos de la clase rel_usuarioschat
    private static final long serialVersionUID = 1L;    
    private Long id;
    private Usuario usuario;
    private Chat chat;

    /**
     * Constructor default de la clase
     */
    public Rel_UsuariosChats() {}
        
    /**
     * Constructor que incializa los atributos usuario y chat
     * @param usuario
     * @param chat 
     */
    public Rel_UsuariosChats(Usuario usuario, Chat chat) {
        this.usuario = usuario;
        this.chat = chat;
    }

    /**
     * Constuctor que inicializa los atributos id, usuarios y chat
     * @param id
     * @param usuario
     * @param chat 
     */
    public Rel_UsuariosChats(Long id, Usuario usuario, Chat chat) {
        this.id = id;
        this.usuario = usuario;
        this.chat = chat;
    }     
    
    /**
     * Método que retorna el id de rel_usuarioschat
     * @return 
     */
    @Column (name = "IdRel_UsuariosChats")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica el id de rel_usuarioschat
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Método que retorna el usuario de rel_usuarioschat
     * @return 
     */
    @ManyToOne()
    @JoinColumn (name = "Usuario")
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Método que modifica el id de rel_usuarioschat
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Método que retorna el chat de rel_usuarioschat
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "Chat")
    public Chat getChat() {
        return chat;
    }

    /**
     * Método que modifica el chat de rel_usuarioschat
     * @param chat 
     */
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    /**
     * Método hash que devuelve un entero
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Método equals que obtiene un Object lo compara y regresa un booleano
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_UsuariosChats)) {
            return false;
        }
        Rel_UsuariosChats other = (Rel_UsuariosChats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Método toString que da formato al String
     * @return 
     */
    @Override
    public String toString() {
        return "entidades.Rel_UsuariosChats[ id=" + id + " ]";
    }
    
}
