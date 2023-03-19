package HomeWork005;

import java.util.*;

public class TaskOne {
    public static void main(String[] args) {
        getPhoneBookView(getDictionaty());
        getSortedRating(getDictionaty());
    }

    private static void getSortedRating(Map map) {
        System.out.print("\nTelephone book rating of repeats:\n---------------------------\n");
        LinkedList<String> listEmployee = new LinkedList<>();
        String currName = listEmployee.getFirst();
        String nextName = listEmployee.getFirst();
        String name = null;
        int count = 0;
        Map<String, Integer> db = new HashMap<>();

        // Fill list of employee by name
        for (Object o : map.keySet()) {
            name = o.toString().split(" ")[0];
            listEmployee.add(name);
        }

        // Sort names by alphabet
        Collections.sort(listEmployee);

        // Count repeated names and put it in db
        for (int i = 1; i < listEmployee.size(); i++) {
            nextName = listEmployee.get(i);
            count++;
            if (!nextName.equals(currName)) {
                db.put(currName, count);
                count = 0;
                currName = nextName;
            }
        }
        db.put(currName, count + 1);

        // Get sorted list of employees
        db.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }

    private static void getPhoneBookView(Map map) {
        System.out.print("\nTelephone book:\n---------------------------\n");
        String messageOne = "Employee ";
        String messageTwo = ":";
        for (Object key : map.keySet()) {
            System.out.printf("%s%s%s%s%n", messageOne, key, messageTwo, map.get(key));
        }
    }

    private static Map<String, ArrayList<String>> getDictionaty() {
        Map<String, ArrayList<String>> db = new HashMap<>();
        db.put("Иван Иванов", new ArrayList<>(Arrays.asList("+7(999) 123-19-17", "+7(900) 123-19-17", "+7(908) 123-19-17")));
        db.put("Светлана Петрова", new ArrayList<>(Arrays.asList("+7(900) 155-17-55", "+7(904) 155-17-55")));
        db.put("Кристина Белова", new ArrayList<>(Arrays.asList("+7(908) 119-59-35", "+7(962) 119-59-35", "+7(900) 119-59-35")));
        db.put("Анна Мусина", new ArrayList<>(Arrays.asList("+7(913) 613-10-12", "+7(900) 613-10-12", "+7(908) 613-10-12", "+7(904) 613-10-12")));
        db.put("Анна Крутова", new ArrayList<>(Arrays.asList("+7(908) 100-39-19")));
        db.put("Иван Юрин", new ArrayList<>(Arrays.asList("+7(962) 888-59-39", "+7(900) 888-59-39", "+7(904) 888-59-39")));
        db.put("Петр Лыков", new ArrayList<>(Arrays.asList("+7(904) 157-32-02", "+7(905) 157-32-02")));
        db.put("Павел Чернов", new ArrayList<>(Arrays.asList("+7(908) 700-22-44", "+7(999) 700-22-44", "+7(900) 700-22-44", "+7(962) 700-22-44")));
        db.put("Петр Чернышов", new ArrayList<>(Arrays.asList("+7(913) 756-50-72")));
        db.put("Мария Федорова", new ArrayList<>(Arrays.asList("+7(908) 632-66-19")));
        db.put("Марина Светлова", new ArrayList<>(Arrays.asList("+7(999) 153-14-70")));
        db.put("Мария Савина", new ArrayList<>(Arrays.asList("+7(900) 704-13-12")));
        db.put("Мария Рыкова", new ArrayList<>(Arrays.asList("+7(999) 130-74-40")));
        db.put("Марина Лугова", new ArrayList<>(Arrays.asList("+7(908) 075-50-05")));
        db.put("Анна Владимирова", new ArrayList<>(Arrays.asList("+7(904) 700-17-35")));
        db.put("Иван Мечников", new ArrayList<>(Arrays.asList("+7(962) 456-78-90", "+7(900) 456-78-90", "+7(904) 456-78-90", "+7(908) 456-78-90", "+7(999) 456-78-90", "+7(937) 456-78-90")));
        db.put("Петр Петин", new ArrayList<>(Arrays.asList("+7(913) 123-47-18")));
        db.put("Иван Ежов", new ArrayList<>(Arrays.asList("+7(908) 148-50-00")));
        return db;
    }
}
