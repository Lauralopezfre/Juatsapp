
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import entidades.Chat;

/**
 *
 * @author Estefanía Aguilar
 */
public class ChatRepository extends BaseRepository<Chat>{

    /**
     * Constructor default de la clase
     */
    public ChatRepository() {}
    
    /**
     * Método implementado de la clase BaseRepository para guardar un chat
     * @param chat 
     */
    @Override
    public void guardar(Chat chat) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(chat);
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un chat por id
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Chat chat = entityManager.find(Chat.class, id);
        if(chat != null){
            entityManager.remove(chat);
        }        
        entityManager.getTransaction().commit();   
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un chat
     * @param chatActualizado 
     */
    @Override
    public void actualizar(Chat chatActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Chat chat = entityManager.find(Chat.class, chatActualizado.getId());
        if(chat != null){
            chat.setTitulo(chatActualizado.getTitulo());
            chat.setMensajes(chatActualizado.getMensajes());
            chat.setUsuarios(chatActualizado.getUsuarios());
            entityManager.merge(chat);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un chat
     * por id
     * @param id
     * @return 
     */
    @Override
    public Chat buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Chat chat = entityManager.find(Chat.class, id);
        entityManager.getTransaction().commit();
        return chat;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todos los chats
     * y que devuelve un ArrayList con ellos.
     * @return 
     */
    @Override
    public ArrayList<Chat> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Chat.class));
        Query query = entityManager.createQuery(criteria);
        List<Chat> chats = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(chats);     
    }
    
}
