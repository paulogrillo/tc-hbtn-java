public class NumerosPares {
    public static void main(String[] args) {
        int limit = 99;
        for(int x= 0; x<limit; x++){
            if(x % 2 == 0){
                System.out.printf("%d, ", x);
            }
        }
	System.out.printf("98\n");
    }
}
