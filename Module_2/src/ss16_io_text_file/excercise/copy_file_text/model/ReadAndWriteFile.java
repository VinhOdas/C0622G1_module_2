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
    public void writeFile(String filePath,List<String> string){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String data = "";
            for (String strings: string) {
                data += strings.toString();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
