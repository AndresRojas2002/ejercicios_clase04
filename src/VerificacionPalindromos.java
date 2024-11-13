import java.util.Scanner;

public class VerificacionPalindromos {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        while (true) {

            System.out.println("por favor ingresar una palabra o un texto, para verificar si es Palindromo");
            var texto = entrada.nextLine();

            if (esPalindromo(texto)) {
                System.out.println("el texto es Palindromo");

            } else {
                System.out.println("el texto no es Palindromo");
            }

            if (texto.equalsIgnoreCase("salir")) {
                break;

            }

        }

        entrada.close();

    }

    public static boolean esPalindromo(String texto) {

        String textoLimpiado = texto.replaceAll("[\\W_]", "").toLowerCase();

        String textoReverso = new StringBuilder(textoLimpiado).reverse().toString();

        return textoLimpiado.equals(textoReverso);
    }

}
