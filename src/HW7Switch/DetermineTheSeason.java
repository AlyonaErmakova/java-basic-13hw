package HW7Switch;

import java.util.Arrays;

public class DetermineTheSeason {
    public static void main(String[] args) {
        theSeason(2);
        split();
        theSeason(4);
        split();
        theSeason(7);
        split();
        theSeason(11);
        split();
        theSeason(12);
        split();
        theSeason(15);
        split();
    }
    public static void theSeason (int monthDigits)
    { String monthString = "";

        switch (monthDigits) {
            case 12:
            case 1:
            case 2:
                monthString = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                monthString = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                monthString = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                monthString = "Осень";
                break;
            default:
                monthString = "Некорректно введенные данные - " + monthDigits;
        }
        System.out.println(monthString);
    }
    public static void split (){
        System.out.println("---------------");
    }
}
