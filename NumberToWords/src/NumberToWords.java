public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }else if(number == 0){
            System.out.println("Zero");
        }

        int num = reverse(number);
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;

            switch (lastDigit){
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
            }
        }
        if (getDigitCount(num) < getDigitCount(number)){
            int difference = getDigitCount(number) - getDigitCount(reverse(number));
//            System.out.println("Difference: " + difference + "\nOriginal #: " + getDigitNumber(number) + "\nReverse #: " + getDigitNumber(num) + "\nReverse: " + reverse(number));
            for (int i=0;  i < difference; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        int num = number;
        while(num != 0){
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num = num / 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }else{
            int acc = 0;

            if (number == 0){
                return 1;
            }

            while (number > 0){
                number /= 10;
                acc++;
            }

            return acc;
        }
    }
}
