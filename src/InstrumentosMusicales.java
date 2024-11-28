import java.util.Scanner;

public class InstrumentosMusicales {

    private String color;
    private String duenio;
    private String tamanio;
    private int anio;

    public InstrumentosMusicales(String color, String duenio, String tamanio, int anio) {
        this.color = color;
        this.duenio = duenio;
        this.tamanio = tamanio;
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void cambiarDatos(String color, String duenio, String tamanio, int anio) {
        this.color = color;
        this.duenio = duenio;
        this.tamanio = tamanio;
        this.anio = anio;
    }

    public void cambiarDatos2(){
        Scanner sc = new Scanner(System.in);
        this.color = sc.nextLine();
        this.duenio = sc.nextLine();
        this.tamanio = sc.nextLine();
        this.anio = sc.nextInt();
    }

    public void Imprimir(){
        System.out.println("\tDatos Instrumentos: \n");
        System.out.println("Color del Intrumento: " + color);
        System.out.println("Dueño del Intrumento: " + duenio);
        System.out.println("Tamaño del Intrumento: " + tamanio + " cm");
        System.out.println("Años del Intrumento: " + anio);
    }
}
