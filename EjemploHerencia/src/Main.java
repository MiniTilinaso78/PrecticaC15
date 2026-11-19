//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente laPepo= new Gerente("NM-01",1500.0,500.0);
        double pago = laPepo.calcularPago(16);
        String reporte = "Probando los atributos id = %s , salario = %f, bono = %f y metodo heredado y tuneado calcular pago = %f";
        System.out.println(reporte.formatted(laPepo.getId(),laPepo.getSalarioBase(),laPepo.getBono(),pago));


    }
}