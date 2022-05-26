import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> estoque;

    public Armazem(){
        this.estoque = new HashMap<String, T>();
    }

    public Map<String, T> getEstoque() {
        return estoque;
    }
}

