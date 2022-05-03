package tasks.salario;

public class Empregado {
    private double salarioFixo = 0.00;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    double calcularBonus(Departamento departamento) {
        double bonus = 0.00;
        if(departamento.getValorAtingidoMeta() >= departamento.getValorMeta()){
            bonus = this.salarioFixo * 0.1;
        }else {bonus = 0.00;}
        return bonus;
    }
    double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
    }
}
