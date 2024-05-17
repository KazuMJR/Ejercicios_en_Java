class DiaSemana {
    //Constructor
    public String obtenerDiaSemana(int numero) {
        String dia;

        //Metodo
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            default:
                dia = "Número no válido";
                break;
        }

        return dia;
    }

}