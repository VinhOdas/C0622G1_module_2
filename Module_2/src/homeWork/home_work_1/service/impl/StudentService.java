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
        System.out.println("kh??ng t??m th???y ?????i t?????ng c???n x??a");
    }else {
        System.out.println("b???n c?? mu???n x??a ?????i t?????ng l?? " +student.getId()+"kh??ng >");
    }
     WriteFile.writeFile(path_Son_Mat_lon_File,convertStudentToString(students));
    }
    public Student findStudent(){
        System.out.println("M???i b???n nh???p v??o id c???n x??a");
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
        students = ReadFile.readStudentList(path_Son_Mat_lon_File);
        System.out.println("Nh???p l???a ch???n c???a b???n");
        int choise = Integer.parseInt(sc.nextLine());

    }
    public void displayScoreStudent(){
        System.out.println("Nh???p ??i???m mu???n s???p x???p");
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
            System.out.println("Kh??ng c??");
        } else {
            System.out.println("Ch???n 1 n???u b???n mu???n thay ?????i" +
                    "\n 1. M?? h???c vi??n" +
                    "\n    T??n h???c vi??n" +
                    "\n  ng??y th??ng n??m sinh" +
                    "\n  gi???i t??nh" +
                    "\n  ??i???m" +
                    "\n l???p ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("b???n mu???n thay ?????i id th??nh: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    studentUpdate.setId(idUpdate);
                    System.out.println("b???n mu???n thay ?????i t??n th??nh: ");
                    String nameUpdate = sc.nextLine();
                    System.out.println("b???n mu???n thay ?????i ng??y sinh th??nh: ");
                    String birthDayUpdate = sc.nextLine();
                    System.out.println("b???n mu???n thay ?????i gi???i t??nh th??nh: ");
                    boolean genderUpdate = Boolean.parseBoolean(sc.nextLine());
                    System.out.println("b???n mu???n thay ?????i l???p th??nh: ");
                    String classStudent = sc.nextLine();
                    System.out.println("b???n mu???n thay ?????i ??i???m th??nh: ");
                    int scoreStudent = Integer.parseInt(sc.nextLine());
                    System.out.println("b???n ???? thay ?????i th??nh c??ng");
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
        System.out.println("s???n ph???m mu???n t??m l??" + student.toString());
    }

    @Override
    public void searchNameStudent() {
        System.out.println("nh???p v??o t??n mu???n t??m");
        String nameTeacherSearch = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(nameTeacherSearch)) {
                System.out.println("danh s??ch h???c vi??n b???n ??ang t??m l??: " + students.get(i).toString());
            }

        }
    }

    public Student infoStudent() {
        int id;
        do {
            System.out.println("Nh???p v??o id");
            try {
                id = Integer.parseInt(sc.nextLine());
                if (id < 0) {
                    throw new InfoException("M???i b???n nh???p l???i");
                }
                for (Student student : students) {
                    if (student.getId() == id) {
                        throw new InfoException("Id c???a b???n b??? tr??ng ");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("id n??y ph???i l?? s???");
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String name;
        do {
            System.out.println("Nh???p t??n c???a sinh vi??n");
            try {
                System.out.print("M???i b???n nh???p t??n: ");
                name = (sc.nextLine());
                String str;
                for (int i = 0; i < name.length(); i++) {
                    str = "";
                    if ((str + name.charAt(i)).matches("\\d+")) {
                        throw new InfoException("T??n b???n nh???p ko h???p l???");
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
                System.out.print("M???i b???n nh???p ng??y sinh: ");
                dayOfBirth = sc.nextLine();
                if (!dayOfBirth.matches("\\d+\\d+\\W+\\d+\\d+\\W+\\d+\\d+\\d+\\d")) {
                    throw new InfoException("D??? li???u kh??ng ????ng ?????nh d???ng");
                }
                if (Integer.parseInt(dayOfBirth.substring(6)) > 2016) {
                    throw new InfoException("D??? li???u kh??ng ????ng ?????nh d???ng");
                }
                break;
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String gender;
        do {
            System.out.println("Nh???p gi???i t??nh c???a sinh vi??n");
            try {
                gender = sc.nextLine();
                if (!gender.equals("Nam") && !gender.equals("N???")) {
                    throw new InfoException("Cho ph??p nh???p gi???i t??nh l?? nam ho???c n???, kh??ng nh???p ngo???i l???");
                }
                break;
            } catch (InfoException e) {
                System.out.println("Cho ph??p nh???p gi???i t??nh l?? nam ho???c n???, kh??ng nh???p ngo???i l???");
                ;
            }
        } while (true);

        String nameClass;
        while (true) {
            try {
                System.out.print("Nh???p t??n l???p: ");
                nameClass = sc.nextLine();
                if (!nameClass.matches("\\D+\\d+\\d+\\d+\\d+\\D+\\d")) {
                    throw new InfoException("T??n l???p kh??ng h???p l???");
                }
                break;
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        }

        double score;
        do {
            System.out.println("Nh???p ??i???m");
            try {
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 100) {
                    throw new InfoException("Id ph???i> 0 & <100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("??i???m ph???i l?? m???t s???");
            } catch (InfoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        return new Student(id, name, dayOfBirth, gender,  score,nameClass);
    }

    }

