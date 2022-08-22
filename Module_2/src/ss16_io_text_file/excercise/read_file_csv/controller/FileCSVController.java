package ss16_io_text_file.excercise.read_file_csv.controller;

import ss16_io_text_file.excercise.read_file_csv.model.ReadFileCSV;

import java.io.IOException;
import java.util.List;

public class FileCSVController {   public static void main(String[] args) throws IOException {
    List<String> list = ReadFileCSV.readFile("src\\ss16_text_file\\bai_tap\\bai_2\\data\\text.txt");
    for (String line : list) {
        System.out.println(line);
    }
}

}
