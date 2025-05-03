package PlantillaCodigo;

import java.time.LocalDate;

/**
 * Representa un préstamo de un libro a un usuario.
 * Incluye la información del libro, el usuario, la fecha de inicio y la fecha de vencimiento del préstamo.
 */
public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;

    /**
     * Constructor de la clase Prestamo.
     *
     * @param libro           Libro que se presta.
     * @param usuario         Usuario al que se presta el libro.
     * @param fechaInicio     Fecha de inicio del préstamo.
     * @param fechaVencimiento Fecha de vencimiento del préstamo.
     */
    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaVencimiento) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Devuelve el libro prestado.
     *
     * @return Libro prestado.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Devuelve el usuario que recibió el préstamo.
     *
     * @return Usuario que recibe el libro.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Devuelve la fecha de inicio del préstamo.
     *
     * @return Fecha de inicio.
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Devuelve la fecha de vencimiento del préstamo.
     *
     * @return Fecha de vencimiento.
     */
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}