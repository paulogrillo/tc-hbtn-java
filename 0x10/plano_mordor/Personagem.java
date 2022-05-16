import comida.*;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;
    private String tipoHumor;
    private int value;
    private Humor humor;
    public Personagem(){}

    public Personagem(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public String obterHumorAtual(int value) {
        if (value < -5) {
            humor = new Irritado();
            tipoHumor = humor.getClass().getSimpleName();
        }
        if (value >= -5 && value <= 0) {
            humor = new Triste();
            tipoHumor = humor.getClass().getSimpleName();
        }
        if(value >= 1 && value <= 15){
            humor = new Feliz();
            tipoHumor = humor.getClass().getSimpleName();
        }
        if (value > 15) {
            humor = new MuitoFeliz();
            tipoHumor = humor.getClass().getSimpleName();
        }
        return tipoHumor;
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return this.pontosDeFelicidade + " - " + this.obterHumorAtual(pontosDeFelicidade);
    }
}
