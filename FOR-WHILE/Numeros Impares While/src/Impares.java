class Impares {
    private int numero;

    //Constructor
    public Impares(int numero) {
        this.numero = numero;
    }

    //Metodo
    public void mostrarImpares() {
        int i = 1;
        while (i <= numero) {
            System.out.print(i + " ");
            i += 2;
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