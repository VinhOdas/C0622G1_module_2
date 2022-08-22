package ss16_io_text_file.practice.find_max_value_and_write_file.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        } catch (Exception e) {
            System.out.println("không tồn tại");
        }
        return numbers;

    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(writer)));
            bufferedWriter.write("giá trị lớn nhất là: " +max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

