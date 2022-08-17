package ss13_search_algorithm.find_string_length_max;

import java.util.Scanner;

public class FindStringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string to search");
        String string = scanner.nextLine();

        System.out.println(searchString(string));
    }

    public static String searchString(String str) {
        String strings = "";
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            strings += str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > str.charAt(i)) {
                    strings += str.charAt(j);
                    i = j;
                }
            }
            result = strings.length() > result.length() ? strings : result;
            strings = "";
        }
        return result;
    }
        }

