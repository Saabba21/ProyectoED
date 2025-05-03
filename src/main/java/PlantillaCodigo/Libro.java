package PlantillaCodigo;

/**
 * Clase que representa un libro dentro del sistema de gestión.
 * Cada libro tiene un título, autor, editorial, ISBN y número de copias disponibles.
 */
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    private int copias;

    /**
     * Constructor de la clase Libro.
     *
     * @param titulo    Título del libro.
     * @param autor     Autor del libro.
     * @param editorial Editorial del libro.
     * @param isbn      Código ISBN del libro.
     * @param copias    Número de copias disponibles.
     */
    public Libro(String titulo, String autor, String editorial, String isbn, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.copias = copias;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return Título.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return Autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve la editorial del libro.
     *
     * @return Editorial.
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Devuelve el ISBN del libro.
     *
     * @return ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Devuelve el número de copias disponibles del libro.
     *
     * @return Número de copias.
     */
    public int getCopias() {
        return copias;
    }

    /**
     * Establece el número de copias disponibles del libro.
     *
     * @param copias Nueva cantidad de copias.
     */
    public void setCopias(int copias) {
        this.copias = copias;
    }

    public boolean hayCopiasDisponibles(){
        return copias > 0;
    }
}