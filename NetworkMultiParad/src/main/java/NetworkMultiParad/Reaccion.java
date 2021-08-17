package NetworkMultiParad;

import java.time.LocalDate;
/**
 *
 * @author dsall
 */
public abstract class Reaccion {
    private int id; //Identificador unico de la reaccion
    private Usuario autor; //Autor de la reaccion
    private LocalDate fecha; //Fecha de la reaccion
    private String tipo; //Tipo de reaccion

    /**
     * Permite crear una reaccion
     * @param id identificador
     * @param autor autor de la reaccion
     * @param fecha fecha de la reaccion
     * @param tipo tipo de reaccion
     */
    public Reaccion(int id, Usuario autor, LocalDate fecha, String tipo) {
        this.id = id;
        this.autor = autor;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    /**
     * Consigue el id de la reaccion
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
     * Consigue el autor de la reaccion
     * @return el autor
     */
    public Usuario getAutor() {
        return autor;
    }
    /**
     * Cambia el dato del autor
     * @param autor el autor a cambiar
     */
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    /**
     * Conseguir la fecha de la reaccion
     * @return la fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /**
     * Cambiar la fecha de la reaccion
     * @param fecha fecha a cambiar
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * Conseguir el tipo de reaccion
     * @return el tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Cambiar el tipo de reaccion
     * @param tipo el tipo a cambiar
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
    
    
}
