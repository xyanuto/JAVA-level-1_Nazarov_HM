package lesson2;

import java.util.random.RandomGeneratorFactory;
public class Homework2 {
    public static void main(String[] args) {
        Predel(5,6);
        positiveOrnegativ(2);
        System.out.println(trueOrfalse(0));
        Print("Гигбрейнс", 4);
    }


    private static void Predel(int a, int b) {
        System.out.println("Задание №2.1");
        int c = (a + b);
        if (c >= 10 && c <=20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    private static void positiveOrnegativ(int a) {
        System.out.println("Задание №2.2");
        if (a >= 0) {
            System.out.println(a+" -> Число  положительное");
        }
        else {
            System.out.println(a+" -> Число отрицательное");
        }
    }
    static boolean trueOrfalse(int a) {
        System.out.println("Задание №2.3");
        if (a >= 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void Print(String a, int b){
        System.out.println("Задание №2.4");
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

}
