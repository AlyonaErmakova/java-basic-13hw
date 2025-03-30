package HW13;

public class FindNumber {
    public static void main(String[] args) {
        findNumbers();
    }

    /* Дано число меньше 3000. При делении числа на 32 получается остаток 30,
    при делении на 58 - остаток 44. Найдите число или числа.*/
    public static void findNumbers() {
        for (int i = 3000; i > 0; i--) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }
}