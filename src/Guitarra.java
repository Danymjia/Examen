public class Guitarra extends InstrumentosCuerdas{

    private int numCuerdas;

    public Guitarra(String color, String duenio, String tamanio, int anio, String material, int numCuerdas) {
        super(color, duenio, tamanio, anio, material);
        this.numCuerdas = numCuerdas;
    }

    public int getNumCuerdas() {
        return numCuerdas;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Guitarra: \n");
        System.out.println("Numero de cuerdas del Instrumento: "+ numCuerdas);
    }

}
