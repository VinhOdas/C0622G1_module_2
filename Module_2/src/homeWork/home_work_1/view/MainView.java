package homeWork.home_work_1.view;

import homeWork.home_work_1.controller.PersonController;

import java.io.IOException;

public class MainView {
    public static void main(String[] args) throws IOException {
        PersonController personController = new PersonController();
        personController.menu();
    }
}
