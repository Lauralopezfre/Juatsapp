
package repositories;

/**
 *
 * @author Estefanía Aguilar
 */
public class Control {
    
    /**
     * Esta clase funciona como intermediaria entre la capa de repositorios y la 
     * presentación, se retornan los objetos repository si estos existen y su
     * valor es diferente a null, de no ser así se crea uno nuevo y se retorna.
     **/
    
    //Atributos de la clase Control
     private ChatRepository chatRepository;
     private UsuarioRepository usuarioRepository;
     private MensajeRepository mensajeRepository;
    
    public ChatRepository getChatRepository(){
        if(this.chatRepository != null){
            return this.chatRepository;
        }else{
            this.chatRepository = new ChatRepository();
            return this.chatRepository;
        }
    }   
    
    public UsuarioRepository getUsuarioRepository(){
        if(this.usuarioRepository != null){
            return this.usuarioRepository;
        }else{
            this.usuarioRepository = new UsuarioRepository();
            return this.usuarioRepository;
        }
    }
    
    public MensajeRepository getMensajeRepository(){
        if(this.mensajeRepository != null){
            return this.mensajeRepository;
        }else{
            this.mensajeRepository = new MensajeRepository();
            return this.mensajeRepository;
        }
    }
}
