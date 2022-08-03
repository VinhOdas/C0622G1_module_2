package ss3_array_method.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị phần tử trong mảng");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int i ;
        int min = arr[0];
        for ( i = 1; i <arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}



