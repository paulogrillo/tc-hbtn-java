public class ArmazemDeEletronico extends Armazem<Eletronico> {
    @Override
    public Eletronico obterDoInventario(String nome) {
        return this.getEstoque().get(nome);
    }
    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
        this.getEstoque().put(nome, valor);
    }
}
