package HW3;

public class HW3Find {
    public static void main(String[] args) {
        findSquareCircle();
        findLenghtCircle();
        findEuroRate();
        findSquareRate1();
        findSquareRate2();
        findProfitDepiosit();
    }


    public static void findSquareCircle() {
        double r = 7;
        final double PI = 3.14;
        double square = PI * r * r;
        System.out.println("Площадь круга = " + square);
    }

    public static void findLenghtCircle() {
        double r = 7;
        final double PI = 3.14;
        double length = 2 * PI * r;
        System.out.println("Длина окружности = " + length);
    }

    public static void findEuroRate() {
        // курс евро к доллару 1,1
        double euro, dollar;
        dollar = 12; // количество долларов в кошельке для обмена на евро
        euro = dollar * 1.1;
        System.out.println("Курс евро к доллару = " + euro);
    }

    public static void findSquareRate1() {
        //найти соотношение площади Беларуси к площади Украины
        double square1 = 207560; // площадь Беларуси км^2
        double square2 = 603549; // площадь Украины км^2
        double rate = square1 / square2;
        System.out.println("Соотношение площади Беларуси к площади Украины = " + rate);
    }

    public static void findSquareRate2() {
        // Найти соотношение площади Москвы к площади Берлина
        double square1 = 2511; // площадь Москвы км^2
        double square2 = 891.8; // площадь Берлина км^2
        double rate = square1 / square2;
        System.out.println("Соотношение площади Москвы к площади Берлина = " + rate);
    }

    public static void findProfitDepiosit() {
        // Найти, какую сумму даст вклад под 3,5% на 7 лет с первоначальным взносом 1000 евро
        double sum = 1000; // сумма вклада
        double percentage = 3.5; // проценты по вкладу
        double finalSum = sum * Math.pow((1 + percentage / 100), 7);
        System.out.println("Итоговая сумма по вкладу = " + finalSum);
    }
}
