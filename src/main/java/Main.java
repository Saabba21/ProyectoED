import PlantillaCodigo.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Lengua", "Javi", "lap", "9878786565", 0 );
        Libro l2 = new Libro("Mates", "Pablo", "yin", "2234433343", 3 );
        Libro l3 = new Libro("Historia", "José", "pom", "099886766", 5 );

        Libro[] array = new Libro[3];
        array[0] = l1;
        array[1] = l2;
        array[2] = l3;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i].hayCopiasDisponibles());
        }


    }
}
