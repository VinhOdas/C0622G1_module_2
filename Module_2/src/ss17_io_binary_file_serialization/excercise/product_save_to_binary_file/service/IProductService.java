package ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException, ClassNotFoundException;
}
