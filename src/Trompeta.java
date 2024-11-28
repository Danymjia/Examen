public class Trompeta extends InstrumentosViento{

    private String tono;

    public Trompeta(String color, String duenio, String tamanio, int anio, double costo, String tono) {
        super(color, duenio, tamanio, anio, costo);
        this.tono = tono;
    }

    public String getTono() {
        return tono;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Trompeta: \n");
        System.out.println("Tono del Instrumento: "+ tono);
    }

}
