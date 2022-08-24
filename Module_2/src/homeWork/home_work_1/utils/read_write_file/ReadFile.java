package homeWork.home_work_1.utils.read_write_file;

import homeWork.home_work_1.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> stringList(String path){
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> strings = new ArrayList<>();
        String line;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
    public static List<Student> readStudentList (String path){
        List<String> strings = stringList(path);
        List<Student> students = new ArrayList<>();
        String[] info;
        for (String line: strings) {
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]),info[1],info[2],info[3],Double.parseDouble(info[4]),info[5]));
        }
        return students;
    }

}
