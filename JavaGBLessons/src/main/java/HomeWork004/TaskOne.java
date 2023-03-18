package HomeWork004;

import java.util.*;

public class TaskOne {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так,
        чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
        */
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "one", "two", "three", "four", "five", "six", "seven", "eight");

        while (true) {
            System.out.println();
            System.out.print("Here is some commands you can use in this program:\n" +
                    "------------------------------------\n" +
                    "print   - show all the items of list;\n" +
                    "print~a - just to check the list before changing\n" +
                    "revert  - delete previous inputted string\n" +
                    "add     - add new item to the list;\n" +
                    "exit    - close the program.\n" +
                    "------------------------------------\n");
            System.out.print("Enter the command: ");
            String userInput = sc.next();

            // If user input is empty
            if (userInput.isBlank()) {
                System.out.println("String must not be empty!");
                continue;
            }

            // Close program
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            // Change the first and the last elements
            if (userInput.equalsIgnoreCase("print")) {
                String temp = null;
                temp = list.getLast();
                list.set(list.size() - 1, list.getFirst());
                list.set(0, temp);
                for (int i = 0; i < list.size(); i++) {
                    System.out.printf("%d) %s%n", i + 1, list.get(i));
                }
            }

            // Delete
            if (userInput.equalsIgnoreCase("revert")) {
                list.remove(list.size() - 2);
            }

            // Just to check
            if (userInput.equalsIgnoreCase("print~a")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.printf("%d) %s%n", i + 1, list.get(i));
                }
            }

            // Add new element
            if (userInput.equalsIgnoreCase("add")) {
                System.out.print("Enter the element to add: ");
                String newElem = sc.next();
                list.add(newElem);
            }
        }
    }
}
