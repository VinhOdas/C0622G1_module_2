package homeWork.home_work_1.utils.read_write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
public static void writeFile(String path,  List<String> strings){
    FileWriter writerFile ;
    BufferedWriter bufferedWriter;
    try {
        writerFile = new FileWriter(path);
        bufferedWriter = new BufferedWriter(writerFile);
        for (int i = 0; i <strings.size() ; i++) {
            bufferedWriter.write(strings.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
