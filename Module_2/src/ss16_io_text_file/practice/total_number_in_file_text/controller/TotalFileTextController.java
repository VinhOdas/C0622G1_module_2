package ss16_io_text_file.practice.total_number_in_file_text.controller;

import ss16_io_text_file.practice.total_number_in_file_text.model.ReadFileExample;

import java.util.Scanner;

public class TotalFileTextController {
    public static void main(String[] args) {
        System.out.println("Nhập vào đường dẫn file:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
