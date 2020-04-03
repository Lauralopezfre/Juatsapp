
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import entidades.Usuario;

/**
 *
 * @author Estefanía Aguilar
 */
public class UsuarioRepository extends BaseRepository<Usuario>{

    /**
     * Constructor default de la clase
     */
    public UsuarioRepository() {}
    
    /**
     * Método implementado de la clase BaseRepository para guardar un usuario
     * @param usuario 
     */
    @Override
    public void guardar(Usuario usuario) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un usuario
     * por id
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Usuario usuario = entityManager.find(Usuario.class, id);
        if(usuario != null){
            entityManager.remove(usuario);
        }        
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un usuario
     * @param usuarioActualizado 
     */
    @Override
    public void actualizar(Usuario usuarioActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Usuario usuario = entityManager.find(Usuario.class, usuarioActualizado.getId());
        if(usuario != null){
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setCorreo(usuarioActualizado.getCorreo());
            usuario.setContrasenia(usuarioActualizado.getContrasenia());
            usuario.setEdad(usuarioActualizado.getEdad());
            usuario.setSexo(usuarioActualizado.getSexo());
            usuario.setChats(usuarioActualizado.getChats());
            usuario.setMensajes(usuarioActualizado.getMensajes());
            entityManager.merge(usuario);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un usuario 
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public Usuario buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.getTransaction().commit();
        return usuario;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los usuarios
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Usuario> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Usuario.class));
        Query query = entityManager.createQuery(criteria);
        List<Usuario> usuarios = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(usuarios);
    }
    
}
