public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }else{
            int reverse = 0;
            int num = number;
            int sum = 0;
            while(num != 0){
                int lastDigit = num % 10;
                reverse *= 10;
                reverse += lastDigit;
                num = num / 10;
            }
            sum = (number % 10) + (reverse % 10);
            return sum;
        }
    }
}
