package ss16_io_text_file.excercise.read_file_csv.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static List<String> readFile(String path) throws IOException {
        List<String> list = new ArrayList<String>();
        File file = new File(path);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("File đã tồn tại");
            }
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
