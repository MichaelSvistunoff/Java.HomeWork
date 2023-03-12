package HomeWork003;

import java.util.ArrayList;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {
        /*
        Пусть дан произвольный список целых чисел,
        удалить из него четные числа (в языке уже есть что-то готовое для этого)
        */
        getIntArrWighDeletedNums();
    }

    private static void getIntArrWighDeletedNums() {
        // Initial area
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        // Fill array by Random()
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(20));
        }
        //Show original array
        System.out.println("Our original array:");
        System.out.println(arr);
        // Delete numbers % 2 == 0
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0){
                arr.remove(i);
                i--;
            }
        }
        // Show corrected array
        System.out.println("Our corrected array:");
        System.out.println(arr);
    }
}
