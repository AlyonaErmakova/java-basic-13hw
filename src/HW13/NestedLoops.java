package HW13;

public class NestedLoops {
    private static boolean i;

    public static void main(String[] args) {

/*        rectangle(5, 7);
        split();
        jonhDo();
        split();
        cheesboard();
        split();
        multiplicationTable();
        split();
        floydsTriangle(7);
        split();
        triangle1();
        split();
        triangle2();
        split();*/
        triangle3(20, "/");
        split();
    }

    public static void split() {
        System.out.println("----------------------------------------");
    }

    // 1. Прямоугольник
    // Решила сама
    public static void rectangle(int line, int countStar) {
        String star = "*";
        String lineStar = "";
        for (int i = 0; i < countStar; i++) {
            lineStar = lineStar + star;
        }

        for (int i = 0; i < line; i++) {
            System.out.println(lineStar);
        }
    }

    // 2. Трое неизвестных
    // Не догадалась как делать, смотрела видео
    public static void jonhDo() {
        int rowIndex = 1;
        // Если x<=y<=z и их x*y*z = 36
        for (int x = 1; x < 36; x++) {
            for (int y = x; y < 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ")" + " " + x + " " + +y + " " + z);
                        rowIndex++;
                    }
                }
            }
        }
    }

    // 3. Шахматная доска
    // Решила сама
    public static void cheesboard() {
        String x = "*";
        String y = "_";
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i < 5; i++) {
                String output1 = x + y;
                System.out.print(output1);
            }
            System.out.println("");
            for (int j = 1; j < 5; j++) {
                String output1 = y + x;
                System.out.print(output1);
            }
            System.out.println("");
        }
    }

    // 4. Таблица умножения
    // Решила сама
    public static void multiplicationTable() {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(String.format("%4d", x * y));
            }
            System.out.println("");
        }
    }

    // 6.3 Floyd`s triangle
    // Не догадалась как делать, смотрела видео
    public static void floydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println("");
        }
    }

    //5. Геометрические фигуры
    public static void triangle1() {
        String x = "*";
        String output = "";
        for (int i = 0; i < 10; i++) {
            output = output + x;
            System.out.println(output);
        }

    }

    // Решено по памяти из лекции, сама бы не догадалась или очень долго думала.
    public static void triangle2() {
        String x = "*";
        String output = "";
        for (int i = 0; i < 10; i++) {
            output = output + x;
        }
        System.out.println(output);
        for (int j = 0; j < 10; j++) {
            output = output.substring(0, output.length() - 1);
            System.out.println(output);
        }

    }

    // Решила сама

    /**
     * Prints a right-aligned triangle pattern using the specified character.
     *
     * <p>The triangle starts with a given number of spaces and progressively
     * replaces them with the specified pointer character, forming a right-aligned shape.
     *
     * @param rows    the number of rows in the triangle
     * @param pointer the character used to form the triangle
     */
    public static void triangle3(int rows, String pointer) {
        String x = " ";
        String output = "";
        for (int i = 0; i < rows; i++) {
            output = output + x;
        }
        System.out.println(output);
        for (int j = 0; j < rows; j++) {
            output = output.substring(1) + pointer;
            System.out.println(output);
        }
    }


}

