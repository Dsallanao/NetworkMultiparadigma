/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkMultiParad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el comentario de una publicacion
 * @author dsall
 */
public class Comentario extends Reaccion {
    private String contenido; //Contenido del comentario
    private ArrayList<Comentario> comentarios; //Comentarios de los comentarios

    /**
     * Permite crear un comentario
     * @param contenido contenido del comentario
     * @param id identificador del comentario
     * @param autor autor del comentario
     * @param fecha fecha del comentario
     */
    public Comentario(String contenido, int id, Usuario autor, LocalDate fecha) {
        super(id, autor, fecha, "Comentario");
        this.contenido = contenido;
        this.comentarios = new ArrayList();
    }    
    /**
     * Consigue el contenido del comentario
     * @return el contenido del comentario
     */
    public String getContenido() {
        return contenido;
    }
    /**
     * Cambia el contenido del comentario
     * @param contenido contenido a cambiar
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    /**
     * Consigue los comentarios de este comentario
     * @return comentarios del comentario
     */
    public List<Comentario> getComentarios() {
        return comentarios;
    }
    /**
     * Cambiar los comentarios del comentario
     * @param comentarios comentarios a cambiar
     */
    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    /**
     * Convierte un comentario a string
     * @return string con el comentario
     */
    public String commentToString(){
        String string = "";
        string = string+"ID: "+getId()+"\nAutor: "+getAutor().getNickname()+"\nFecha: "+getFecha()+"\nTipo: "+getTipo()+"\nContenido: "+getContenido();
        int i;
        for(i=0; i<comentarios.size(); i++){
            string = string+"Comentario "+i+":\nID: "+getComentarios().get(i).getId()+"\nAutor: "+getComentarios().get(i).getAutor().getNickname()+"\nFecha: "+getComentarios().get(i).getFecha()+"\nTipo: "+getComentarios().get(i).getTipo()+"\nContenido: "+getComentarios().get(i).getContenido();
        }
        return string;
    }
}
