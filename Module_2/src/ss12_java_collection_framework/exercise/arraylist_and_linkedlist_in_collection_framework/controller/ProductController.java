package ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.controller;

import ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.service.IProduct;
import ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.service.imbl.ProductService;

import java.util.Scanner;

public class ProductController {
  private static final Scanner sc = new Scanner(System.in);
  private static IProduct product = new ProductService();
  public void menuProduct(){
      while (true){
          System.out.println("chọn đi,ko chọn đấm chết cha mày h" +
                  "\n 1. Thêm mới sản phẩm" +
                  "\n 2.Sửa sản phẩm " +
                  "\n 3.Xóa sản phẩm" +
                  "\n 4.Hiển thị sản phẩm" +
                  "\n 5.tìm kiếm sản phẩm" +
                  "\n 6.sắp xếp theo chiều tăng  theo giá" +
                  "\n 7.sắp xếp theo chiều giảm  theo giá");
          int choose = Integer.parseInt(sc.nextLine());
          switch (choose){
              case 1:
                  product.addProduct();
                  break;
              case 2:
                  product.editProduct();
                  break;
              case 3:
                  product.removeProduct();
                  break;
              case 4:
                  product.dispayProduct();
                  break;
              case 5:
                  product.searchProduct();
                  break;
              case 6:
                  break;
              case 7:
                  break;

          }
      }
  }
}
