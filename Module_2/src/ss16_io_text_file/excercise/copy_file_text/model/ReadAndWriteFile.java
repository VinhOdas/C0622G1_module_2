package ss16_io_text_file.excercise.copy_file_text.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("không tồn tại");
        }
        return strings;

    }
    public void writeFile(List<String> stringFile ,String filePath){
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i <stringFile.size() ; i++) {
                bufferedWriter.write(stringFile.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
