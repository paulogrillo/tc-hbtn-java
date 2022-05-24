import java.util.*;
import java.util.Map.*;

public class ListaTelefonica {
    private final HashMap<String, HashSet<Telefone>> lista = new HashMap<>();

    public void adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = new HashSet<>();
        boolean duplicado = false;
        String chave = "";


        for (Entry<String, HashSet<Telefone>> entry : lista.entrySet()) {
            if (entry.getValue().contains(telefone)) {
                duplicado = true;
                chave = entry.getKey();
            }
        }

        if (!duplicado && lista.containsKey(nome)) {
            telefones.addAll(lista.get(nome));
            telefones.add(telefone);
            lista.put(nome, telefones);
        }

        if (chave.equals(nome) && duplicado) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        } else if (!chave.equals(nome) && duplicado) {
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        }

        telefones.add(telefone);
        lista.put(nome, telefones);
    }

    public HashSet<Telefone> buscar(String nome) {
        return this.lista.get(nome);
    }
}


