public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    public double calcularBonus(Departamento departamento) {
        double diference = 0.00;
        double bonus = 0.00;
        if(departamento.getValorAtingidoMeta() >= departamento.getValorMeta()){
            diference = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            bonus = (super.getSalarioFixo() * 0.2) + (diference * 0.01);
        }else {
            bonus = 0.00;
        }
        return bonus;
    }

}
