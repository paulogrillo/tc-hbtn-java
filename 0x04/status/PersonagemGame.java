public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    private String status;

    public void tomarDano(int quantidadeDeDano) {
        if(this.saudeAtual > 0) {
            if (this.saudeAtual - quantidadeDeDano > 0) {
                this.saudeAtual -= quantidadeDeDano;
                setSaudeAtual(this.saudeAtual);
            } else {
                setSaudeAtual(0);
            }
        }
        setSaudeAtual(saudeAtual);
    }
    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual = this.saudeAtual + quantidadeDeCura;
        if(this.saudeAtual > 100) {
            this.saudeAtual = 100;
        }
        setSaudeAtual(this.saudeAtual);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(this.saudeAtual > 0){
            this.status = "vivo";
        }else{
            this.status = "morto";
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
