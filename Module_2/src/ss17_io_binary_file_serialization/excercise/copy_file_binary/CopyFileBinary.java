package ss17_io_binary_file_serialization.excercise.copy_file_binary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập file input");
        String sourcePath = scan.nextLine();
        System.out.println("Nhập vào file output: ");
        String destPath = scan.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile, destFile);
            if (sourceFile.length() == 0) {
                throw new FileNotFoundException();
            } else {
                System.out.println("Copy thành công");
                countByte(sourceFile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy");
        } catch (IOException e) {
            System.out.print("không copy đc");
        }

        copyFileUsingStream(sourceFile, destFile);
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void countByte(File sourceFile) throws IOException {
        FileInputStream fileInput = new FileInputStream(sourceFile);
        long size = fileInput.getChannel().size();
        System.out.println("Kích thước tệp là: " + size + " bytes");
    }
}
