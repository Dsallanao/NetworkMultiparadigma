/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkMultiParad;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Clase que representa una publicacion
 * @author dsall
 */
public class Publicacion {
    private int id; //Identificador unico de la publicacion
    private String contenido; //Contenido de la publicacion
    private String tipo; //Tipo de publicacion
    private LocalDate fecha; //Fecha de la publicacion
    private Usuario autor; //Autor de la publicacion
    private ArrayList<Comentario> comentarios; //Comentarios de la publicacion

    /**
     * Permite crear una publicacion
     * @param id identificador de la publicacion
     * @param contenido contenido de la publicacion
     * @param tipo tipo de publicacion
     * @param fecha fecha de la publicacion
     * @param autor autor de la publicacion
     */
    public Publicacion(int id, String contenido, String tipo, LocalDate fecha, Usuario autor) {
        this.id = id;
        this.contenido = contenido;
        this.tipo = tipo;
        this.fecha = fecha;
        this.autor = autor;
        this.comentarios = new ArrayList();
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
     * Consigue el contenido
     * @return el contenido
     */
    public String getContenido() {
        return contenido;
    }    
    /**
     * Cambia el dato del contenido
     * @param contenido el contenido a cambiar
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    /**
     * Consigue el tipo de publicacion
     * @return tipo de publicacion
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Cambia el tipo de publicacion
     * @param tipo tipo a cambiar
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Consigue la fecha
     * @return la fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /**
     * Cambia la fecha
     * @param fecha fecha a cambiar
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * Consigue el autor
     * @return el autor
     */
    public Usuario getAutor() {
        return autor;
    }
    /**
     * Cambia el autor
     * @param autor autor a cambiar
     */
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    /**
     * Conseguir los comentarios de la publicacion
     * @return comentarios de la publicacion
     */
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
    /**
     * Cambiar los comentarios de la publicacion
     * @param comentarios comentarios a cambiar
     */
    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    /**
     * Añadir un comentario a la publicacion
     * @param comentario comentario a añadir
     */
    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }
    /**
     * Filtrar un comentario por su id
     * @param idComment id del comentario
     * @return comentario filtrado
     */
    public Comentario filtComment(int idComment){
        int i;
        Comentario comentario = null;
        for(i=0; i<comentarios.size(); i++){
            if(comentarios.get(i).getId()==idComment){
                comentario = comentarios.get(i);
                break;
            }
        }
        return comentario;
    }
    /**
     * Convierte una publicacion a string
     * @return el string con la publicacion
     */
    public String postToString(){
        String string = "";
        string = string+"ID: "+getId()+"\nContenido: "+getContenido()+"\nTipo: "+getTipo()+"\nFecha: "+getFecha()+"\nAutor: "+getAutor().getNickname()+"\n";
        int i;
        for(i=0; i<comentarios.size(); i++){
            string = string+"Comentario "+i+":\n"+comentarios.get(i).commentToString();
        }        
        return string;
    }
}