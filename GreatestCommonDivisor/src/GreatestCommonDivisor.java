public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }else{
            int greatestNum;
            int greatestCommonDivisor = 0;

            if (first > second){
                greatestNum = first;
            }else{
                greatestNum = second;
            }

            for (int i=greatestNum; i > 0; i--){
                if (first % i == 0 && second % i == 0){
                    greatestCommonDivisor = i;
                    break;
                }
            }
            return greatestCommonDivisor;
        }
    }
}
