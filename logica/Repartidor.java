package logica;

public class Repartidor extends Empleado{
    private int paquetesEntregados;

    public Repartidor(String nombre, int id, double salarioBase, int paquetesEntregados){
        super(nombre, id, salarioBase);
        this.paquetesEntregados = paquetesEntregados;

    }
    @Override
    public double calcularPago(){
        return this.salarioBase +(this.paquetesEntregados * 5);

    }
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+"paquetes entregados: "+this.paquetesEntregados;

    }
    public void cerrarRegistro(){
        
    }

}
