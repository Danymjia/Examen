public class Flauta extends InstrumentosViento{

    private String punta;

    public Flauta(String color, String duenio, String tamanio, int anio, double costo, String punta) {
        super(color, duenio, tamanio, anio, costo);
        this.punta = punta;
    }

    public String getPunta() {
        return punta;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Flauta: \n");
        System.out.println("Punta del Instrumento: " + punta);
    }
}
