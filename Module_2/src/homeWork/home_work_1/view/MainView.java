package homeWork.home_work_1.view;

import homeWork.home_work_1.controller.StudentController;

public class MainView {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.menu();
    }
}
