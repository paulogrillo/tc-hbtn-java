public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(){}
    public Tarefa(String descricao, int identificador){
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao)throws IllegalArgumentException{
        if(descricao == null || descricao.equals("")){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }else {
            setDescricao(descricao);
        }
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }
    public boolean getEstahFeita() {
        return estahFeita;
    }
}
