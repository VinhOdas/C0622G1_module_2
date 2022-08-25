package ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.service.impl;

import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.model.Product;
import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.service.IProductService;
import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.utils.ReadFileBinary;
import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.utils.WriteFileBinary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();
    private static final String path_File = "src\\ss17_io_binary_file_serialization\\excercise\\product_save_to_binary_file\\data\\vinh.txt";
    @Override
    public void addProduct() {
        products.add(infoProduct());
        System.out.println("thêm thành công");
        WriteFileBinary.writeFileBinary(path_File,products);
//        List<Product> product ;
//        product = (List<Product>) ReadFileBinary.readFileBinary(path_File);
//
    }

    public Product infoProduct(){
        String idProduct;
        String nameProduct;
        String producer;
        double price;
        System.out.println("Mời bạn nhập vào mã sản phẩm");
        idProduct = scanner.nextLine();
        System.out.println("Mời bạn nhập vào tên sản phẩm");
        nameProduct = scanner.nextLine();
        System.out.println("Mời bạn nhập vào hãng sản phẩm");
        producer= scanner.nextLine();
        System.out.println("Mời bạn nhập vào giá sản phẩm");
        price = Double.parseDouble(scanner.nextLine());
//        String idProduct, String nameProduct, String producer, double price
        return new Product(idProduct,nameProduct,producer,price);
    }
}
