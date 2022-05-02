public class Numero { 
    public static void dividir(int a, int b){
        try{
            System.out.println(a+" / "+b+" = "+a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");
            System.out.println(a+" / "+b+" = "+0);
        }
    }
}
