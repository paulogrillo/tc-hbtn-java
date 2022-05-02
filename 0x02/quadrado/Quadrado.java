public class Quadrado {
    public static double area(double lado) {
        double area = 0;
        if(lado <= 0){
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        area = lado * lado;
        return  area;
    }
}
