package HW2;

public class Square {
    public static void main(String[] args) {
        areaSquare();
        perimeter();
    }

    public static void areaSquare() {
        byte a = 9;
        int area = a * a;
        System.out.println("Площадь квадрата = " + area);
    }

    public static void perimeter() {
        byte a = 9;
        int perimeter = a * 4;
        System.out.println("Периметр квадрата = " + perimeter);
    }
}
