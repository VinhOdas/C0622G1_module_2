package case_study.utils.write_file;
import case_study.model.sub_class.service_manage.Villa;

import java.io.IOException;
import java.util.List;

public class WriteFileVilla {
    public static void writeVillaFile(String path, List<Villa> villas) throws IOException {
        String data = "";
        for (Villa villa : villas) {
            data += villa.toString() + "\n";
        }
        WriteFileList.writeFile(path, data);
    }
}
