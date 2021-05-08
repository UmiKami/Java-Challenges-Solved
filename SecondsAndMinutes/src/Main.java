public class Main {
    public static void main(String[] args) {
        String timeGivenMinEtSec = MinutesAndSecondsToHHMMSS.getDurationString(61, 0);
        String timeGivenSeconds = MinutesAndSecondsToHHMMSS.getDurationString(3786);

        System.out.println(timeGivenMinEtSec);
        System.out.println(timeGivenSeconds);
    }
}
