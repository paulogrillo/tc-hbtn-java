import java.util.ArrayList;
import java.util.Formatter;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private int posicao = 0;

    public Celular(ArrayList<Contato> contatos){
        this.contatos = contatos;
    }
    public Celular(){
    }

    public int obterPosicaoContato(String nome) {
        return contatos.indexOf(nome);
    }

    public void adicionarContato(Contato contato) throws Exception {
        for (Contato addContato : contatos) {
            if (addContato.getNome().equals(contato.getNome())) {
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(novoContato.getNome())) {
                if (!contato.getNome().equals(contatoAntigo.getNome())) {
                    throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
                }
            }
            if (!(contatoAntigo.getNome().equals(novoContato.getNome()))) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
            }
        }
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(contatoAntigo.getNome())) {
                contatos.get(i).setNumeroDeTelefone(novoContato.getNumeroDeTelefone());
                contatos.get(i).setTipo(novoContato.getTipo());
            }
        }
    }

    public void removerContato(Contato contato) throws Exception {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(contato.getNome())) {
                contatos.remove(i);
            }else {
                throw new Exception("Nao foi possivel remover contato. Contato nao existe");
            }
        }
    }
    public void listarContatos(){
        for(Contato contato : contatos) {
                    System.out.println(contato.getNome() + " -> " + contato.getNumeroDeTelefone() + " (" + contato.getTipo() + ")");
        }
    }

}
