public class Persona {
    private int edad;

    // Constructor
    public Persona(int edad) {
        this.edad = edad;
    }

    // Método para determinar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
