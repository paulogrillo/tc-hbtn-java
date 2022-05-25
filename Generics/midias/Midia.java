public class Midia {

    public Midia(String nome) {
        this.nome = nome;
    }
    public Midia(){}
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
    }
}
