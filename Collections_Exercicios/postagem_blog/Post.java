public class Post implements Comparable {
    private String titulo, corpo;

    private Autor autor;
    private Categorias categorias;
    public Post(Autor autor, String titulo, String corpo, Categorias categorias) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categorias = categorias;
    }
    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categorias;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Post other = (Post) obj;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (categorias != other.categorias)
            return false;
        if (corpo == null) {
            if (other.corpo != null)
                return false;
        } else if (!corpo.equals(other.corpo))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }
    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }
}
