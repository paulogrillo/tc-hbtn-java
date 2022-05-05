package tasks.contas_especiais;

public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo= 0.00;
    private double valorPenalidade = 0.00;

    public ContaBancariaControlada(String numeracao, double taxaDeJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaDeJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal(){
        if(super.getSaldo() <= saldoMinimo){
            double total = ((super.getSaldo() - this.valorPenalidade) + (super.calcularJurosMensal() - super.calcularTarifaMensal()));
            super.setSaldo(total);
        }
    }

}
