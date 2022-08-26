package ss19_string_regex.excersice.validate_name_class;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào sđt");
        String checkedNameClass = scanner.nextLine();
        System.out.println(checkedNameClass.matches("[(][8][4][)][-][(][0][1-9][0-9]{8}[)]"));
    }
}
