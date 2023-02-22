package lesson3;


import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;

public class Homework3 {
        public static void main(String[] args) {
            invers();
            randomArray();
            arraysearch();
            doubleArray();
            metod(4,3);
            job6();

        }
        private static void invers() {
            System.out.println("Задание №1");
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 } ;
            //System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 1) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
        private static void randomArray() {
            System.out.println("Задание №2");
            int[] massive = new int [100];
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        }
        private static void arraysearch() {
            System.out.println("Задание №3");
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for ( int i = 0; i < 12; i++) {
                if (arr[i] < 6) {
                    System.out.println(arr[i] * 6);
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
        private static void doubleArray() {
            System.out.println("Задание №4");
            int [][] table = new int [6][6];
            for (int a = 0; a < 6; a++) {
                for (int b = 0; b < 6; b++) {
                    if (table[a] == table[b]) {
                        System.out.print(1);
                    } else System.out.print(table[a][b]);
                }
                System.out.println();
            }
        }
        public static void metod(int len, int initialValue) {
            System.out.println("Задание №5");
            int[] armxy = new int [len];
            for(int i = 0; i < armxy.length; i++) {
                System.out.print(initialValue);
            }
        }
        private static void job6() {
            System.out.println("Задание №6*");
            int[] mas = new int[]{2, 6, 1, -7, 8, -5, 17};
            int maxValue = mas[0];
            int minValue = mas[0];
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] > maxValue) {
                    maxValue = mas[i];
                }
            }
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < minValue) {
                    minValue = mas[i];
                }
            }
            System.out.println("Минимальное значение" + "=" + minValue);
            System.out.println("Максимальное значение" + "=" + maxValue);
        }
}
