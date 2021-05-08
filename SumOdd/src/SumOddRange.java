public class SumOddRange {
    public static boolean isOdd(int number){
        return number % 2 != 0 && number > 0;
    }

    public static int sumOdd(int i, int end){

        if (i < 0 || end < 0 || end < i){
            return -1;
        }else if(i == end && isOdd(i)){
            return i;
        }else if(i == end && !isOdd(i)){
            return 0;
        }

        int sum = 0;

        for (int x=i; i <= end; x++){
            if (isOdd(x)){
                sum += x;
            }
            i++;
        }
        return sum;
    }
}
