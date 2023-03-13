package HomeWork003;

import java.util.ArrayList;

public class TaskThr {
    public static void main(String[] args) {
        /*
        Создать список типа ArrayList<String>.
        Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        */
        getListWithoutInts();
    }

    private static void getListWithoutInts() {
        // Create ArrayList and fill it
        ArrayList<String> list = new ArrayList<>();
        list.add("7.85");
        list.add("785");
        list.add("Michael");
        list.add("True");
        list.add("Some");
        list.add("753.5");
        list.add("Add");
        list.add("-35");
        list.add("Pete");
        list.add("Cat");
        list.add("Dog753");
        list.add("0");
        list.add("257.357");
        list.add("15");
        list.add("Adele");

        // Print ArrayList to see what we have
        System.out.println("Original array:\n" + list);

        // Let's check the array and delete all the integers from this
        for (int i = 0; i < list.size(); i++) {
            try {
                int n = Integer.parseInt(list.get(i));
                System.out.printf("%s is integer. The integer was deleted from array.%n",list.get(i));
                list.remove(i);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not integer. It stays in array!%n",list.get(i));
            }
        }

        // Print ArrayList without integers
        System.out.println("The final array without integers:\n" + list);
    }
}
