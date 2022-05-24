import java.util.*;
import java.util.Map.*;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefones;
    public ListaTelefonica() {
        listaTelefones = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> tel = new HashSet<Telefone>();
        boolean achou = false;
        String chave = "";


        for (Entry<String, HashSet<Telefone>> entry : listaTelefones.entrySet()) {
            if (entry.getValue().contains(telefone)) {
                achou=true;
                chave = entry.getKey();
            }
        }

        if(achou == false && listaTelefones.containsKey(nome)) {
            tel.addAll(listaTelefones.get(nome));
            tel.add(telefone);
            listaTelefones.put(nome, tel);

        }

        if(chave.equals(nome) && achou) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }else if(!chave.equals(nome) && achou){
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        }

        tel.add(telefone);
        listaTelefones.put(nome, tel);

        return tel;

    }

    public HashSet<Telefone> buscar(String nome) {

        HashSet<Telefone> telTemp = new HashSet<Telefone>();

        if (!listaTelefones.containsKey(nome)) {
            return null;
        } else {
            telTemp = listaTelefones.get(nome);
            return telTemp;
        }
    }
}


