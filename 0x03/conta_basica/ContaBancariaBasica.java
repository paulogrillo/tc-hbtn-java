import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaDeJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
	this.saldo = 0.00;
    }

    public void depositar(double valor)  throws OperacaoInvalidaException {
        if(valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor < 0) {
            throw new OperacaoInvalidaException("Valor para saque deve ser maior que 0");
        }else {
            if(this.saldo >= valor) {
                this.saldo -= valor;
            }else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        }
    }

    public double calcularTarifaMensal() {
        if((saldo  * 0.10) >  10.0) {
            return 10;
        }else {
            return saldo * 0.10;
        }
    }
    public double calcularJurosMensal(){
        if (this.getSaldo() <= 0) {
            return 0;
        }else {
            return saldo * (( taxaDeJurosAnual / 100) / 12);
        }

    }
    public void aplicarAtualizacaoMensal() {
        double saldoConta = this.getSaldo() - this.calcularTarifaMensal();
        this.saldo = saldoConta + this.calcularJurosMensal();
    }
    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }
}

