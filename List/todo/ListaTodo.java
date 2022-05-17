import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public ListaTodo() {}

    public ListaTodo(List<Tarefa> tarefas) {
        super();
        this.tarefas = tarefas;
    }


    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
            if(tarefa.getDescricao().isEmpty() || tarefa.getDescricao().equals("")){
                throw new IllegalArgumentException("Descricao de tarefa invalida");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == identificador) {
                t.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == identificador) {
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for (Tarefa t : tarefas) {
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for (Tarefa t : tarefas) {
            t.setEstahFeita(true);
        }
    }
    public void listarTarefas(){
        for (Tarefa t : tarefas) {
            if (t.getEstahFeita()) {
                System.out.println("[X]  Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
            }
        }
    }
}
