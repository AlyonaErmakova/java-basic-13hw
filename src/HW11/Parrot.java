package HW11;

public class Parrot {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6)); //→ true
        System.out.println(parrotTrouble(true, 7)); //→ false
        System.out.println(parrotTrouble(false, 6)); //→ false
    }

    public static boolean parrotTrouble(boolean talk, int hour) {
/*        if (talk == true && (hour > 20 || hour < 7)) {
            return true;
        }
        return false;*/
        return talk && (hour > 20 || hour < 7);
    }
}
