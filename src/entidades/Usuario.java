/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private static final long serialVersionUID = 1L;    
    private Long id;
    private String correo;
    private int edad;
    private Sexo sexo;
    private List<Mensaje> mensajes;
    private List<Rel_UsuariosChats> chats;
    
    public Usuario(){
        this.chats = new ArrayList<>();
        this.mensajes = new ArrayList<>();
    }

    public Usuario(String correo, int edad, Sexo sexo) {
        this();
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Usuario(Long id, String correo, int edad, Sexo sexo) {
        this();
        this.id = id;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;   
    }    

    @Column (name = "IdUsuario")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "Correo")
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Column (name = "Edad")
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Column (name = "Sexo")
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    public List<Rel_UsuariosChats> getChats() {
        return chats;
    }
    
    public void setChats(List<Rel_UsuariosChats> chats) {
        this.chats = chats;
    }
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuario[ id=" + id + " ]";
    }
    
}
