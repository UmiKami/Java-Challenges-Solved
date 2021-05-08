public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        int lastDigitOne = n1 % 10;
        int lastDigitTwo = n2 % 10;
        int lastDigitThree = n3 % 10;

        return (lastDigitOne == lastDigitTwo || lastDigitTwo == lastDigitThree || lastDigitOne == lastDigitThree) && (isValid(n1) && isValid(n2) && isValid(n3));
    }

    public static boolean isValid(int n){
        return n >= 10 && n <= 1000;
    }
}
