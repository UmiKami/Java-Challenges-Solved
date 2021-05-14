import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int acc = 0;
        int sum = 0;
        double avg = 0;

        while(true){
            boolean hasInt = scanner.hasNextInt();

            if (hasInt){
                acc++;
                int num = scanner.nextInt();
                sum += num;
                avg = (double) sum / acc;
                avg = Math.round(avg);
            }else{
                break;
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + (long)avg);

        scanner.close();
    }
}
