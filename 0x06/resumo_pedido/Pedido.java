public class Pedido {

    private double percentualDesconto;

    private ItemPedido[] itens;
    private double subTotal = 0.00;
    private double total = 0.00;
    private String tipo;
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

    public void apresentarResumoPedido() {
        double descontoTotal = 0.00;
        double totalProduto = 0.00;
        double totalPedido = 0.00;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            if(item.getProduto().getClass().getName().equals("produtos.Livro")){
                System.out.printf(
                        "Tipo: Livro  Titulo: %s  Preco: %.2f Quant: %d Total: %.2f\n",
                        item.getProduto().getTitulo(),
                        item.getProduto().obterPrecoLiquido(),
                        item.getQuantidade(),
                        item.getQuantidade()*item.getProduto().obterPrecoLiquido()

                );
            }else if(item.getProduto().getClass().getName().equals("produtos.Dvd")){
                System.out.printf(
                        "Tipo: Dvd  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                        item.getProduto().getTitulo(),
                        item.getProduto().obterPrecoLiquido(),
                        item.getQuantidade(),
                        item.getQuantidade()*item.getProduto().obterPrecoLiquido()
                );
            }else {
                System.out.println("Tipo ainda não foi implementado");
            }
            total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
            totalProduto = totalProduto + item.getProduto().obterPrecoLiquido()*item.getQuantidade();
            descontoTotal = total* (this.percentualDesconto/100);
            totalPedido = totalProduto - (totalProduto * this.percentualDesconto/100);
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", descontoTotal);
        System.out.printf("TOTAL PRODUTOS: %.2f\n",totalProduto);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n",totalPedido);
        System.out.println("----------------------------");
    }
}
