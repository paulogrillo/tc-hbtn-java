import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Double> transacoes = new ArrayList<Double>();

    public Cliente(String nome, double transacoes) {
        this.nome = nome;
        this.transacoes.add(transacoes);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
    public void adicionarTransacao(double valorDaTransacao){
        this.transacoes.add(valorDaTransacao);


    }
}
