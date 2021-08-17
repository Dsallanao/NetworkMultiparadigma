package NetworkMultiParad;

import java.util.ArrayList;

/**
 * Clase que representa un usuario
 * @author dsall
 */
public class Usuario {
    private int id; //Id unico del usuario
    private String nickname; //El nombre de usuario
    private String password; //La contraseña del usuario
    private ArrayList<Publicacion> publicaciones; //Publicaciones del usuario
    private ArrayList<Compartir> compartidos; //Compartidos del usuario
    private ArrayList<Usuario> seguidores; //Seguidores del usuario
    private ArrayList<Usuario> seguidos; //Seguidos del usuario

    /**
     * Permite crear un usuario
     * @param id identificador unico del usuario
     * @param nickname nombre del usuario
     * @param password contraseña del usuario
     */
    public Usuario(int id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.publicaciones = new ArrayList();
        this.compartidos = new ArrayList();
        this.seguidores = new ArrayList();
        this.seguidos = new ArrayList();
    }
    /**
     * Consige el id
     * @return el id
     */
    public int getId() {
        return id;
    }
    /**
     * Cambia el dato del id
     * @param id el id a cambiar
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Consige el nombre del usuario
     * @return el nombre de usuario
     */
    public String getNickname() {
        return nickname;
    }
    /**
     * Cambia el dato de nombre de usuario
     * @param nickname el nombre de usuario a cambiar
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    /**
     * Consigue la contraseña del usuario
     * @return la contraseña
     */
    public String getPassword() {
        return password;
    }
    /**
     * Cambia el dato de la contraseña
     * @param password la contraseña a cambiar
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Consigue la lista de publicaciones
     * @return lista de publicaciones
     */
    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }
    /**
     * Cambia el dato de la lista de publicaciones
     * @param publicaciones lista de publicaciones a cambiar
     */
    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    /**
     * Añadir una publicacion al usuario
     * @param publicacion publicacion a añadir
     */
    public void addPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }
    /**
     * Consigue las publicaciones compartidas del usuario
     * @return compartidos
     */
    public ArrayList<Compartir> getCompartidos() {
        return compartidos;
    }
    /**
     * Cambia los compartidos del usuario
     * @param compartidos los compartidos a cambiar
     */
    public void setCompartidos(ArrayList<Compartir> compartidos) {
        this.compartidos = compartidos;
    }
    /**
     * Añadir un compartido al usuario
     * @param compartido publicacion a compartir
     */
    public void addCompartido(Compartir compartido){
        this.compartidos.add(compartido);
    }
    /**
     * Consigue los seguidores del usuario
     * @return lista de seguidores
     */
    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }
    /**
     * Cambia la lista de seguidores del usuario
     * @param seguidores la lista a cambiar
     */
    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }
    /**
     * Añadir un seguidor al usuario
     * @param usuario usuario a agregar
     */
    public void addSeguidor(Usuario usuario){
        this.seguidores.add(usuario);
    }
    /**
     * Consigue los seguidos del usuario
     * @return lista de seguidores
     */
    public ArrayList<Usuario> getSeguidos() {
        return seguidos;
    }
    /**
     * Cambia la lista de seguidos del usuario
     * @param seguidos la lista a cambiar
     */
    public void setSeguidos(ArrayList<Usuario> seguidos) {
        this.seguidos = seguidos;
    }
    /**
     * Añadir un seguidor al usuario
     * @param usuario usuario a agregar
     */
    public void addSeguido(Usuario usuario){
        this.seguidos.add(usuario);
    }
    
    public boolean isSeguido(Usuario usuario){
        int i;
        boolean is=false;
        for(i=0; i<seguidos.size(); i++){
            if(seguidos.get(i).equals(usuario)){
                is=true;
                break;
            }
        }
        return is;
    }
    /**
     * Convierte un usuario a string
     * @return el string con el usuario
     */
    public String userToString(){
        String string = "";
        string = string+"ID: "+getId()+"\nNombre de Usuario: "+getNickname()+"\n";
        string = string+"Publicaciones:\n";
        int i;
        for(i=0; i<publicaciones.size(); i++){
            string = string+"Publicacion "+i+":\n"+getPublicaciones().get(i).postToString();
        }
        string = string+"\nCompartidos:\n";
        for(i=0; i<compartidos.size(); i++){
            string = string+"Publicacion compartida "+i+":\n"+getCompartidos().get(i).shareToString();
        }
        string = string+"\nSeguidores:\n";
        for(i=0; i<seguidores.size(); i++){
            string = string+"\nSeguidor "+i+":\n"+"ID: "+getSeguidores().get(i).getId()+"\nNombre de Usuario: "+getSeguidores().get(i).getNickname()+"\n";
        }
        string = string+"\nSeguidos:\n";
        for(i=0; i<seguidos.size(); i++){
            string = string+"\nSeguido "+i+":\n"+"ID: "+getSeguidos().get(i).getId()+"\nNombre de Usuario: "+getSeguidores().get(i).getNickname()+"\n";
        } 
        return string;
    }
}
