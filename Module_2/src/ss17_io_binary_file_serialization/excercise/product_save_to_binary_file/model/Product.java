package ss17_io_binary_file_serialization.excercise.product_save_to_binary_file.model;

//import ss17_io_binary_file_serialization.practice.binary_file_student_list.service.Serializable;

import java.io.Serializable;

public class Product implements Serializable    {
    private String idProduct;
    private String nameProduct;
    private String producer;
    private double price;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String producer, double price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }


}
