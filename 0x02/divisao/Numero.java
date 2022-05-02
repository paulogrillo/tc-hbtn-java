public class Numero {
    static int i = 0;
    public static void dividir(int a, int b){
        try{
            int i = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");
        }
        finally {
            System.out.println(a+" / "+b+" = "+i);
        }
    }
}
