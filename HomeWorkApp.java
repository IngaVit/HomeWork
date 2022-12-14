package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int varA = 3;
        int varB = -7;
        int SumSign = varA + varB;
        if (SumSign >= 0) {
            System.out.println("Сумма положительная");
        }
        if (SumSign < 0) {
            System.out.println("Сумма отрицательная");
        }

    }

    private static void printColor() {
        int value = 127;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 3;
        int b = 7;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}
