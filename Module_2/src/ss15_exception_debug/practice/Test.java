package ss15_exception_debug.practice;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        File file = new File("src\\ss15_exception_debug\\practice\\name");
        try {
            try {
                FileReader fileReader = new FileReader(file);
                System.out.println(fileReader);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } finally {

        }
    }
}
