package homeWork.home_work_1.service;

import java.io.IOException;

public interface IStudentService {


    void addStudent() throws IOException;

    void dispayListStudent();

    void removeStudent();

    void updateStudent();

    void displayStudentOptional();

    void searchIdStudent();

    void searchNameStudent();

}
