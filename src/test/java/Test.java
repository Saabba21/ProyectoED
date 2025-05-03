import PlantillaCodigo.Libro;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {
        @org.junit.jupiter.api.Test
        void testHayCopias(){
            Libro libro = new Libro("Lengua", "Javi", "lap", "9878786565", 2 );
            assertTrue(libro.hayCopiasDisponibles());
        }

        @org.junit.jupiter.api.Test
        void testNoHayCopias(){
            Libro libro = new Libro("Mates", "Pablo", "yin", "2234433343", 0);
            assertFalse(libro.hayCopiasDisponibles());
        }


}
