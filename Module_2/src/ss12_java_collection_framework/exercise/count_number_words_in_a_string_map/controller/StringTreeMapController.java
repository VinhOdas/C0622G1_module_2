package ss12_java_collection_framework.exercise.count_number_words_in_a_string_map.controller;

import java.util.*;

public class StringTreeMapController {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi:");
            String string = sc.nextLine();
            string = string.toUpperCase(Locale.ROOT).replaceAll("\\s"," ");
            Map<Character,Integer> stringMap = new TreeMap<>(Collections.reverseOrder());

            for (int i = 0; i <string.length() ; i++) {

            }
        }
    }

