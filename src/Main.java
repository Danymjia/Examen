import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String color;
        String duenio;
        String tamanio;
        int anio;

        InstrumentosMusicales instrumentosMusicales = new InstrumentosMusicales("","","",0);
        instrumentosMusicales.cambiarDatos("Cafe","Juan Perez","70.5",3);
        instrumentosMusicales.Imprimir();

        Guitarra datosGuitarra = new Guitarra("Negro","Jose Diaz","56.43",3,"Madera",5);
        datosGuitarra.Imprimir();

        Bajo datosBajo = new Bajo("Verde","Marta Mejia","67.4",6,"Plastico","Sin pedal");
        datosBajo.Imprimir();

        Trompeta datosTrompeta = new Trompeta("Dorado","Liusa Marquez","45.6",3,56.99,"Sol-Mayor");
        datosTrompeta.Imprimir();

        Flauta datosFlauta= new Flauta("Celeste","Albert Fabrega","10.5",2,90.5,"Redondeada");
        datosFlauta.Imprimir();

        try {
            instrumentosMusicales.Imprimir();
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            datosGuitarra.Imprimir();
            datosBajo.Imprimir();
            datosTrompeta.Imprimir();
            datosFlauta.Imprimir();
        }

    }
}