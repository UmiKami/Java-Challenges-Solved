public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if (isBarking && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23){
            return true;
        }else {
            return false;
        }
    }

}
