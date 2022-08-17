package homeWork.home_work_1.view;

import homeWork.home_work_1.controller.PersonController;

public class MainView {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.menu();
    }
}
