package case_study.utils.write_file;
import case_study.model.sub_class.service_manage.House;

import java.io.IOException;
import java.util.List;

public class WriteFileHouse {
    public static void writeHouseFile(String path, List<House> houses) throws IOException {
        String data = "";
        for (House house : houses) {
            data += house.toString() + "\n";
        }
        WriteFileList.writeFile(path, data);
    }
}
