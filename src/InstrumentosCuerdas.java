public class InstrumentosCuerdas extends InstrumentosMusicales{

    private String material;

    public InstrumentosCuerdas(String color, String duenio, String tamanio, int anio, String material) {
        super(color, duenio, tamanio, anio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void cambiarDatos(String material){
        this.material = material;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("\tDatos Instrumento de Cuerdas: \n");
        System.out.println("Material del Instrumento: "+ material);
    }

}
