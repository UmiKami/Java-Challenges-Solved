public class MinutesAndSecondsToHHMMSS {
    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >=0 && seconds <= 59){
            int hours;
            if (minutes < 60){
                hours = 0;
            }else{
                hours = minutes / 60;
                minutes = minutes % 60;
            }

            if (minutes <= 9 && hours <= 9){
                if (seconds <= 9){
                    return  "0" + hours + "h " + "0" + minutes + "m " + "0" + seconds + "s";
                }else{
                    return  "0" + hours + "h " + "0" + minutes + "m " + seconds + "s";
                }
            }else{
                return hours + "h " + minutes + "m " + seconds + "s";
            }

        }else{
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if (seconds >=0){
            int minutes = seconds / 60;
            seconds = seconds % 60;

            return getDurationString(minutes, seconds);
        }else{
            return "Invalid Value";
        }
    }
}
