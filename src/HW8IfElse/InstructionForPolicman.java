package HW8IfElse;

public class InstructionForPolicman {
    /*Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
    при езде до 50 км/час нарушений нет;
    за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
    за превышение скорости от 16 км/час — 40 евро штрафа;
    за езду от 100 км/час до 130 км/час — штраф 500 евро;
    и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
    средства.*/


    public static void main(String[] args) {
        /*checkingSpeed(40);
        split();
        checkingSpeed(50);
        split();
        checkingSpeed(57);
        split();
        checkingSpeed(65);
        split();
        checkingSpeed(68);
        split();
        checkingSpeed(100);
        split();
        checkingSpeed(110);
        split();
        checkingSpeed(130);
        split();
        checkingSpeed(132);
        split();*/
        System.out.println(choice("направо"));
        System.out.println(choice("Налево"));
        System.out.println(choice("ПряМО"));
        System.out.println(choice("назад"));
    }

    public static void checkingSpeed(int speed) {
        if (speed > 130.0) {
            System.out.println("Необходимо выписать штраф  размере 1000 евро, конфисковать права " +
                    "сроком на 3 года и транспортное средство");
        } else if (100 <= speed) {
            System.out.println("Необходимо выписать штраф  размере 500 евро");
        } else if (65 < speed) {
            System.out.println("Необходимо выписать штраф  размере 40 евро");
        } else if (50 < speed) {
            System.out.println("Сделать устное предупреждение и провести пятиминутную лекцию");
        } else {
            System.out.println("Нарушений нет! Всего доброго!");
        }
    }

    public static void split() {
        System.out.println("---------------");
    }

    public static String choice(String choice) {
        String result = "";
        switch (choice.toLowerCase()) {
            case "налево":
                result = "Коня потеряешь";
                break;
            case "направо":
                result = "Счастье найдешь";
                break;
            case "прямо":
                result = "Тещу встретишь";
                break;
            default:
                result = "Повторите свой выбор из следующих трех вариантов: налево, прямо, направо.";
                break;
        }
        return result;
    }
}