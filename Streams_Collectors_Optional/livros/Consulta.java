import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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
}
