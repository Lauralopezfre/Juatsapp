/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author laura
 */
@Entity
public class Rel_UsuariosChats implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Usuario usuario;
    private Chat chat;

    public Rel_UsuariosChats(Usuario Usuario, Chat Chat) {
        this.usuario = Usuario;
        this.chat = Chat;
    }
    
    @ManyToOne()
    @JoinColumn (name = "Usuario")
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.usuario = Usuario;
    }
    
    @ManyToOne
    @JoinColumn(name = "Chat")
    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat Chat) {
        this.chat = Chat;
    }
    
    
    
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
        if (!(object instanceof Rel_UsuariosChats)) {
            return false;
        }
        Rel_UsuariosChats other = (Rel_UsuariosChats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Rel_UsuariosChats[ id=" + id + " ]";
    }
    
}
