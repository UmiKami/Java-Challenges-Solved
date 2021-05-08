public class FeetInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double footToInch = feet * 12;
            return 2.54 * (footToInch + inches);
        }else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            int feet = (int)(inches / 12);
            inches = inches % 12;

            return calcFeetAndInchesToCentimeters(feet, inches);
        }else {
            return -1;
        }
    }
}
