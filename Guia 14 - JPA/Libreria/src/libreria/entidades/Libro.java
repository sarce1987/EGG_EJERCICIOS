
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Libro")
public class Libro implements Serializable {
    //Atributos
    @Id
    @Column(name = "id_isbn")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "anio")
    private Integer anio;
    
    @Column(name = "ejemplares")
    private Integer ejemplares;
    
    @Column(name = "ejemplares_prestados")
    private Integer ejemplaresPrestados;
    
    @Column(name = "ejemplares_restantes")
    private Integer ejemplaresRestasten;
    
    @Column(name = "alta")
    private Boolean alta;
    
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;
    
    //Constructores
    public Libro() {
    }

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestasten, Boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestasten = ejemplaresRestasten;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestasten() {
        return ejemplaresRestasten;
    }

    public void setEjemplaresRestasten(Integer ejemplaresRestasten) {
        this.ejemplaresRestasten = ejemplaresRestasten;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + ", ejemplaresRestasten=" + ejemplaresRestasten + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    
    
    
}
