public class Numero {
    static int result = 0;
    public static void dividir(int a, int b){
        try{
             result = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");
        }
        finally {
            System.out.println(a+" / "+b+" = "+result);
        }
    }
}
