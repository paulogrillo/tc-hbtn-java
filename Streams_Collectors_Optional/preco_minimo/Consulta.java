import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    //método estático obterLivrosDoPedido
    // que recebe um Pedido como argumento e retorna a
    // lista de produtos (List<Produto>) daquele pedido que sejam da categoria Livro

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtosPedido = new ArrayList<Produto>(pedido.getProdutos());
        List<Produto> filterByBook = produtosPedido.stream()
                .filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
        return filterByBook;
    }
    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double priceMin) {
        List<Produto> filterByPriceMin = produtos.stream()
                .filter(p -> p.getPreco() >= priceMin)
                .collect(Collectors.toList());
        return filterByPriceMin;
    }
}
