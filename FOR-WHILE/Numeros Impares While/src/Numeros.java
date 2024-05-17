import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
            if (numero <= 10 || numero >= 30) {
                System.out.println("Número fuera del rango. Por favor, intente de nuevo.");
            }
        } while (numero <= 10 || numero >= 30);


        Impares numerosImpares = new Impares(numero);
        numerosImpares.mostrarImpares();

    }
}

