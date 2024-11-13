import java.util.Scanner;

public class ConversiónDeTemperaturas {
    public static void main(String[] args) throws Exception {

        while (true) {
            var entrada = new Scanner(System.in);
            System.out.println(
                    "que deseas convertir   1) para Celsius a Fahrenheit   2) para Fahrenheit a Celsius y 3) para salir");
            var opcion = entrada.nextDouble();

            if (opcion == 1) {
                double resultado = CelsiusAFahrenheit();
                System.out.println(" temperatura en Celsius" + opcion);
                System.out.println("la temperatura en Fahrenheit es : " + resultado);

            } else if (opcion == 2) {
                double resultado = FahrenheitACelsius();
                System.out.println(" temperatura en Fahrenheit" + opcion);
                System.out.println("la temperatura en Celsius es : " + resultado);
            } else if (opcion == 3) {
                break;
            } else {
                System.err.println("opcion no valida");
            }

        }

    }

    private static double FahrenheitACelsius() {
        var entrada = new Scanner(System.in);

        System.out.println("acabas de elegir la opcion 2 a continuacion convertiremos de Fahrenheit a Celsios");
        System.out.println("por favor ingresar la temperatura en grados Fahrenheit ");
        var Fahrenheit = entrada.nextDouble();

        double resultado = (Fahrenheit - 32) / (9 / 5);

        return resultado;
    }

    private static double CelsiusAFahrenheit() {
        var entrada = new Scanner(System.in);
        System.out.println("acabas de elegir la opcion 1 a continuacion convertiremos de Celsius a Fahrenheit ");
        System.out.println("por favor ingresar la temperatura en grados Celsius ");
        var Celsius = entrada.nextDouble();

        double resultado = (Celsius * (9.0 / 5.0)) + 32;

        return resultado;

    }

}
