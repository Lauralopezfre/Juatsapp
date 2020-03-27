/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author laura
 */
@Entity
public class Mensaje implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;
    private String texto;
    private Usuario usuario;
    private DateTime fecha;
    private Chat chat;

    public Mensaje() {
    }

    
    public Mensaje(Long id, String texto, Usuario usuario, DateTime fecha, Chat chat) {
        this.id = id;
        this.texto = texto;
        this.usuario = usuario;
        this.fecha = fecha;
        this.chat = chat;
    }

    public Mensaje(String texto, Chat chat, Usuario usuario, DateTime fecha) {
        this.texto = texto;
        this.usuario = usuario;
        this.fecha = fecha;
        this.chat = chat;
    }
    
    @Column(name = "IdMensaje")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column (name = "Texto")
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    @ManyToOne
    @JoinColumn(name = "")
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Column (name = "Fecha")
    public DateTime getFecha() {
        return fecha;
    }

    public void setFecha(DateTime fecha) {
        this.fecha = fecha;
    }

    @ManyToOne
    @JoinColumn(name = "chat")
    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
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
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Mensaje[ id=" + id + " ]";
    }
    
}
