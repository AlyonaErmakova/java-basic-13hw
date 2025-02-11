package HW2;

public class Chess {

    public static void main(String[] args) {
        numbersOfGrains();
    }

    public static void numbersOfGrains() {
        int a = 2;
        int b = 64;
        double numbersOfGrains = Math.pow(a, b);
        System.out.println("Количество зерен на шахматной доске = " + (numbersOfGrains - 1));
    }

}
