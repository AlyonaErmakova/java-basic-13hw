package HW2;

public class Cube {
    public static void main(String[] args) {
        areaCube();
        perimeterCube();
    }

    public static void areaCube() {
        int a = 3456;
        int areaCube = a * a * 6;
        System.out.println("Площадь куба = " + areaCube);
    }

    public static void perimeterCube() {
        int a = 3456;
        int perimeterCube = a * 12;
        System.out.println("Периметр куба = " + perimeterCube);
    }
}
