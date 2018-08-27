public class BarkingDog {

    public static void main(String[] args) {
        bark(true, 1);
    }
    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay >= 0) && (hourOfDay < 8)) {
            return true;
        } else if(barking && (hourOfDay > 22) && (hourOfDay <= 24)) {
            return true;
        } else if(!barking) {
            return false;
        } else {
            return false;
        }

    }
}
