import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate){
        return produtos.stream().filter(produto -> predicate.test(produto)).collect(Collectors.toList());
    }
}
