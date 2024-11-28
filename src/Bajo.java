public class Bajo extends InstrumentosCuerdas{

    private String pedal;

    public Bajo(String color, String duenio, String tamanio, int anio, String material, String pedal) {
        super(color, duenio, tamanio, anio, material);
        this.pedal = pedal;
    }

    public String getPedal() {
        return pedal;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Bajo: \n");
        System.out.println("Nombre del pedal del Instrumento: "+ pedal);
    }
}
