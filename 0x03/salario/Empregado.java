public class Empregado {
    private double salarioFixo = 0.00;
    private double bonus = 0.00;

    public Empregado(double salarioFixo) {
        super();
        this.salarioFixo = salarioFixo;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public double calcularBonus(Departamento departamento) {
        if(departamento.getValorAtingidoMeta() >= departamento.getValorMeta()){
            bonus = this.salarioFixo * 0.1;
        }else {bonus = 0.00;}
        return bonus;
    }
    public double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
    }
}

