public class Autor implements Comparable {
    private String nome, sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (nome != null ? !nome.equals(autor.nome) : autor.nome != null) return false;
        return sobrenome != null ? sobrenome.equals(autor.sobrenome) : autor.sobrenome == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareToIgnoreCase(o.toString());
    }
}
