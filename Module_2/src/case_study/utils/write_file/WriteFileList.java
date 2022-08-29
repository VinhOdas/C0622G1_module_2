package case_study.utils.write_file;

import homeWork.home_work_1.utils.read_write_file.WriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileList {

    public static void writeFile(String path,List<String> strings){
        FileWriter writeFile;
        BufferedWriter bufferedWriter;
        try {
            writeFile = new FileWriter(path);
            bufferedWriter = new BufferedWriter(writeFile);
            for (int i = 0; i <strings.size() ; i++) {
                bufferedWriter.write(strings.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
