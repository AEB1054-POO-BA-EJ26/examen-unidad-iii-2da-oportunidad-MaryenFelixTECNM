package logica;

public class Empleado {
    private String nombre;
    private int id;
    public double salarioBase;
    private boolean registroCerrado;

    public Empleado(String Empleado, int id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean isRegistroCerrado() {
        return registroCerrado;
    }

    public void setRegistroCerrado(boolean registroCerrado) {
        this.registroCerrado = registroCerrado;
    }

    public void aumentarSalario(double monto){
        this.salarioBase += monto;

    }
    public double calcularPago(){
        return calcularPago();

    }
    public boolean estaRegistroCerrado(){
        return this.registroCerrado;

    }
    public String mostrarDatos(){
        return "nombre: " +this.nombre+"id: "+this.id+"Salario Base: "+this.salarioBase;

    }




}
