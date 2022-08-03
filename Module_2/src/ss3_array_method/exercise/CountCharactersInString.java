package ss3_array_method.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {
        String str = "aaaavbb asds aj hka";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự cần tìm");
        char characters = sc.nextLine().charAt(0);
        int dem = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==characters){
                dem ++;
            }
        }
        System.out.println(dem);
    }
}
