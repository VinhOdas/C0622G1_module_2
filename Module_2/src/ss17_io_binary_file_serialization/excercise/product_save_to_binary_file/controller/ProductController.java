package ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.controller;
import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.service.IProductService;
import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.service.impl.ProductService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProductController {
     Scanner scanner = new Scanner(System.in);
    public static final IProductService  productService = new ProductService();
    public  void menu() throws IOException, ClassNotFoundException {
    while (true){
        try {
            System.out.println("--_--");
            System.out.println("Quản lý sản phẩm");
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Thêm sản phẩm" +
                    "\n 2. Hiển thị sản phẩm" +
                    "\n 3. Tìm kiếm thông tin sản phẩm" +
                    "\n 4. Exit");

        }catch (NumberFormatException e){
        }
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise){
            case 1:
                productService.addProduct();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    }
}
