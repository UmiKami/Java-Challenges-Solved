public class Main {
    public static void main(String[] args) {
        for (int i=8; i > 1; i-- ){
            System.out.println("10,000 at " + i + ".00% = " + calculateInterest(10000, i));
        }

        System.out.println("\n************************************************\nCHALLENGE 2, PRIME NUMBER INCREMENT\n");
        int acc = 0;

        for (int i=12; i < 20; i++){
            if (isPrime(i)){
                acc++;
                System.out.println("Number " + i + " is prime.");
                if (acc == 3){
                    System.out.println("Exiting For Loop.");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2; i <= n/2; i++){
            if (n % i== 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(int amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
