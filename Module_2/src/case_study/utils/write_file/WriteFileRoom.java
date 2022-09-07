package case_study.utils.write_file;


import case_study.model.sub_class.service_manage.Room;

import java.io.IOException;
import java.util.List;

public class WriteFileRoom {
    public static void writeRoomFile(String path, List<Room> rooms) throws IOException {
        String data = "";
        for (Room room : rooms) {
            data += room.toString() + "\n";
        }
        WriteFileList.writeFile(path, data);
    }
}
