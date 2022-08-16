package ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.service.imbl;

import ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.model.Product;
import ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.service.IProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    private static final Scanner sc = new Scanner(System.in);
    private static List<Product> product = new ArrayList<>();
    static {
      product.add(new Product(1,"vinh",10000,"vinhodas"+"\n"));
      product.add(new Product(2,"vinh2",10000,"vinhodas"+"\n"));
      product.add(new Product(3,"vinh3",10000,"vinhodas"));

    }

    @Override
    public void addProduct() {
        Product products = this.infoProduct();
        product.add(products);
        System.out.println("ok chưa");
    }

    public Product infoProduct() {
        System.out.println("Nhập id vào");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào tên sản phẩm");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập giá tiền sản phẩm");
        double moneyProduct = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào nhà sản xuất");
        String producer = sc.nextLine();
        return new Product(id, nameProduct, moneyProduct, producer);

    }
    @Override
    public void editProduct() {
        Product productEdit = this.findIdProduct();
        if (productEdit == null){
            System.out.println("Không có");
        }else {
            System.out.println("bạn muốn edit gì:" +
                    "\n 1. Mã sản phẩm" +
                    "\n 2. Tên sản phẩm" +
                    "\n 3. Giá tiền" +
                    "\n 4. Nhà sản xuất");
            int choseEdit = Integer.parseInt(sc.nextLine());
            switch (choseEdit){
                case 1:
                    int idEdit = Integer.parseInt(sc.nextLine());
                    productEdit.setId(idEdit);
                    System.out.println("ok");
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

    @Override
    public void dispayProduct() {
        System.out.println("danh sách sản phẩm là\n" + product.toString());
    }

    public Product findIdProduct() {
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getId() == id) {
            return product.get(i);

            }
        }
        return null;
    }
    @Override
    public void removeProduct() {
        Product products1 = this.findIdProduct();
        if (products1 == null){
            System.out.println("không có");
        }
        else {
            System.out.println("chắc chắn chưa" +
                    "\n 1. có" +
                    "\n 2. không");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    product.remove(products1);
                    break;
                case 2:
                    System.out.println("sai");
                    break;
            }
        }
    }
    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        String nameProduct = sc.nextLine();
        for (int i = 0; i <product.size() ; i++) {
            if (product.get(i).getNameProduct().equals(nameProduct)){
                System.out.println("thông tin sản phẩm đang tìm là:" + product.get(i).toString());
            }else {
                System.out.println("mày ngu thì chết mẹ mày đi");
            }
        }
    }

}
