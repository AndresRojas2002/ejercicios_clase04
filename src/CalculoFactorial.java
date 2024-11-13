import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        while (true) {
            System.out.println("por favor ingresa un numero positivo   ( cero para salir )");
            var numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("por ingresa un numero positivo");
            } else if (numero > 0) {
                var numeroFactorial = CalculoFactorial(numero);
                System.out.println("el factorial del numero ingresado " + numero + " es " + numeroFactorial);
            } else {
                System.out.println("programa terminado");
                break;

            }

        }
        entrada.close();
    }

    public static int CalculoFactorial(int numero) {

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;

        }

        return factorial;

    }
    /*
     * public static int calcularFactorial(int numero) { 
     * int factorial = 1; 
     * for (int i = 1; i <= numero; i++) { factorial *= i; } return factorial;
     */

}
