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
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author laura
 */

@Entity
@Table(name = "Mensajes")
public class Mensaje implements Serializable {

    //Atributos de la clase Mensaje
    private static final long serialVersionUID = 1L;
    private Long id;
    private String texto;
    private Usuario usuario;
    private Chat chat;
    private DateTime fecha;

    /**
     * Constructor default de la clase mensaje
     */
    public Mensaje() {}

    /**
     * Constructor que inicializa los parametros texto, usuario, chat 
     * y fecha
     * @param texto
     * @param usuario
     * @param chat
     * @param fecha 
     */
    public Mensaje(String texto, Usuario usuario, Chat chat, DateTime fecha) {
        this.texto = texto;
        this.usuario = usuario;
        this.chat = chat;
        this.fecha = fecha;
    }
    
    /**
     * Constructor que inicializa los parametros id, texto, usuario, chat 
     * y fecha
     * @param id
     * @param texto
     * @param usuario
     * @param chat
     * @param fecha 
     */
    public Mensaje(Long id, String texto, Usuario usuario, Chat chat, DateTime fecha) {
        this.id = id;
        this.texto = texto;
        this.usuario = usuario;
        this.chat = chat;
        this.fecha = fecha;
    }    

    /**
     * Método que retorna id de mensaje
     * @return 
     */
    @Column(name = "IdMensaje")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de mensaje
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que retorna texto de mensaje
     * @return 
     */
    @Column(name = "Texto")
    public String getTexto() {
        return texto;
    }

    /**
     * Método que modifica texto de mensaje
     * @param texto 
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Método que retorna usuario de mensaje
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "Usuario")
    public Usuario getUsuario() {
        return usuario;
    }
        
    /**
     * Método que modifica usuario de mensaje
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método que retorna chat de mensaje
     * @return 
     */
    @ManyToOne
    @JoinColumn(name = "Chat")
    public Chat getChat() {
        return chat;
    }
       
    /**
     * Método que modifica chat de mensaje
     * @param chat 
     */
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    /**
     * Método que retorna fecha de mensaje
     * @return 
     */
    @Column(name = "Fecha")
    public DateTime getFecha() {
        return fecha;
    }

    /**
     * Método que modifica fecha de mensaje
     * @param fecha 
     */
    public void setFecha(DateTime fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
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
        return "entidades.Mensaje[ id=" + id + " ]";
    }

}
