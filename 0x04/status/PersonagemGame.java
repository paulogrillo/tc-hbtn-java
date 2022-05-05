public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    private String status;

    public void tomarDano(int quantidadeDeDano) {
        if(saudeAtual > 0) {
            if (saudeAtual - quantidadeDeDano > 0) {
                saudeAtual -= quantidadeDeDano;
                setSaudeAtual(saudeAtual);
            } else {
                setSaudeAtual(0);
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
        if(this.saudeAtual > 0) {
            this.status = "VIVO";
        } else {
            this.status = "MORTO";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }
}
