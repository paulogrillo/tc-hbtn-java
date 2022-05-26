import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T>{

    private Map<String, T> estoque;

    public Armazem(){
        this.estoque = new HashMap<String, T>();
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.estoque.get(nome);
    }
    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.estoque.put(nome, valor);
    }
}

