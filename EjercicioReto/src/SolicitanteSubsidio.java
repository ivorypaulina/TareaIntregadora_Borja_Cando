package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    //atributos
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    //constructores
    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador){
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador=viveEnEcuador;
    }

    //get y set
    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula=cedula;
    }

    public double getIngresosMensuales(){
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales){
        if(ingresosMensuales>=470){
            this.ingresosMensuales=ingresosMensuales;
        }else{
            System.out.println("Cantidad inválida. Ingrese una cantidad mayor a 470.");
            this.ingresosMensuales=ingresosMensuales;
        }
    }

    public int getCantidadVehiculos(){
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos){
        if(cantidadVehiculos>=0){
            this.cantidadVehiculos=cantidadVehiculos;
        }else{
            System.out.println("Cantidad inválida.");
            this.cantidadVehiculos=0;
        }
    }

    public boolean isViveEnEcuador(){
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador){
        this.viveEnEcuador=viveEnEcuador;
    }

    //metodos
    public boolean subsidioAprobado(){
        return  ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador;
    }

    public void generarResultados(){
        if(subsidioAprobado()){
            System.out.println("Subsidio aprobado.");
        }else{
            System.out.println("Subsidio rechazado. Motivos: ");
            if(ingresosMensuales>1200){
                System.out.println("-Ingresos superiores a $1200");
            }
            if(cantidadVehiculos>1){
                System.out.println("-Posee mas de un vehículo");
            }
            if(!viveEnEcuador){
                System.out.println("-No reside en Ecuador");
            }

        }
    }

    @Override
    public String toString(){
        return "Nombre: " + nombreCompleto + "\nCédula: " + cedula + "\nIngresos: $" + ingresosMensuales + "\nVehículos: " + cantidadVehiculos + "\nReside en Ecuador: " + viveEnEcuador;
    }

    public static void mostrarReglasSubsidio(){
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1200");
        System.out.println("2. No poseer mas de un vehiculo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
    }

    public double calcularConsumoMensual(){
        double kmBase = 1000;
        return kmBase / 40;
    }

    public double calcularConsumoMensual(double kmExtra){
        double kmBase = 1000 + kmExtra;
        return kmBase / 40;
    }

}
