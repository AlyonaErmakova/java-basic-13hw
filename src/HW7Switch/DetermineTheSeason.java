package HW7Switch;

import java.util.Arrays;

public class DetermineTheSeason {
    public static void main(String[] args) {
        int monthDigits = 2;
        String monthString = "";

        switch (monthDigits) {
            case 1:
                monthString = "Зима";
                break;
            case 2:
                monthString = "Зима";
                break;
            case 3:
                monthString = "Весна";
                break;
            case 4:
                monthString = "Весна";
                break;
            case 5:
                monthString = "Весна";
                break;
            case 6:
                monthString = "Лето";
                break;
            case 7:
                monthString = "Лето";
                break;
            case 8:
                monthString = "Лето";
                break;
            case 9:
                monthString = "Осень";
                break;
            case 10:
                monthString = "Осень";
                break;
            case 11:
                monthString = "Осень";
                break;
            case 12:
                monthString = "Зима";
                break;
            default:
                monthString = "Некорректно введенные данные - " + monthDigits;
        }
        System.out.println(monthString);
    }
}
