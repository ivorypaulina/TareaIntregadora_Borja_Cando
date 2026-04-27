package ec.gob.subsidio;

import ec.gob.subsidio.modelo.SolicitanteSubsidio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //mostrar reglas
        SolicitanteSubsidio.mostrarReglasSubsidio();

        //pedir datos
        System.out.print("ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("ingrese su cédula: ");
        String cedula = sc.nextLine();

        System.out.print("ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("ingrese la cantidad de vehículos registrados: ");
        int vehiculos = sc.nextInt();

        System.out.print("vive en Ecuador? (true/false): ");
        boolean vive = sc.nextBoolean();

        //crear objeto
        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(
                nombre, cedula, ingresos, vehiculos, vive
        );

        //mostrar datos
        System.out.println(solicitante);

        // resultado
        solicitante.generarResultado();

        // cnsumo
        System.out.println("\n===== Cálculo de consumo mensual =====");

        double consumoBase = solicitante.calcularConsumoMensual();
        System.out.println("Consumo mensual estimado (sin km extra): " + consumoBase + " galones");

        double consumoExtra = solicitante.calcularConsumoMensual(80);
        System.out.println("Consumo con kilómetros extra (80 km adicionales): " + consumoExtra + " galones");
    }
}