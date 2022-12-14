package ss12_java_collection_framework.exercise.count_number_words_in_a_string_map.controller;

import java.util.*;

public class StringTreeMapController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String string = sc.nextLine();
        string = string.toUpperCase(Locale.ROOT).replaceAll("\\s", " ");
        Map<Character, Integer> stringMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < string.length(); i++) {
            if (stringMap.containsKey(string.charAt(i))) {
                Integer value = stringMap.get(string.charAt(i));
                value++;
                stringMap.replace(string.charAt(i), value);
            } else {
                stringMap.put(string.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

