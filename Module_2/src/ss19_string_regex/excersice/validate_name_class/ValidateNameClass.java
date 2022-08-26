package ss19_string_regex.excersice.validate_name_class;

import java.util.Scanner;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp");
        String checkedNameClass = scanner.nextLine();
        System.out.println(checkedNameClass.matches("[CAP]\\d{4}[GHIKLM]"));

    }
}
