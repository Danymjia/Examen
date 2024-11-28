public class InstrumentosViento extends InstrumentosMusicales {

    private double costo;

    public InstrumentosViento(String color, String duenio, String tamanio, int anio, double costo) {
        super(color, duenio, tamanio, anio);
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void cambiarCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Instrumento de Viento: \n");
        System.out.println("Costo del Instrumento: " + costo + "$");
    }
}
