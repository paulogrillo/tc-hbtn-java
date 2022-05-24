import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> contatos;
    ArrayList<Telefone> telefone = new ArrayList<Telefone>();
    public ListaTelefonica() {
        contatos = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telTemp = new ArrayList<Telefone>();

        if (!contatos.containsKey(nome)) {
            telTemp.add(telefone);
            contatos.put(nome, telTemp);
        } else {
            telTemp = contatos.get(nome);
            telTemp.add(telefone);
            contatos.put(nome, telTemp);
        }
    }
    public ArrayList<Telefone> buscar(String nome) {
        if (!contatos.containsKey(nome)) {
            return null;
        } else {
            telefone = contatos.get(nome);
            return telefone;
        }
    }
}


