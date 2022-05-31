import java.util.*;

public class Consulta {
    //método estático obterLivrosDoPedido
    // que recebe um Pedido como argumento e retorna a
    // lista de produtos (List<Produto>) daquele pedido que sejam da categoria Livro

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtosPedido = new ArrayList<Produto>(pedido.getProdutos());
        List<Produto> filtro = produtosPedido.stream()
                .filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
        return filtro;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }
}
