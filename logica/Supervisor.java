package logica;

public class Supervisor extends Empleado{
    private double bonoFijo;

    public Supervisor(String nombre, int id, double salarioBase, double bonoFijo) {
        super(nombre, id, salarioBase);
        this.bonoFijo = bonoFijo;
    }
    @Override
    public double calcularPago(){
        return this.salarioBase + this.bonoFijo;
        
    }
    @Override
    public String mostrarDatos(){
        return mostrarDatos()+"Bono fijo: "+this.bonoFijo;
        
    }

}
