package steps;

import PlantillaCodigo.*;
import io.cucumber.java.es.*;
import static org.junit.jupiter.api.Assertions.*;
public class PrestamoSteps {
    Bibliotecario bibliotecario;
    Usuario user;
    Libro libro;
    Prestamo prestamo;

    @Dado("un bibliotecario")
    public void creoBibliotecario(){
        bibliotecario = new Bibliotecario("1", "Camilo", "cam@es.com");
    }
    @Y("un usuario")
    public void creoUsuario(String nombre){
        Usuario usuario = new Usuario(nombre, "3", "j@k.es");
    }
    @Y("un libro")
    public void creoLibro(String titulo) {
        Libro libro = new Libro(titulo, "Kafka", "LL", "766776734763", 3);
    }
    @Cuando("el usuario presta el libro al usuario")
    public void prestarLibro(){
        prestamo = bibliotecario.prestarLibro(user, libro);
    }
    @Entonces("Se debe crear un préstamo con el libro elegido")
    public void verificaPrestamo(String tituloEsperado){
        assertNotNull(prestamo);
        assertEquals(tituloEsperado,prestamo.getLibro().getTitulo());
    }
}
