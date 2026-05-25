package logica;

public class Chofer extends Empleado{
    private double kilometrosRecorridos;

    public Chofer(String nombre, int id, double salarioBase, double kilometrosRecorridos) {
        super(nombre, id, salarioBase);
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    @Override
    public double calcularPago(){
        return this.salarioBase + (kilometrosRecorridos * 2);

    }
    @Override
    public String mostrarDatos(){
        return mostrarDatos()+"kilometrosRecorridos: "+this.kilometrosRecorridos;

    }
    

    

}
