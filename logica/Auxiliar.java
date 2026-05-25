package logica;

public class Auxiliar extends Empleado{
    private int horasExtra;

    public Auxiliar(String nombre, int id, double salarioBase, int horasExtra) {
        super(nombre, id, salarioBase);
        this.horasExtra = horasExtra;
    }
    @Override
    public double calcularPago(){
        return this.salarioBase +(horasExtra * 40);
    }
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+"Horas extra: "+this.horasExtra;
        
    }

}
