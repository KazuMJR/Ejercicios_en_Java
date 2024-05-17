import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese un número entero
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Crear un objeto Numero con el valor proporcionado
        Numero numeroObj = new Numero(numero);

        // Determinar si el número es par o impar
        if (numeroObj.esPar()) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
