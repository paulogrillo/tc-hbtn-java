public class ArmazemDeComida extends Armazem<Comida> {
    @Override
    public Comida obterDoInventario(String nome) {
        return this.getEstoque().get(nome);
    }
    @Override
    public void adicionarAoInventario(String nome, Comida valor){
        this.getEstoque().put(nome, valor);
    }
}
