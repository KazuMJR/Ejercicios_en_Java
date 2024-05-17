import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para conocer su factorial: ");
        int valor = scanner.nextInt();

        Calcular_Factorial valorObj = new Calcular_Factorial(valor);

        if (valorObj.esValido()) {
            System.out.println("El factorial del numero " + valor + " es: " + valorObj.calcularFactorial());
        } else {
            System.out.println("Ingrese valores mayores a 0");
        }

        // Cerrar el scanner
        scanner.close();
    }
}