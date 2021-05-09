public class FactorPrinter {
    public static void printFactors(int n){
        if (n < 1){
            System.out.println("Invalid Value");
        }else if (n == 1){
            System.out.println(1);
        }

        for (int i = 1; i <= n; i++){
            if (n % i == 0 && n > 1){
                System.out.println(i);
            }
        }
    }
}
