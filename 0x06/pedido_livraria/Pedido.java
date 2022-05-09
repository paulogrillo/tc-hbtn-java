public class Pedido {

    private double percentualDesconto;

    private ItemPedido[] itens;
    private double subTotal = 0.00;
    private double total = 0.00;


    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        for (ItemPedido item : itens) {
            subTotal += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        total = subTotal - (subTotal * percentualDesconto / 100);
        return total;
    }
}
