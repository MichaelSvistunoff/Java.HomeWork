package HomeWork001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Task-1:
            Задать одномерный массив и найти в нем минимальный и максимальный элементы.
        Task-2:
            Написать метод, который определяет, является ли год високосным, и возвращает
            boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
            кроме каждого 100-го, при этом каждый 400-й – високосный.
        Task-3:
            Дан массив nums = [3,2,2,3] и число val = 3.
            Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
            Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
            а остальные - равны ему.
        */
        findMinAndMaxElementsOfArray(generateRandomArray());
        isYearleap();
        sortArraysElemsToEndByNum(generateArray());
    }

    private static int[] generateRandomArray() {
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int)Math.round((Math.random() * 30) - 20 );
        }
        System.out.println("\n---------\nOur random array is:");
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private static void findMinAndMaxElementsOfArray(int[] array) {
        int numMax = array[0];
        int numMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numMax) {
                numMax = array[i];
            } else if (array[i] < numMin) {
                numMin = array[i];
            }
        }
        System.out.printf("\nMinial number is %d. Maximal number is %d", numMin, numMax);
    }

    private static void isYearleap() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n---------\nEnter the year u wanna check as leap year: ");
        int year = in.nextInt();
        boolean leapYear = ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0));
        if (leapYear) {
            System.out.printf("%d year is Leap Year!", year);
        } else {
            System.out.println("NOT a Leap Year!");
        }
    }

    private static int[] generateArray() {
        int[] array = {3, 2, 3, 3, 2, 3, 2, 3};
        System.out.println("\n---------\nOur first array is:");
        System.out.println(Arrays.toString(array));
        return array;

    }

    private static int[] sortArraysElemsToEndByNum(int[] nums) {
        int[] newArray = new int[nums.length];
        int step = 0;
        int val = 3;
        for (int i: nums) {
            if (i != val){
                newArray[step++] = i;
            }
        }
        for (int i = step; i < newArray.length; i++) {
            newArray[i] = val;
        }
        System.out.println("\nOur edited array is:");
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}