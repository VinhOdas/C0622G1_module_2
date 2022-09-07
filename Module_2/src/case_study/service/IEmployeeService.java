package case_study.service;

import java.io.IOException;

public interface IEmployeeService extends IService {
    void displayEmployee();

    void addEmployee() throws IOException;

    void editEmployee() throws IOException;
}
