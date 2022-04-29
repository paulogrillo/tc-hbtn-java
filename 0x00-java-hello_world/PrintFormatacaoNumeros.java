import java.text.DecimalFormat;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        DecimalFormat f1 = new DecimalFormat("0.00");
        DecimalFormat f2 = new DecimalFormat("0,000.00");
        System.out.printf("Valor: R$ %s\n",f2.format(valor));
        System.out.printf("Taxa: R$ %s%%\n",f1.format(taxa));
    }
}