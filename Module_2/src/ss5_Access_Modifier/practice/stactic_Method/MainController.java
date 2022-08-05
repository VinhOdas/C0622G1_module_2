package ss5_Access_Modifier.practice.stactic_Method;

public class MainController {
    public static void main(String[] args) {
        Student.change();
        Student student = new Student(1711, "hercules");
        Student student2 = new Student(2202, "zeus");
        Student student3 = new Student(7677, "athena");
        student.diplay();
        student2.diplay();
        student3.diplay();
    }

}
