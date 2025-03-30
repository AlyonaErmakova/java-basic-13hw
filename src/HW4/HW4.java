package HW4;

public class HW4 {
    public static void main(String[] args) {
        differentSymbol();
        testString();
        text();
        questionnaire();
        actionWithString1();
        actionWithString2();
    }

    public static void differentSymbol() {
        char a;
        a = '\u263A';
        System.out.println("Улыбающийся смайлик " + a);
        a = '\u266A';
        System.out.println("Нота " + a);
        a = '\u260E';
        System.out.println("Телефон " + a);
        a = '\u0024';
        System.out.println("Доллар " + a);
        a = '\u00A7';
        System.out.println("Символ параграфа " + a);
        a = '\u00A9';
        System.out.println("Символ копирайта " + a);
        a = '\u2122';
        System.out.println("Символ торговой марки " + a);
        a = '\u264C';
        System.out.println("Знак зодиака лев " + a);
        a = '\u2661';
        System.out.println("Символ червы " + a);
        a = '\u2603';
        System.out.println("Снеговик " + a);
        a = '\u20AC';
        System.out.println("Евро " + a);
        System.out.println();
    }

    public static void testString() {
        // проверка возможности сложения и умножения переменных типа String
        String a, b;
        a = "Alyona ";
        b = "Ermakova";
        System.out.println("Тест на сложение переменных типа String - " + (a + b));
        //System.out.println(a * b); //умножение - умножать переменные типа String нельзя)
        System.out.println();
    }


    public static void text() {
        String a;
        a = "Alyona \"инженер\"";
        System.out.println(a);
        System.out.println();
    }

    public static void questionnaire() {
        String a;
        a = "Alyona";
        System.out.println("- Имя пользователя: " + a);
        a = "Ermakova";
        System.out.println("- Фамилия пользователя: " + a);
        a = "Moscow";
        System.out.println("- Город: " + a);
        a = "Lobnenskaya";
        System.out.println("- Улица: " + a);
        System.out.println();
    }

    public static void actionWithString1() {
        String a, b, c;
        a = "Вход воспрещен";
        b = "разрешен";
        c = a.substring(0, 5) + b;
        System.out.println(c);
        System.out.println();
    }

    public static void actionWithString2() {
        String a;
        a = "Осторожно, вход воспрещён";
        a = a.toUpperCase();
        System.out.println(a);
    }
}
