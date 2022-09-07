package case_study.utils.write_file;


import case_study.model.sub_class.employee_manager.Customer;

import java.io.IOException;
import java.util.List;

public class WriteFileCustomer {
    public static void writeCustomerFile(String path, List<Customer> customers) throws IOException {
        String data = "";
        for (Customer customer : customers) {
            data += customer.toString() + "\n";
        }
        WriteFileList.writeFile(path, data);
    }
}
