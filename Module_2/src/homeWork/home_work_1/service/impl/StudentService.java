package homeWork.home_work_1.service.impl;

import homeWork.home_work_1.models.Student;
import homeWork.home_work_1.service.IStudentService;
import homeWork.home_work_1.utils.read_write_file.ReadFile;
import homeWork.home_work_1.utils.read_write_file.WriteFile;
import homeWork.home_work_1.service.InfoException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Student> students = new ArrayList<>();
    private static final String path_Son_Mat_lon_File = "src\\homeWork\\home_work_1\\data\\studens.txt";

    static {
        students.add(new Student(1, "Pham Quang Vinh", "17/11/1999", "Nam", 10,"C0622G1"));
        students.add(new Student(2, "Pham Quang Vinh1", "17/11/1999", "Nam", 10,"C0622G1"));
        students.add(new Student(3, "Pham Quang Vinh2", "17/11/1999", "Nam", 10,"C0622G1"));


    }


    @Override
    public void addStudent() throws IOException {
        students = ReadFile.readStudentList((path_Son_Mat_lon_File));
//        students = ReadFileUtil.readStudentFile(pathFile);
        Student student = this.infoStudent();
        students.add(student);
        System.out.println("OK");
        WriteFile.writeFile(path_Son_Mat_lon_File, convertStudentToString(students));

    }
    private String convertString(Student student){
        return student.getId()+","+student.getName()+","+student.getBirthDay()+","+student.getPointStudent()+","+student.getClassStudent();
    }

    private List<String> convertStudentToString(List<Student> students) {
        List<String> stringList = new ArrayList<>();
        for (Student student: students) {
            stringList.add(convertString(student));
        }
        return stringList;
    }

    @Override
    public void dispayListStudent() {
        for (Student student: students){
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        students = ReadFile.readStudentList(path_Son_Mat_lon_File);
    Student student = this.findStudent();
    if (student == null){
        System.out.println("không tìm thấy đối tượng cần xóa");
    }else {
        System.out.println("bạn có muốn xóa đối tượng là " +student.getId()+"không >");
    }
     WriteFile.writeFile(path_Son_Mat_lon_File,convertStudentToString(students));
    }
    public Student findStudent(){
        System.out.println("Mời bạn nhập vào id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getId() == id){
                return students.get(i);
            }
        }

        return null ;
    }

    @Override
    public void displayStudentOptional() {
        System.out.println("Nhập lựa chọn của bạn");
        int choise = Integer.parseInt(sc.nextLine());

    }
    public void displayScoreStudent(){
        System.out.println("Nhập điểm muốn sắp xếp");
        int scoreStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getId() > scoreStudent){
                System.out.println(students.toString());
            }
        }
    }

    @Override
    public void updateStudent() {
        Student studentUpdate = this.findStudent();
        if (studentUpdate == null) {
            System.out.println("Không có");
        } else {
            System.out.println("Chọn 1 nếu bạn muốn thay đổi" +
                    "\n 1. Mã học viên" +
                    "\n    Tên học viên" +
                    "\n  ngày tháng năm sinh" +
                    "\n  giới tính" +
                    "\n  điểm" +
                    "\n lớp ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("bạn muốn thay đổi id thành: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    studentUpdate.setId(idUpdate);
                    System.out.println("bạn muốn thay đổi tên thành: ");
                    String nameUpdate = sc.nextLine();
                    System.out.println("bạn muốn thay đổi ngày sinh thành: ");
                    String birthDayUpdate = sc.nextLine();
                    System.out.println("bạn muốn thay đổi giới tính thành: ");
                    boolean genderUpdate = Boolean.parseBoolean(sc.nextLine());
                    System.out.println("bạn muốn thay đổi lớp thành: ");
                    String classStudent = sc.nextLine();
                    System.out.println("bạn muốn thay đổi điểm thành: ");
                    int scoreStudent = Integer.parseInt(sc.nextLine());
                    System.out.println("bạn đã thay đổi thành công");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }
        }
    }

    @Override
    public void searchIdStudent() {
        Student student = this.findStudent();
        System.out.println("sản phẩm muốn tìm là" + student.toString());
    }

    @Override
    public void searchNameStudent() {
        System.out.println("nhập vào tên muốn tìm");
        String nameTeacherSearch = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(nameTeacherSearch)) {
                System.out.println("danh sách học viên bạn đang tìm là: " + students.get(i).toString());
            }

        }
    }

    public Student infoStudent() {
        int id;
        do {
            System.out.println("Nhập vào id");
            try {
                id = Integer.parseInt(sc.nextLine());
                if (id < 0) {
                    throw new InfoException("Mời bạn nhập lại");
                }
                for (Student student : students) {
                    if (student.getId() == id) {
                        throw new InfoException("Id của bạn bị trùng ");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("id này phải là số");
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String name;
        do {
            System.out.println("Nhập tên của sinh viên");
            try {
                System.out.print("Mời bạn nhập tên: ");
                name = (sc.nextLine());
                String str;
                for (int i = 0; i < name.length(); i++) {
                    str = "";
                    if ((str + name.charAt(i)).matches("\\d+")) {
                        throw new InfoException("Tên bạn nhập ko hợp lệ");
                    }
                }

                break;
            } catch (InfoException e) {
                System.out.println(e);
            }
        } while (true);

        String dayOfBirth;
        do {
            try {
                System.out.print("Mời bạn nhập ngày sinh: ");
                dayOfBirth = sc.nextLine();
                if (!dayOfBirth.matches("\\d+\\d+\\W+\\d+\\d+\\W+\\d+\\d+\\d+\\d")) {
                    throw new InfoException("Dữ liệu không đúng định dạng");
                }
                if (Integer.parseInt(dayOfBirth.substring(6)) > 2016) {
                    throw new InfoException("Dữ liệu không đúng định dạng");
                }
                break;
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String gender;
        do {
            System.out.println("Nhập giới tính của sinh viên");
            try {
                gender = sc.nextLine();
                if (!gender.equals("Nam") && !gender.equals("Nữ")) {
                    throw new InfoException("Cho phép nhập giới tính là nam hoặc nữ, không nhập ngoại lệ");
                }
                break;
            } catch (InfoException e) {
                System.out.println("Cho phép nhập giới tính là nam hoặc nữ, không nhập ngoại lệ");
                ;
            }
        } while (true);

        String nameClass;
        while (true) {
            try {
                System.out.print("Nhập tên lớp: ");
                nameClass = sc.nextLine();
                if (!nameClass.matches("\\D+\\d+\\d+\\d+\\d+\\D+\\d")) {
                    throw new InfoException("Tên lớp không hợp lệ");
                }
                break;
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        }

        double score;
        do {
            System.out.println("Nhập điểm");
            try {
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 100) {
                    throw new InfoException("Id phải> 0 & <100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là một số");
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        return new Student(id, name, dayOfBirth, gender,  score,nameClass);
    }

    }

