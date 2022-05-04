import exceptions.*;
public class LivroEdicaoOuro extends Livro {
    private double total = 0.00;
    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super(titulo, autor, preco);
    }
    public double getTotal() {
        this.total = super.getPreco();
        return total + (total * 0.3);
    }
    @Override
    public double getPreco() {
        return this.getTotal();
    }
}
