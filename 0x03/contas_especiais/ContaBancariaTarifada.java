import exceptions.*;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaDeJurosAnual) {
        super(numeracao, taxaDeJurosAnual);
        this.quantidadeTransacoes = quantidadeTransacoes;
    }


   @Override
   public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor < 0) {
            throw new OperacaoInvalidaException("Valor para saque deve ser maior que 0");
        }else {
            if(super.getSaldo() >= valor) {
                double valorSaque = super.getSaldo() - valor - 0.10;
                setSaldo(valorSaque);
            }else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        }
    }

   	
   @Override 
   public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor - 0.10);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
