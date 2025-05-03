import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import PlantillaCodigo.Libro;
import PlantillaCodigo.Prestamo;
import PlantillaCodigo.Usuario;
import org.junit.jupiter.api.Test;
public class TestMockito {
    @Test

        void testPrestamoConLibroMock(){
        Libro libro = mock(Libro.class);

        when(libro.hayCopiasDisponibles()).thenReturn(true);

        Usuario user = new Usuario("Pablo", "2", "pablo@gmail.com");

        Prestamo prestamo = new Prestamo(libro, user, LocalDate.now(), LocalDate.now());

        assertTrue(prestamo.getLibro().hayCopiasDisponibles());
    }
}
