class CalcularImpares {
    private int numero;

    //Contructor
    public CalcularImpares(int numero) {
        this.numero = numero;
    }

    //metodo
    public void mostrarImpares() {
        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
    }

    //Getter and Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}