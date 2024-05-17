public class Numero {
    private int valor;

    // Constructor
    public Numero(int valor) {
        this.valor = valor;
    }

    // Métodos
    public boolean esPar() {
        return this.valor % 2 == 0;
    }

    public boolean esImpar() {
        return !esPar();
    }

    // Getter
    public int getValor() {
        return valor;
    }

    // Setter
    public void setValor(int valor) {
        this.valor = valor;
    }
}
