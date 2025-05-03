package PlantillaCodigo;

/**
 * Clase abstracta que representa a una persona.
 * Esta clase sirve como base para Bibliotecario y Usuario que extienden sus propiedades y métodos.
 */
public abstract class Persona {

    // Atributos de la persona
    protected String id;
    protected String nombre;
    protected String correo;

    /**
     * Constructor de la clase Persona.
     * Inicializa los valores de id, nombre y correo.
     *
     * @param id El identificador único de la persona.
     * @param nombre El nombre completo de la persona.
     * @param correo La dirección de correo electrónico de la persona.
     */
    public Persona(String id, String nombre, String correo) {
        // Constructor
    }

    /**
     *
     * @return El identificador de la persona.
     */
    public String getId() {
        return "";
    }

    /**
     *
     * @param id El nuevo identificador de la persona.
     */
    public void setId(String id) {
    }

    /**
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return "";
    }

    /**
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
    }

    /**
     *
     * @return El correo electrónico de la persona.
     */
    public String getCorreo() {
        return "";
    }

    /**
     * Establece el correo electrónico de la persona.
     *
     * @param correo El nuevo correo electrónico de la persona.
     */
    public void setCorreo(String correo) {
    }

    /**
     *
     * @return Una cadena con la información de la persona.
     */
    @Override
    public String toString() {
        return "";
    }
}