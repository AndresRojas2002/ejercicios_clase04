import java.util.Scanner;

public class ConversionUnidades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("por favor ingresa el tipo de conversion que deseas realizar  ");
            System.out.println("1. de metros a kilometros");
            System.out.println("2. de kilometros a metros");
            System.out.println("3. de gramos a kilogramos");
            System.out.println("4. de kilogramos a gramos");
            System.out.println("5. para salir ");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    double kilometro = metrosKilometros(entrada);
                    System.out.println(" la conversion de  metros a kilometros es : " + kilometro +" km");
                    break;
                case 2:
                    double metro = kilometrosMetros(entrada);
                    System.out.println(" la conversion de kilometros a metros es : " + metro+ " m");
                    break;
                case 3:
                    double kilogramo = gramosKilogramos(entrada);
                    System.out.println(" la conversion de gramos a kilogramos es : " + kilogramo + " kg");
                    break;
                case 4:
                    double gramo = kilogramosGramos(entrada);
                    System.out.println(" la conversion de  kilogramos a gramos es : " + gramo+ " g");
                    break;
                case 5:
                    System.out.println(" el programa a terminado");
                    entrada.close();
                    return;

                default:
                    System.out.println("opcion no validad");
                    break;
            }

        }
    }

    private static double gramosKilogramos(Scanner entrada) {
        System.out.println("Conversión de gramos a kilogramos");
        System.out.println("Por favor ingresa el valor en gramos:");
        double gramo = entrada.nextDouble();
        return gramo / 1000;
    }

    private static double metrosKilometros(Scanner entrada) {
        System.out.println("conversion de metros a kilometros ");
        System.out.println(" por favor ingresa el valor en metros ");
        double metro = entrada.nextDouble();
        double resultado = metro / 1000;
        return resultado;
    }

    private static double kilometrosMetros(Scanner entrada) {
        System.out.println("conversion de kilometros a metros ");
        System.out.println("por favor ingresa el valor en kilometros ");
        double kilometro = entrada.nextDouble();
        double resultado = kilometro * 1000;
        return resultado;
    }

    private static double kilogramosGramos(Scanner entrada) {
        System.out.println("Conversión de kilogramos a gramos");
        System.out.println("Por favor ingresa el valor en kilogramos:");
        double kilogramo = entrada.nextDouble();
        return kilogramo * 1000;
    }

}