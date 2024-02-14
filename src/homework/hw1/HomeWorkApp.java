package homework.hw1;

public class HomeWorkApp {

    public static void main(String[] args) {
        HomeWorkApp example = new HomeWorkApp();

        example.printThreeWords();
        example.checkSumSign();
        example.printColor();
        example.compareNumbers();
        System.out.println(example.checkSumInterval(2, 7));
        example.checkSign(7);
        System.out.println(example.isNegative(-4));
        example.printLine("line", 5);
        System.out.println(example.isLeapYear(204));
    }

    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public void checkSumSign() {
        int a = 10;
        int b = -10;

        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public void printColor() {
        int value = 177;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public void compareNumbers() {
        int a = 10;
        int b = 15;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean checkSumInterval(int number1, int number2) {
        int sum = number1 + number2;
        return (sum >= 10 && sum <= 20);
    }

    public void checkSign(int a) {
        if (a >= 0) {
            System.out.println(a + " - додатнє число");
        } else {
            System.out.println(a + " - від’ємне число");
        }
    }

    public boolean isNegative(int a) {
        return a < 0;
    }

    public void printLine(String line, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(line);
        }
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}