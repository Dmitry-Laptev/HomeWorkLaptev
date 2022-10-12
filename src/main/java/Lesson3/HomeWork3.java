package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    public static void main (String[] args) {
        paragraph1();
        paragraph2();
        paragraph3();
        paragraph4();
        paragraph5(10, 6);
        paragraph6();
        paragraph7(5);
        System.out.println(paragraph7(5));
    }

    private static void paragraph1() {

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i] + 1;
            } else arr[i] = arr[i] - 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void paragraph2() {

        int n = 1;
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = n++;
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void paragraph3() {

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }


    private static void paragraph4() {

        int m = 1;

        int[][] arr3 = new int[10][10];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i] == arr3[j]) {
                    arr3[i][j] = m;
                    arr3[i][9-i] = m;
                }
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%2d ", arr3[i][j]);
            }
            System.out.println();
        }
    }

    private static void paragraph5(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr5));
    }

    private static void paragraph6() {

        int arrayLength = 10;
        int[] arr6 = new int[arrayLength];
        Random value = new Random();
        int max = 0;
        int min = 20;
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = value.nextInt(20);
        }
        System.out.println(Arrays.toString(arr6));

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
        }
        System.out.println("Maximum is " + max);

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("Minimum is " + min);
    }

    private static boolean paragraph7(int length) {
        int[] arr7 = new int[length];
        Random random = new Random();
        arr7[0] = 2;
        arr7[1] = 3;
        arr7[2] = 4;
        arr7[3] = 0;
        arr7[4] = 1;
        /*for (int i = 0; i < arr7.length; i++) {
            arr7[i] = random.nextInt(5);
        }*/
        System.out.println(Arrays.toString(arr7));

        int sumA = 0;
        int sumB = 0;
        while (sumA == sumB) {
            for (int i = 0; i < arr7.length; i++) {
                sumA += arr7[i];
//                System.out.println("A = "+ sumA);
                for (int j = i + 1; j < arr7.length; j++) {
                    sumB += arr7[j];
//                    System.out.println("B = " + sumB);
                }
                if (sumA == sumB) {
                    System.out.println("A = " + sumA);
                    System.out.println("B = " + sumB);
                    return true;
                }
                sumB = 0;
            }
        }
        return false;
    }

}

