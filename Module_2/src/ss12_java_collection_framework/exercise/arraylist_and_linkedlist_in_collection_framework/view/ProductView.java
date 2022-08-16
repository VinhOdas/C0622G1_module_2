package ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.view;

import ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.controller.ProductController;
import ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.model.Product;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.menuProduct();
    }
}
