/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkMultiParad;

import java.time.LocalDate;

/**
 * Clase que representa una publicacion compartida
 * @author dsall
 */
public class Compartir {
    private Publicacion publicacion; //Publicacion compartida
    private LocalDate fecha; //Fecha en la que se compartio
    private Usuario autor; //Autor del compartido
    
    /**
     * Permite crear una publicacion compartida
     * @param publicacion publicacion a compartir
     * @param fecha fecha de comparticion
     */
    public Compartir(Publicacion publicacion, LocalDate fecha, Usuario autor) {
        this.publicacion = publicacion;
        this.fecha = fecha;
        this.autor = autor;
    }
    /**
     * Consigue la publicacion compartida
     * @return la publicacion compartida
     */
    public Publicacion getPublicacion() {
        return publicacion;
    }
    /**
     * Cambia la publicacion compartida
     * @param publicacion la publicacion a cambiar
     */
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    /**
     * Consigue la fecha de comparticion
     * @return fecha de comparticion
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /**
     * Cambia la fecha de comparticion
     * @param fecha la fecha a cambiar
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * Consigue el autor del compartido
     * @return el autor que compartio
     */
    public Usuario getAutor() {
        return autor;
    }
    /**
     * Cambia el autor del compartido
     * @param autor autor a cambiar
     */
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    
    public String shareToString(){
        String string = "";
        string = string+"Publicacion:\n"+getPublicacion().postToString()+"\nFecha Compartido: "+getFecha()+"\nAutor: "+getAutor();
        return string;
    }    
    
}