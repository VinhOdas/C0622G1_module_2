package ss16_io_text_file.excercise.copy_file_text.controller;

import ss16_io_text_file.excercise.copy_file_text.utils.ReadAndWriteFile;

import java.util.List;

public class CopyTextFileController {
    private static final  String sourceFile = "src\\ss16_io_text_file\\copy_file_text\\data\\sourceFile.txt";
    private static final  String targetFile = "src\\ss16_io_text_file\\copy_file_text\\data\\targetFile.txt";
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> strings = readAndWriteFile.readFile(sourceFile);
        readAndWriteFile.writeFile(strings,targetFile);

    }
}
