package ss16_io_text_file.excercise.read_file_csv.controller;

import ss16_io_text_file.excercise.read_file_csv.util.ReadFileCSV;

import java.io.IOException;
import java.util.List;

public class FileCSVController {
    private static final String path_read_file = "src\\ss16_io_text_file\\excercise\\read_file_csv\\data\\text.txt";
    public static void main(String[] args) throws IOException {
    List<String> list = ReadFileCSV.readFile(path_read_file);
    for (String line : list) {
        System.out.println(line);
    }
}

}
