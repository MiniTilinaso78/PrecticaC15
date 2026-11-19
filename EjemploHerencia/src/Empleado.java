public class Empleado {
    protected String id;
    protected double salarioBase;
    public Empleado(String id, double salarioBase) {
        this.id = id;
        this.salarioBase = salarioBase;
    }
    protected double calcularPago(double impuesto){
        return this.salarioBase*(100-impuesto);
    }
}
