package HW13;

public class EvenNumber {

    public static void main(String[] args) {
        evenNumbers(200);
    }
    // программа находит четные числа в диапазоне от 2 до range.
    // range - диапазон от 2 до range, в котором происходит поиск четных чисел.
    public static void evenNumbers(int range) {
        for (int i = 2; i < range; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - чётное число");
            }
        }
    }
}