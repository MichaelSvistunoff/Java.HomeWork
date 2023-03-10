package HomeWork002;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class TaskTwo {
    static Logger logger = Logger.getLogger("TaskTwo");
    public static void main(String[] args) {
        /*
        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        saveDataToFile();
    }

    private static StringBuilder getReapetedWords() {
        // Initial zone
        String str = "Test".toUpperCase();
        int size = 100;
        StringBuilder sb = new StringBuilder();

        // Create full string with word TEST
        for (int i = 1; i < size + 1; i++) {
            if (i < 10){
                sb.append(str).append(" [Line 00").append(i).append("]").append(System.lineSeparator());
            } else if (i < size ){
                sb.append(str).append(" [Line 0").append(i).append("]").append(System.lineSeparator());
            }
            else {
                sb.append(str).append(" [Line ").append(i).append("]");
            }
        }
        // Get our StringBuilder
        return sb;
    }

    private static void saveDataToFile() {
        // Create a new file which calls HomeWork02.txt
        try(PrintWriter pw = new PrintWriter("src/main/java/HomeWork002/assets/HomeWork02.txt");) {
            // Fill this file from out method getReapetedWords()
            pw.print(getReapetedWords());
            System.out.println("Check the file HomeWork02.txt");
        } catch (FileNotFoundException e) {
            // Check our errors if they are
            logger.severe(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
