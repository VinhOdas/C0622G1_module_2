package case_study.utils.write_file;

import case_study.model.sub_class.employee_manager.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class WriteFileList {

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
