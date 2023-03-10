package HomeWork002;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        /*
        Напишите метод, который принимает на вход строку (String)
        и определяет является ли строка палиндромом (возвращает boolean значение).
        */
        System.out.println(isPalindrome());
    }

    private static boolean isPalindrome() {
        // Create a new Scanner and String from user's input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check on palindrome: ");

        // Make lowerCase
        String wordToCheck = sc.next().toLowerCase();

        // Make array from string
        char[] newArr = wordToCheck.toCharArray();

        // Let's create an new array to save letters from prev array inverted
        char[] invertedArr = new char[newArr.length];

        // Save inverted data from prev array to new
        for (int i = 0, j = newArr.length - 1; i < invertedArr.length; i++) {
            invertedArr[i] = newArr[j];
            j--;
        }

        // Check and return True/False
        return Arrays.equals(newArr, invertedArr);
    }
}
