package ec.gob.subsidio;
import java.util.Scanner;
import ec.gob.subsidio.modelo.SolicitanteSubsidio;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //reglas
        SolicitanteSubsidio.mostrarReglasSubsidio();

        //Datos
        System.out.println("Nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("Cedula: ");
        String cedula = sc.nextLine();

        System.out.println("Ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.println("Cantidad de vehiculos: ");
        int vehiculos = sc.nextInt();

        System.out.println("Vive en Ecuador? (true/false): ");
        boolean vive=sc.nextBoolean();

        SolicitanteSubsidio s1 = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculos, vive);

        //Mostrar Datos
        System.out.println("\nDatos del solicitante");
        System.out.println(s1);

        //Mostrar Resultados
        System.out.println("\nResultado");
        s1.generarResultados();

        //Sobrecargo
        System.out.print("\nConsumo");
        System.out.println("Consumo normal: "+ s1.calcularConsumoMensual()+ "galones.");

        System.out.println("Consumo con km extra: "+ s1.calcularConsumoMensual(200)+" galones");
        sc.close();
    }
}