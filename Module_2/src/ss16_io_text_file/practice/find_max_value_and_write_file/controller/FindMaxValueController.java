package ss16_io_text_file.practice.find_max_value_and_write_file.controller;

import ss16_io_text_file.practice.find_max_value_and_write_file.model.ReadAndWriteFile;

import java.util.List;

public class FindMaxValueController {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt",maxValue);
    }

}
