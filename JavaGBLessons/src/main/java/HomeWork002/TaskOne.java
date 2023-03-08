package HomeWork002;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        /*
        Напишите метод, который принимает на вход строку (String)
        и определяет является ли строка палиндромом (возвращает boolean значение).
        */
        System.out.println(isPolindrome());
    }

    private static boolean isPolindrome() {
        // Create a new Scanner and String from user's input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check on polindrome: ");
        String wordToCheck = sc.next();
        // Make array from string
        char[] newArr = wordToCheck.toCharArray();
        // Make checker
        boolean isTrue = false;

        for (int i = 0; i < newArr.length / 2; i++) {
            isTrue = newArr[i] == newArr[newArr.length - 1 - i];
        }
        return isTrue;
    }
}
