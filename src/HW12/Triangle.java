package HW12;

public class Triangle {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        String star = "*";
        String output = "          ";
        for (int i = 0; i < 10; i++) {
            output = output.substring(1) + star;
            System.out.println(output);
        }
    }
}
