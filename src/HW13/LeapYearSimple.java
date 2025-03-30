package HW13;

public class LeapYearSimple {
    public static void main(String[] args) {
        leapYear(1990, 2150);
    }

    // программа проверяет: является год високосным или нет, простым способом.
    // (yearStart, yearEnd) - диапазон, в котором идет поиск високосных годов
    public static void leapYear(int yearStart, int yearEnd) {
        for (int i = yearStart; i < yearEnd; i++) {
            if (i % 4 == 0) {
                System.out.println(i + "- високосный год");
            }
        }
    }
}