import java.util.Scanner;

public class SecuenciaSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Seleccione el programa que desee ejecutar\n");
        System.out.print("--------------------Condicionales (IF-ELSE)--------------------\n");
        System.out.println("1. Programa para determinar si una persona es mayor de edad.\n" +
                "2. Programa que determina el mayor de dos numeros.\n" +
                "3. Programa que determina si un numero entero es par o impar.\n");
        System.out.print("--------------------Iterativas (FOR - WHILE)--------------------\n");
        System.out.println("4. Programa que calcula el factorial utilizando un bucle while.\n" +
                "5. Programa que que pida un número mayor a 10 y menor que 30,  y que muestre por pantalla todos los números impares desde 1 hasta ese número utilizando un bucle for.\n" +
                "6. Programa que realiza lo mismo que el anterior, pero usando el bucle while.\n");
        System.out.print("--------------------Selección (SWITCH)--------------------\n");
        System.out.println("7. Programa que pide un número del 1 al 5 y muestre por pantalla el nombre del día de la semana correspondiente.\n");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                Principal(teclado);
                break;
            case 2:
                Mayor_de_dos_numeros(teclado);
                break;
            case 3:
                Par_Impar(teclado);
                break;
            case 4:
                Factorial(teclado);
                break;
            case 5:
                NumerosImpares(teclado);
                break;
            case 6:
                Numeros(teclado);
                break;
            case 7:
                Dia(teclado);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        teclado.close();
    }

    public static void Principal(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        scanner.close();
    }

    public static void Mayor_de_dos_numeros(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Por favor, ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Los dos números son iguales.");
        }

        scanner.close();
    }

    public static void Par_Impar(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        scanner.close();
    }

    public static void Factorial(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para conocer su factorial: ");
        int valor = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= valor; i++) {
            factorial *= i;
        }

        System.out.println("El factorial del numero " + valor + " es: " + factorial);

        scanner.close();
    }

    public static void NumerosImpares(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
            if (numero <= 10 || numero >= 30) {
                System.out.println("Número fuera del rango. Por favor, intente de nuevo.");
            }
        } while (numero <= 10 || numero >= 30);

        System.out.println("Los números impares desde 1 hasta " + numero + " son:");
        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    public static void Numeros(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
            if (numero <= 10 || numero >= 30) {
                System.out.println("Número fuera del rango. Por favor, intente de nuevo.");
            }
        } while (numero <= 10 || numero >= 30);

        System.out.println("Los números desde 1 hasta " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    public static void Dia(Scanner teclado) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();

        String nombreDia;
        switch (numero) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            default:
                nombreDia = "Número no válido";
                break;
        }

        System.out.println("El día de la semana correspondiente al número " + numero + " es: " + nombreDia);

        scanner.close();
    }
}
