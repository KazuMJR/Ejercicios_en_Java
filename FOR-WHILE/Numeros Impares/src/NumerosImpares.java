import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);

        CalcularImpares numerosImpares = new CalcularImpares(numero);
        numerosImpares.mostrarImpares();

        System.out.println("Los números impares desde 1 hasta " + numero + " son:");
    }
}


