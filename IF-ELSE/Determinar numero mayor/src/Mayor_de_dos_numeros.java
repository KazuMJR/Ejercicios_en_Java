import java.util.Scanner;

public class Mayor_de_dos_numeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ingreso del primer numero
        System.out.print("Por favor, ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        // Ingreso del segundo numero
        System.out.print("Por favor, ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Se crea un objeto el cual compare ambos numeros
        Comparador comparador = new Comparador(numero1, numero2);

        // Determinar el número mayor
        int mayor = comparador.determinarMayor();

        // Mostrar el resultado
        if (mayor == 0) {
            System.out.println("Los dos números son iguales.");
        } else {
            System.out.println("El número mayor es: " + mayor);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
