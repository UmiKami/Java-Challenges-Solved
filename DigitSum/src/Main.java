public class Main {
    public static void main(String[] args) {
        int result = sumDigits(419);
        System.out.println("The sum of the digits of 125 is: " + result);
    }

    public static int sumDigits(int n){
        int sum = 0;

        if (n >= 10){
            while(n > 0){
                sum += n % 10;
                n = n / 10;
            }

            return sum;
        }else{
            return -1;
        }
    }
}
