public class Produto {
    /*
    nome do tipo String
    preco do tipo double
    peso do tipo double
    quantidadeEmEstoque do tipo int
    tipo do tipo TiposProduto
    */

    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    public void setTipo(TiposProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
//        <nome> <preco> <peso> <quantidadeEmEstoque> <tipo>.
        return String.format("%s %f %f %d %s", getNome(), getPreco(), getPeso(), getQuantidadeEmEstoque(), getTipo());
    }
}
