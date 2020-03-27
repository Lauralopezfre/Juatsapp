
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author laura
 */

@Entity
@Table (name = "Chats")
public class Chat implements Serializable {

    //Atributos de la clase Chat
    private static final long serialVersionUID = 1L;    
    private Long id;
    private List<Rel_UsuariosChats> usuarios;
    private List<Mensaje> mensajes;

    /**
     * Constructor que crea las listas de usuarios y mensajes
     */
    public Chat() {
        this.mensajes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Constuctor que llama al otro constructor que crea las listas
     * de usuarios y mensajes, y ademas inicializa el atributo de id
     * @param id 
     */
    public Chat(Long id) {
        this();
        this.id = id;
    }
    
    /**
     * Método que retorna id de chat
     * @return 
     */
    @Column(name = "IdChat")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de chat
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Método que devuelve un ArrayList de los usuarios de un chat
     * @return 
     */
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    public List<Rel_UsuariosChats> getUsuarios() {
        return usuarios;
    }

    /**
     * Método que modifica la lista de usuarios de chat
     * @param usuarios 
     */
    public void setUsuarios(List<Rel_UsuariosChats> usuarios) {
        this.usuarios = usuarios;
    }
    
    /**
     * Método que devuelve un ArrayList de los mensajes de un chat
     * @return 
     */
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    /**
     * Método que modifica la lista de mensajes de chat
     * @param mensajes 
     */
    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
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
        if (!(object instanceof Chat)) {
            return false;
        }
        Chat other = (Chat) object;
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
        return "entidades.Chat[ id=" + id + " ]";
    }
    
}
