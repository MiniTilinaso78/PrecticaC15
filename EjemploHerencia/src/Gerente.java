public class Gerente extends Empleado {
    private double bono;
    public Gerente(String id, double salarioBase, double bono){
        super(id, salarioBase);
        this.bono=bono;
    }
    @Override
    public double calcularPago(double impuesto){
        return super.calcularPago(impuesto)+bono;

    }

    public double getBono() {
        return bono;
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase();
    }

    @Override
    public String getId() {
        return super.getId();
    }
}
