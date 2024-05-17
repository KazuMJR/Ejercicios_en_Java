import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Este objeto lee lo que ingresa el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();

        // Se crea un objeto persona
        Persona persona = new Persona(edad);

        // Determinar si la persona es mayor de edad
        if (persona.esMayorDeEdad()) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
