
package repositories;

import entidades.Chat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import entidades.Mensaje;
import entidades.Usuario;

/**
 *
 * @author Estefanía Aguilar
 */
public class MensajeRepository extends BaseRepository<Mensaje>{

    /**
     * Constructor default de la clase
     */
    public MensajeRepository() {}
    
    /**
     * Método implementado de la clase BaseRepository para guardar un mensaje
     * @param mensaje 
     */
    @Override
    public void guardar(Mensaje mensaje) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mensaje);
        entityManager.getTransaction().commit();   
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un mensaje
     * por id
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Mensaje mensaje = entityManager.find(Mensaje.class, id);
        if (mensaje != null){
            entityManager.remove(mensaje);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un mensaje
     * @param mensajeActualizado 
     */
    @Override
    public void actualizar(Mensaje mensajeActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Mensaje mensaje = entityManager.find(Mensaje.class, mensajeActualizado.getId());
        if(mensaje != null){
            mensaje.setTexto(mensajeActualizado.getTexto());
            mensaje.setUsuario(mensajeActualizado.getUsuario());
            mensaje.setChat(mensajeActualizado.getChat());
            mensaje.setFecha(mensajeActualizado.getFecha());
            entityManager.merge(mensaje);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un mensaje
     * por id
     * @param id
     * @return 
     */
    @Override
    public Mensaje buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Mensaje mensaje = entityManager.find(Mensaje.class, id);
        entityManager.getTransaction().commit();
        return mensaje;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todos los mensajes
     * y regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Mensaje> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Mensaje.class));
        Query query = entityManager.createQuery(criteria);
        List<Mensaje> mensajes = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(mensajes);  
    }
    
    /**
     * Método para obtener un chat de un mensaje
     * @param idChat
     * @return 
     */
    public Chat obtenerProveedor(Long idChat) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Chat chat = entityManager.find(Chat.class, idChat);
        entityManager.getTransaction().commit();
        return chat;
    }
    
    /**
     * Método para obtener un usuario de un mensaje
     * @param idUsuario
     * @return 
     */
    public Usuario obtenerCategoria(Long idUsuario) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Usuario usuario = entityManager.find(Usuario.class, idUsuario);
        entityManager.getTransaction().commit();
        return usuario;
    }
}
