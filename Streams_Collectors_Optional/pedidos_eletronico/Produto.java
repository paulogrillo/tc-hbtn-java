public class Produto {
    //codigo, nome, categoria do tipo CategoriaProduto e preco.
    private int codigo;
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(){}
    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    //[<codigo>] <nome> <categoria> R$ <preco>, preço com apenas 2 casas decimais.
    @Override
    public String toString() {
        return String.format("[" + "%d" + "]" + " %s %s R$ %.2f",getCodigo(), getNome(), getCategoria(), getPreco());
    }
}
