class Calcular_Factorial {
    private int valor;

    //Constructor
    public Calcular_Factorial(int valor) {
        this.valor = valor;
    }

    //Metodo
    public long calcularFactorial() {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor debe ser mayor o igual a 0.");
        }

        long resultado = 1;
        for (int i = 1; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public boolean esValido() {
        return valor > 0;
    }

    // Getter y setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}