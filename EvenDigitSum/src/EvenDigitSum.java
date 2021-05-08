public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-252));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }else {
            int sum = 0;
            int num = number;
            while (num > 0){
                int lastDigit = num % 10;
                num /= 10;

                if (lastDigit % 2 == 0){
                    sum += lastDigit;
                }
            }
            return sum;
        }
    }
}
