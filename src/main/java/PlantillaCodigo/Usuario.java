package PlantillaCodigo;

/**
 * Representa un usuario registrado en la biblioteca.
 * Un usuario tiene un nombre, un ID único y un correo electrónico.
 */
public class Usuario {
    private String nombre;
    private String id;
    private String correo;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre Nombre del usuario.
     * @param id     Identificador único del usuario.
     * @param correo Correo electrónico del usuario.
     */
    public Usuario(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    /**
     * Devuelve el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el ID del usuario.
     *
     * @return ID del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el correo electrónico del usuario.
     *
     * @return Correo del usuario.
     */
    public String getCorreo() {
        return correo;
    }
}