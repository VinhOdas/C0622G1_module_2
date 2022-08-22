package ss16_io_text_file.excercise.copy_file_text.controller;

import ss16_io_text_file.excercise.copy_file_text.model.ReadAndWriteFile;

import java.util.List;

public class CopyTextFileController {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> strings = readAndWriteFile.readFile("src\\ss16_io_text_file\\copy_file_text\\data\\sourceFile.txt");
        readAndWriteFile.writeFile("src\\ss16_io_text_file\\copy_file_text\\data\\targetFile.txt",strings);
    }
}
