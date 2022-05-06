
public class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException{
        if(largura >= 0) {
            this.largura = largura;
        }else {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException{
        if(altura >= 0) {
        this.altura = altura;
        }else {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
    }
    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public String toString() {
        String format = String.format("[Retangulo] %.2f / %.2f", largura, altura);
        return format;
    }
}
