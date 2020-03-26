
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

/**
 *
 * @author laura
 */
@Entity
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private List<Rel_UsuariosChats> usuarios;
    private List<Mensaje> mensajes;

    public Chat() {
        this.mensajes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public Chat(List<Mensaje> mensajes) {
        this();
        this.mensajes = mensajes;
    }

    public Chat(Long id,List<Mensaje> mensajes) {
        this();
        this.id = id;
        this.mensajes = mensajes;
    }
    
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    public List<Rel_UsuariosChats> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Rel_UsuariosChats> usuarios) {
        this.usuarios = usuarios;
    }
    
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
    
    @Column(name = "IdChat")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

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

    @Override
    public String toString() {
        return "entidades.Chat[ id=" + id + " ]";
    }
    
}
