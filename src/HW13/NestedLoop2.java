package HW13;

public class NestedLoop2 {
    public static void main(String[] args) {
/*        split();
        isoscelesTriangle1();
        split();
        isoscelesTriangle2();
        split();
        rhombus();
        split();*/
        triangleOfNumbers();
    }

    public static void split() {
        System.out.println("----------------------------------------");
    }

    public static void isoscelesTriangle1() {
        String x = " ";
        String y = "*";
        String output = "";
        for (int i = 0; i < 10; i++) {
            output = output + x;
        }
        System.out.println(output);
        output = output.substring(1, output.length()) + y;
        System.out.println(output);

        for (int k = 0; k < 9; k++) {
            output = output.substring(1, output.length()) + y + y;
            System.out.println(output);
        }
    }

    public static void isoscelesTriangle2() {
        String x = "*";
        String y = " ";
        String output = "";
        for (int i = 0; i < 19; i++) {
            output = output + x;
        }
        System.out.println(output);
        for (int j = 0; j < 10; j++) {
            output = y + output.substring(0, output.length() - 2);
            System.out.println(output);
        }
    }

    public static void rhombus() {
        String x = " ";
        String y = "*";
        String output1 = "";
        String output2 = "";
        for (int i = 0; i < 10; i++) {
            output1 = output1 + x;
        }
        System.out.println(output1);
        output1 = output1.substring(1, output1.length()) + y;
        System.out.println(output1);

        for (int k = 0; k < 9; k++) {
            output1 = output1.substring(1, output1.length()) + y + y;
            System.out.println(output1);
        }
        for (int i = 0; i < 17; i++) {
            output2 = output2 + y;
        }
        System.out.println(x + output2);
        for (int j = 0; j < 10; j++) {
            output2 = x + output2.substring(0, output2.length() - 2);
            System.out.println(x + output2);
        }
    }

    public static void triangleOfNumbers() {
        for (int x = 1; x <= 6; x++) {
            for (int i = 0; i <= x; i++) {
                System.out.print(x);
            }
            System.out.println("");
        }


    }

}


