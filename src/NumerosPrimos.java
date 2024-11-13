import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Por favor ingresa un número entero positivo (o escribe '0' para salir):");
            int numero = entrada.nextInt();

            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            } else if (numero < 0) {
                System.out.println("Por favor ingresa un número entero positivo.");
            } else if (numerosPrimos(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }
    }

    public static boolean numerosPrimos(int numero) {
        if (numero <= 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;

            }

        }

        return true;
    }
}
