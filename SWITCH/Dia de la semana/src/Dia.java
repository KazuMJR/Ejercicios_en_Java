import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número del 1 al 5
        System.out.print("Ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();

        // Crear un objeto de la clase DiaSemana
        DiaSemana diaSemana = new DiaSemana();


        String nombreDia = diaSemana.obtenerDiaSemana(numero);

        if (numero >= 1 && numero <= 5) {

            System.out.println("El día de la semana correspondiente al número " + numero + " es: " + nombreDia);
        } else {
            System.out.println("Ingresa un número del 1 al 5.");
        }}
}