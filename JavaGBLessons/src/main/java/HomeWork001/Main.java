package HomeWork001;

import java.util.Arrays;

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
    }

    private static int[] generateRandomArray() {
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int)Math.round((Math.random() * 30) - 20 );
        }
        System.out.println("Our random array is:");
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
}
