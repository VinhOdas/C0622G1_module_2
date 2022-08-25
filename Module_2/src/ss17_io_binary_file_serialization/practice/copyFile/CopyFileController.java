package ss17_io_binary_file_serialization.practice.copyFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileController {
    private static void copyFileUsingJava7Files(File fileInput, File fileOutput) throws IOException {
        Files.copy(fileInput.toPath(), fileOutput.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileStream(File fileInput, File fileOutput) throws IOException {
        InputStream ip = null;
        OutputStream out = null;
        try {
            ip = new FileInputStream(fileInput);
            out = new FileOutputStream(fileOutput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ip.close();
        out.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập fileInput");
        String pathInput = scanner.nextLine();
        System.out.println("Nhập fileOutput");
        String pathOutput = scanner.nextLine();

        File fileInput = new File(pathInput);
        File fileOutput = new File(pathOutput);
        try {
            copyFileUsingJava7Files(fileInput, fileOutput);
            System.out.println("ok");
        } catch (IOException e) {
            System.out.println("lỗi");
            System.out.println(e.getMessage());

        }

    }
}

