package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {

    //atributos
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    //constructor
    public SolicitanteSubsidio(String nombreCompleto,String cedula,double ingresosMensuales,int cantidadVehiculos,boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }

    //get y set
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("ingreso inválido, se asigna valor mínimo ($470).");
            this.ingresosMensuales = 470;
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("cantidad inválida, se asigna 0.");
            this.cantidadVehiculos = 0;
        }
    }
    // "is" se aplica en booleanos
    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    //valida si cumple requisitos
    public boolean subsidioAprobado() {
        return (ingresosMensuales <= 1200 &&
                cantidadVehiculos <= 1 &&
                viveEnEcuador);
    }

    //resultado
    public void generarResultado() {
        System.out.println("\n=== Resultado de la evaluación ===");
        if (subsidioAprobado()) {
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos por el Gobierno del Ecuador.");
        } else {
            System.out.println("Subsidio rechazado por las siguientes razones:");

            if (ingresosMensuales > 1200)
                System.out.println("- Ingresos superiores a $1200.");

            if (cantidadVehiculos > 1)
                System.out.println("- Posee más de un vehículo.");

            if (!viveEnEcuador)
                System.out.println("- No reside en Ecuador.");
        }
    }

    //toString
    @Override
    public String toString() {
        return "\n===== Datos del solicitante =====\n" +
                "Nombre: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nIngresos mensuales: $" + ingresosMensuales +
                "\nCantidad de vehículos: " + cantidadVehiculos +
                "\nVive en Ecuador: " + viveEnEcuador;
    }

    //estático
    public static void mostrarReglasSubsidio() {
        System.out.println("===== Reglas para obtener el subsidio =====");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer más de un vehículo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
        System.out.println("===========================================");
    }

    //sin parámetros
    public double calcularConsumoMensual() {
        double kmBase = 400; // asumimos 400 km base
        return kmBase / 40;
    }

    // sobrecargado
    public double calcularConsumoMensual(double kmExtra) {
        double kmBase = 400 + kmExtra;
        return kmBase / 40;
    }
}