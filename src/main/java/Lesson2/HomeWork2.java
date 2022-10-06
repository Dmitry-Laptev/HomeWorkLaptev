package Lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWork2 {
    public static void main(String[] args) {
        paragr1();
        System.out.println(paragr1());
        paragr2();
        paragr3(-10);
        System.out.println(paragr3(-10));
        paragr4("Lorem ipsum tenet", 5);
    }

    private static boolean paragr1() {
        int a = 4;
        int b = 7;
        if (10 <= (a + b) && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void paragr2() {
        int a = ThreadLocalRandom.current().nextInt();
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        System.out.println(a);
    }

    private static boolean paragr3(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void paragr4(String expr,int count) {
        for (int i = 0;i < count; i++) {
            System.out.println(expr);
        }
    }
}
