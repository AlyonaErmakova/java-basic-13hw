package HW7Switch;

import java.util.Arrays;

public class CheckingAgeForSale {
    public static void main(String[] args) {
        int ageForCheck = 18;
        String ageString = "";

        switch (ageForCheck) {
            case 10:
                ageString = "!!! Продажа алкоголя запрещена";
                break;
            case 17:
                ageString = "!!! Продажа алкоголя запрещена";
                break;
            case 18:
                ageString = "Продажа алкоголя разрешена";
                break;
            case 20:
                ageString = "Продажа алкоголя разрешена";
                break;
            case 30:
                ageString = "Продажа алкоголя разрешена";
                break;
            default:
                ageString = "Введенное значение некорректно - " + ageForCheck;
                break;
            // программа сделана для проверки только 5-ти возрастов
        }
        System.out.println(ageString);
    }
}
