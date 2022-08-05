package ss5_Access_Modifier.exercise.write_Only_Classes_In_Java;

public class MainController {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Vinh");
        System.out.println("Tên học sinh: " + student1.getName());
        student1.setClasses("C03");
        System.out.println("Tên lớp là: " + student1.getClasses());
    }
}
