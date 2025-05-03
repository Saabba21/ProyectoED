package PlantillaCodigo;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase que representa a un bibliotecario, quien gestiona usuarios y libros en una biblioteca.
 * Hereda de la clase {@link Persona}.
 */
public class Bibliotecario extends Persona {

    /**
     * Constructor de la clase Bibliotecario.
     * Inicializa los valores de id, nombre y correo para el bibliotecario.
     *
     * @param id El identificador único del bibliotecario.
     * @param nombre El nombre completo del bibliotecario.
     * @param correo La dirección de correo electrónico del bibliotecario.
     */
    public Bibliotecario(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    /**
     * Registra a un nuevo usuario en la biblioteca.
     *
     * @param usuario El usuario a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
    }

    /**
     * Elimina un usuario de la biblioteca.
     *
     * @param usuario El usuario a eliminar.
     */
    public void eliminarUsuario(Usuario usuario) {
    }

    /**
     * Agrega un nuevo libro al inventario de la biblioteca.
     *
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
    }

    /**
     * Elimina un libro del inventario de la biblioteca.
     *
     * @param isbn El número ISBN del libro a eliminar.
     */
    public void eliminarLibro(String isbn) {
    }

    /**
     * Presta un libro a un usuario.
     *
     * @param usuario El usuario que solicita el préstamo.
     * @param libro El libro que se va a prestar.
     * @return El objeto {@link Prestamo} con los detalles del préstamo.
     */
    public Prestamo prestarLibro(Usuario usuario, Libro libro) {
        return new Prestamo(libro, usuario, LocalDate.now(), LocalDate.now());
    }

    /**
     * Recibe la devolución de un libro previamente prestado.
     *
     * @param prestamo El préstamo que se está devolviendo.
     */
    public void recibirDevolucion(Prestamo prestamo) {
    }

    /**
     * Lista todos los usuarios registrados en la biblioteca.
     *
     * @return Una lista de objetos {@link Persona} que representan a los usuarios.
     */
    public List<Persona> listarUsuarios() {
        return List.of();
    }

    /**
     * Lista todos los libros disponibles en la biblioteca.
     *
     * @return Una lista de objetos {@link Libro} que representan los libros en el inventario.
     */
    public List<Libro> listarLibros() {
        return List.of();
    }
}