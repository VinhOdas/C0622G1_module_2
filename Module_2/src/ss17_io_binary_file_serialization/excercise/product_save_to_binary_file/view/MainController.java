package ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.view;

import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.controller.ProductController;

import java.io.IOException;

public class MainController {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProductController productController = new ProductController();
        productController.menu();
    }
}
