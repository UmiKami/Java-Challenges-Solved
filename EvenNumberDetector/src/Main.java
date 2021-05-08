public class Main {
    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int acc = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                acc++;

                if (acc == 6){
                    break;
                }else {
                    continue;
                }
            }

            System.out.println("Even number " + number);
            number++;
        }
    }

    public static boolean isEvenNumber(int n){
        return n % 2 == 0;
    }
}
