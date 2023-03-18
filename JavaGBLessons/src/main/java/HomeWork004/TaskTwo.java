package HomeWork004;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        /*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
        */

        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "one", "two", "three", "four", "five", "six", "seven", "eight");

        System.out.println(list);
        System.out.println(getReversedList(list));
    }

    private static LinkedList getReversedList(LinkedList<String> list) {
        LinkedList<String> newList= new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
}
