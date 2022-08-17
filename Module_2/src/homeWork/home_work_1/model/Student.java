package homeWork.home_work_1.model;

public class Student extends Person {
private String classStudent;
private double pointStudent;

    public Student() {
    }

    public Student(String classStudent, double pointStudent) {
        this.classStudent = classStudent;
        this.pointStudent = pointStudent;
    }

    public Student(int id, String name, String birthDay, String gender, String classStudent, double pointStudent) {
        super(id, name, birthDay, gender);
        this.classStudent = classStudent;
        this.pointStudent = pointStudent;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "classStudent='" + classStudent + '\'' +
                ", pointStudent=" + pointStudent +
                '}';
    }
}
