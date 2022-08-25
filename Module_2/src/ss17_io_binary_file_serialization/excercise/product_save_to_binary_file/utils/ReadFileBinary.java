package ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.utils;

import ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.model.Product;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFileBinary {
    public static List<Product> readFileBinary(String path) throws IOException, ClassNotFoundException {
        List<Product> products ;
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        products = (List<Product>) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        return products;
    }
}
