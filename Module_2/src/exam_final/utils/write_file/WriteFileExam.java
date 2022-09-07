package exam_final.utils.write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExam {
      public static void writeFile(String path, String string) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        try {
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(string);
            bufferWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
