public class Jornal extends Midia{
    private int quantidadeArtigos;

    public int getQuantidadeArtigos() {
        return quantidadeArtigos;
    }

    public void setQuantidadeArtigos(int quantidadeArtigos) {
        this.quantidadeArtigos = quantidadeArtigos;
    }

    public Jornal(String nome, int quantidadeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtigos;
    }

    public Jornal(int quantidadeArtigos) {
        this.quantidadeArtigos = quantidadeArtigos;
    }
}
