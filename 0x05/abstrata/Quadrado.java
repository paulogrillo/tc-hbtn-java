
public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalArgumentException {
        if (lado > 0) {
            this.lado = lado;
        }else {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
    }

    @Override
    public double area() {
        return lado * lado;
    }
    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f",lado);
    }
}
