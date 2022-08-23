//package homeWork.home_work_1.util.read_write_file;
//
//import homeWork.home_work_1.model.Student;
//import homeWork.home_work_1.model.Teacher;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//public class WriteFileUtil {
//    private static void writeFile(String path, String data)  {
//        File file = new File(path);
//        BufferedWriter bufferedWriter = null;
//        try {
//            bufferedWriter = new BufferedWriter(new FileWriter(file));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            bufferedWriter.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//
//
//    public static void writeStudentFile(String path, List<Student> students) throws IOException {
//        String data = "";
//        for (Student student : students) {
//            data += student.toString();
//            data += "\n";
//        }
//
//        writeFile(path, data);
//    }
//
//    public static void writeTeacherFile(String path, List<Teacher> teachers) throws IOException {
//        String data = "";
//        for (Teacher teacher : teachers) {
//            data += teacher.toString();
//            data += "\n";
//        }
//
//        writeFile(path, data);
//    }
//}
