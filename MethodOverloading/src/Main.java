public class Main {
    public static void main(String[] args) {
        double centimeters = FeetInchesToCentimeters.calcFeetAndInchesToCentimeters(0,3);
        System.out.println(centimeters);
        centimeters = FeetInchesToCentimeters.calcFeetAndInchesToCentimeters(3);
        System.out.println(centimeters);
    }
}
