package entidades;

import Enum.Sexo;
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
@Table (name = "Usuarios")
public class Usuario implements Serializable {

    //Atributos de la clase usuario
    private static final long serialVersionUID = 1L;    
    private Long id;
    private String foto, nombre, contrasenia, correo;
    private int edad;
    private Sexo sexo;
    private List<Mensaje> mensajes;
    private List<Rel_UsuariosChats> chats;
    
    /**
     * Constructor que crea las listas de mensajes y chats
     */
    public Usuario(){
        this.chats = new ArrayList<>();
        this.mensajes = new ArrayList<>();
    }

    /**
     * Constructor que llama al otro constructor que crea las listas
     * de mensajes y chats, y además inicializa los atributos correo, edad
     * y sexo
     * @param foto
     * @param nombre
     * @param contrasenia
     * @param correo
     * @param edad
     * @param sexo 
     */
    public Usuario(String foto, String nombre, String contrasenia, String correo, int edad, Sexo sexo) {
        this();
        this.foto = foto;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;
    }
    

    /**
     * Constructor que llama al otro constructor que crea las listas
     * de mensajes y chats, y además inicializa los atributos id, correo, edad
     * y sexo
     * @param id
     * @param foto
     * @param nombre
     * @param contrasenia
     * @param correo
     * @param edad
     * @param sexo 
     */
    public Usuario(Long id, String foto, String nombre, String contrasenia, String correo, int edad, Sexo sexo) {
        this();
        this.foto = foto;
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;   
    }    

    /**
     * Método que retorna id de usuario
     * @return 
     */
    @Column (name = "IdUsuario")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    /**
     * Método que modifica id de usuario
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método que retorna el atributo foto de usuario
     * @return 
     */
    @Column (name = "Foto")
    public String getFoto() {
        return foto;
    }

    /**
     * * Método que modifica el atributo foto de usuario
     * @param foto 
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
        
    /**
     * Método que retorna nombre de usuario
     * @return 
     */
    @Column (name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica nombre de usuario
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    /**
     * Método que retorna contrasenia de usuario
     * @return 
     */
    @Column (name =  "Constrasenia")
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Método que modifica contrasenia de usuario
     * @param contrasenia 
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }       
    
    /**
     * Método que retorna correo de usuario
     * @return 
     */
    @Column(name = "Correo")
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que modifica correo de usuario
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * Método que retorna edad de usuario
     * @return 
     */
    @Column (name = "Edad")
    public int getEdad() {
        return edad;
    }

    /**
     * Método que modifica edad de usuario
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Método que retorna sexo de usuario
     * @return 
     */
    @Column (name = "Sexo")
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Método que modifica sexo de usuario
     * @param sexo 
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    /**
     * Método que devuelve un ArrayList de los chats de usuario
     * @return 
     */
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    public List<Rel_UsuariosChats> getChats() {
        return chats;
    }
    
    /**
     * Método que modifica la lista de chats de usuario
     * @param chats 
     */
    public void setChats(List<Rel_UsuariosChats> chats) {
        this.chats = chats;
    }
    
    /**
     * Método que devuelve un ArrayList de los mensajes de usuario
     * @return 
     */
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    /**
     * Método que modifica la lista de mensajes de usuario
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
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
        return id + " " + nombre;
    }
    
}
