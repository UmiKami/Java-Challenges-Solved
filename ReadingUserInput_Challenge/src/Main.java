import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i=1; i <= 10; i++){
            System.out.print("Enter number #" + i + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int num = scanner.nextInt();
                sum += num;
            }else{
                System.out.println("Invalid Number");
                i--;
            }

            scanner.nextLine();
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
