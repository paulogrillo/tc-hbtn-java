package workflows;

import workflows.atividade.Atividade;

import java.util.ArrayList;

public class Workflow {
    private ArrayList<Atividade> atividades = new ArrayList<>();

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }
}
