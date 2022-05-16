public class InteiroPositivo {
    private int valor;
    private int newValor;

    public InteiroPositivo(int valor) {
        this.valor = valor;
    }

    public InteiroPositivo(String valor){
        newValor =  Integer.valueOf(valor);
        setValor(newValor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws IllegalArgumentException {
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo(){
        int contador = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
}
