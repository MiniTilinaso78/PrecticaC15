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


}
