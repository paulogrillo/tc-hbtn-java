public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public void tomarDano(int quantidadeDeDano) {
        if(saudeAtual > 0) {
            if (saudeAtual - quantidadeDeDano > 0) {
                saudeAtual -= quantidadeDeDano;
            } else {
                saudeAtual = 0;
            }
        }
    }
    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual = this.saudeAtual + quantidadeDeCura;
        if(this.saudeAtual > 100) {
            this.saudeAtual = 100;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
