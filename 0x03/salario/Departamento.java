public class Departamento {
    private double valorMeta = 0.00;
    private double valorAtingidoMeta = 0.00;

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }
    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public boolean alcancouMeta() {
        return valorAtingidoMeta >= valorMeta;
    }
}
