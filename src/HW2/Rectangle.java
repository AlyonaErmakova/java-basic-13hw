package HW2;

public class Rectangle {
    public static void main(String[] args) {
        areaRectangle();
        perimeterRectangle();
    }

    public static void areaRectangle() {
        short a = 68;
        short b = 3456;
        long areaRectangle = a * b;
        System.out.println("Площадь прямоугольника = " + areaRectangle);
    }

    public static void perimeterRectangle() {
        short a = 68;
        short b = 3456;
        long perimeterRectangle = (a + b) * 2;
        System.out.println("Периметр прямоугольника = " + perimeterRectangle);
    }
}
