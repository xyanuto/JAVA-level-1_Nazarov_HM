package lesson1;

import java.util.random.RandomGeneratorFactory;

public class HomeWork1 {
    public static void main(String[] args) {
        PrintThreeWords();
        checkSum();
        printColor();
        compareNumbers();
    }
    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSum() {
        int a = 10;
        int b = -11;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
            }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 20;
        if (a >= b) {
            System.out.println("a >=b");
        }
        else {
            System.out.println("a < b");
        }
    };
}