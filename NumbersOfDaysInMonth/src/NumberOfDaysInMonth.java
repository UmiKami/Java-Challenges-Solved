public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 && (year >= 1) && (year <= 9999)) || (year % 100 == 0 && year % 400 == 0 && (year >= 1) && (year <= 9999));
    }

    public static int getDaysInMonth(int month, int year){
        int days;

        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }else if (isLeapYear(year) && month == 2){
            days = 29;
            return days;
        }else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2: days = 28; break;
                default: days = 30;
                    break;
            }
        }

        return days;
    }
}
