package case_study.utils.write_file;

import case_study.model.sub_class.employee_manager.Employee;


import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {
    public static void writeEmployeeFile(String path, List<Employee> employees) throws IOException {
        String data = "";
        for (Employee employee : employees) {
            data += employee.toString() + "\n";
        }
        WriteFileList.writeFile(path, data);
    }
}
