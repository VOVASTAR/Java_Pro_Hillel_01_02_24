package homework.hm1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInterval());
        checkPositiveOrNegative(7);
        System.out.println(isNegative(-4));
        printLine("line", 5);
        System.out.println(isLeapYear(204));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -10;

        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor() {
        int value = 177;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumInterval() {
        int a = 10;
        int b = 5;
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println(a + " - додатнє число");
        } else {
            System.out.println(a + " - від’ємне число");
        }
    }

    public static boolean isNegative(int a) {
        return a < 0 ? true : false;
    }

    public static void printLine(String line, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(line);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? true : false;
    }
}

