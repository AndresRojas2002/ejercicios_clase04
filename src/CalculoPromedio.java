import java.util.Scanner;

public class CalculoPromedio {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Por favor ingresa 3 números para determinar el promedio (escribe 'salir' para terminar el programa):");
            String opcion = entrada.nextLine();
            if (opcion.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado.");
                break;
            }
            double promedio = CalculoPromedio(entrada);
            System.out.println("El promedio de los 3 números es " + promedio);
        }

        entrada.close();
    }

    private static double CalculoPromedio(Scanner entrada) {

        System.out.println("por favor ingresa el primer numero");
        var num1 = entrada.nextDouble();

        System.out.println(" por favor ingresa el segundo numero");
        var num2 = entrada.nextDouble();

        System.out.println("por favor ingresa el tercer numero ");
        var num3 = entrada.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        return promedio;

    }

}
