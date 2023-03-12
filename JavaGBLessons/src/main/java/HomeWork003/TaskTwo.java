package HomeWork003;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TaskTwo {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList. Найти минимальное,
        максимальное и среднее арифметическое из этого списка.
        */
        findMinMaxMidVal();
    }

    private static void findMinMaxMidVal() {
        // Initial area
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        // Fill array by Random()
        for (int i = 0; i < 8; i++) {
            arr.add(rand.nextInt(20));
        }
        System.out.println(arr);
        System.out.printf("%s\t-\tMin elem",findMin(arr));
        System.out.println();
        System.out.printf("%s\t-\tMax elem",findMax(arr));
        System.out.println();
        System.out.printf("%s\t-\tMid elem",findMid(arr));
    }

    private static int findMid(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count += arr.get(i);
        }
        return (count / arr.size());
    }

    private static int findMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    private static int findMin(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }
}