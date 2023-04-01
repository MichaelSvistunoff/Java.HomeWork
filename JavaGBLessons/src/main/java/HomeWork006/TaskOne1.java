package HomeWork006;

import java.util.*;
import java.util.Comparator;
import  java.lang.Comparable;

public class TaskOne1 {
    public static void main(String[] args) {

//        System.out.println(getHashSet());
        getSortedArrayFromHashSet(getHashSet());

    }

    private static HashSet<Laptop> getHashSet() {

        Laptop lap_001 = new Laptop(1, "TRANSFORMER",     "LENOVO",   "IdeaPad Flex 3",                   "GRAY",     4,  "Radeon Graphics",          "AMD",      true,   512, 30_000);
        Laptop lap_002 = new Laptop(2, "TRANSFORMER",     "MSI",      "Summit E13 Flip",                  "WHITE",    4,  "Intel Iris Xe Graphics",   "INTEL",    true,   256, 125_000);
        Laptop lap_003 = new Laptop(3, "GAMING",          "LENOVO",   "Legion 5 15ITH6",                  "BLACK",    8,  "GeForce RTX 3050 4GB",     "INTEL",    true,   512, 73_000);
        Laptop lap_004 = new Laptop(4, "GAMING",          "ASUS",     "TUF Gaming A15",                   "BLACK",    8,  "GeForce GTX 1650 4GB",     "AMD",      true,   512, 60_000);
        Laptop lap_005 = new Laptop(5, "PROFESSIONAL",    "APPLE",    "MacBook Pro 16 M2 Pro 12/19С",     "SPACE",    16, "Apple",                    "APPLE",    true,   512, 380_000);
        Laptop lap_006 = new Laptop(6, "REGULAR",         "HUAWEI",   "MateBook X Pro MRGF-X",            "BLACK",    16, "Intel Iris Xe Graphics",   "INTEL",    false, 1024, 141_000);

        Laptop lap_007 = new Laptop(7, "REGULAR", "LENOVO", "IdeaPad 5", "Black", 8, "Intel Iris Xe Graphics ", "INTEL", false,256,46_000);

        var data = new HashSet<>(Arrays.asList(lap_001,lap_002,lap_003,lap_004,lap_005,lap_006, lap_007));

        return data;
    }

    private static void getSortedArrayFromHashSet(HashSet list) {
        // Initial area
        List<Laptop> newList = new ArrayList<>(list);
        Scanner sc = new Scanner(System.in);

        // Filter our list
        Collections.sort(newList, Laptop::compareTo);

        while (true) {
            System.out.println();
            System.out.print("Here is some commands you can use in this program:\n" +
                    "------------------------------------\n" +
                    "1\t-\tshow all the items of list;\n" +
                    "2\t-\tsort by input values\n" +
                    "3\t-\tsort all items by price\n" +
                    "4\t-\tsort all items by RAM\n" +
                    "5\t-\tclose the program.\n" +
                    "------------------------------------\n");

            // Ask user about filtering
            System.out.println("Enter the command you wanna use: ");
            String userInput = sc.next();

            // If user input is empty
            if (userInput.isBlank()) {
                System.out.println("String must not be empty!");
                continue;
            }

            // Close program
            if (userInput.equalsIgnoreCase("5")) {
                System.out.println("Hope to see you soon! Bye-bye!");
                break;
            }

            // Show all products in app
            if (userInput.equalsIgnoreCase("1")) {
                for (Laptop laptop : newList) {
                    System.out.println(laptop);
                }
            }

            // Sort by input vales
            if (userInput.equalsIgnoreCase("2")) {
                System.out.println("------------------------------------\n" +
                        "In this menu you can enter the value you wanna see the goods, for example enter " +
                        "Apple, or color, type of laptops to see the current stuff in our program." +
                        "\n------------------------------------\n" +
                        "Enter the command you wanna use: ");
                String userInputValue = sc.next().toUpperCase();

                for (Laptop laptop : newList) {
                    if (laptop.getType().equals(userInputValue) |
                        laptop.getBrand().equals(userInputValue) |
                        laptop.getColor().equals(userInputValue) |
                        laptop.getProcessor().equals(userInputValue)) {
                        System.out.println(laptop);
                    }
                }
            }

            // Sort by price
            if (userInput.equalsIgnoreCase("3")) {
                Collections.sort(newList, Laptop::compareToPrie);
                for (Laptop laptop : newList) {
                    System.out.println(laptop);
                }
                System.out.printf("------------------------------------\n");
                System.out.printf("The cheaper model is %s.%n%nThe expensive model is %s",
                        newList.get(0),newList.get(newList.size() - 1));
            }

            // Sort by RAM
            if (userInput.equalsIgnoreCase("4")) {
                Collections.sort(newList, Laptop::compareToRam);
                String minVal = String.valueOf(newList.get(0).getPrice());
                String maxVal = String.valueOf(newList.get(newList.size() - 1).getPrice());
                for (Laptop laptop : newList) {
                    System.out.println(laptop);
                }
                System.out.printf("------------------------------------\n");
                for (Laptop laptop : newList) {
                    if (minVal.equals(laptop) || minVal.equals(laptop)) {
                        System.out.printf(String.valueOf(laptop));
                    }
                }
                System.out.printf("The weakest model is %s.%n%nThe stronger model is %s",
                        newList.get(0),newList.get(newList.size() - 1));
            }

        }
    }
}
