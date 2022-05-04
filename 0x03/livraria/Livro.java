import tasks.livraria.exceptions.*;
public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) throws  LivroInvalidoException {
        if(titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if(!autor.contains(" ")) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) throws LivroInvalidoException{
        if(preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }
}
