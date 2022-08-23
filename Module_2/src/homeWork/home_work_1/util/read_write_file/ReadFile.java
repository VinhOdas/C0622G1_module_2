package homeWork.home_work_1.util.read_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> stringList(String path){
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> strings = new ArrayList<>();
        String line;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
