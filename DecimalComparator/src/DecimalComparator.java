public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        if (n1 < 0){
            n1 = Math.ceil(n1 * 1000);
            n2 = Math.ceil(n2 * 1000);
        }else{
            n1 = Math.floor(n1 * 1000);
            n2 = Math.floor(n2 * 1000);
        }

        if (n1 == n2) {
            return true;
        } else {
            return false;
        }
    }
}
