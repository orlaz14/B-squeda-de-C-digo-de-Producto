import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        String[] codigos = {
            "AA101", "BC220", "XY900",
            "ABC123", "KL456"
        };

        int revisados = 0;
        int posicion = -1;

        for (int i = 0; i < codigos.length; i++) {
            revisados++;

            if (codigos[i].equals("ABC123")) {
                posicion = i + 1;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Codigo encontrado");
            System.out.println("Posicion: " + posicion);
        } else {
            System.out.println("Codigo no encontrado");
        }

        System.out.println("Codigos revisados: " + revisados);
    }
}