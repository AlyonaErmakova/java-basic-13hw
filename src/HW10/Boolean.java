package HW10;

public class Boolean {
    public static void main(String[] args) {
        /*System.out.println(startHi("hi there")); // true
        System.out.println(startHi("hi")); // true
        System.out.println(startHi("hello hi")); // false*/

        System.out.println(hasTeen(13, 20, 10)); // → true
        System.out.println(hasTeen(20, 19, 10)); // → true
        System.out.println(hasTeen(20, 10, 13)); // → true
    }

    public static boolean startHi(String hi) {
        if (hi.substring(0, 2).equals("hi")) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        if ((12 < teen1 & teen1 < 20) || (12 < teen2 & teen2 < 20) || (12 < teen3 & teen3 < 20)) {
            return true;
        }
        return false;
    }
}
