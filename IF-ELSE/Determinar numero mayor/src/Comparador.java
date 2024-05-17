public class Comparador {
    private int numero1;
    private int numero2;

    // Constructor
    public Comparador(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método
    public int determinarMayor() {
        if (numero1 > numero2) {
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;
        } else {
            //si ambos numeros son iguales devuelve 0
            return 0;
        }
    }

    // Getters y setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
