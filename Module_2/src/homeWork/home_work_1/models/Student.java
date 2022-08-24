package homeWork.home_work_1.models;

public class Student extends Person {
private double pointStudent;
    private String classStudent;

    public Student() {
    }

    public Student(double pointStudent, String classStudent) {
        this.pointStudent = pointStudent;
        this.classStudent = classStudent;
    }

    public Student(int id, String name, String birthDay, String gender, double pointStudent, String classStudent) {
        super(id, name, birthDay, gender);
        this.pointStudent = pointStudent;
        this.classStudent = classStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public double getPointStudent() {
        return pointStudent;
    }

    public void setPointStudent(double pointStudent) {
        this.pointStudent = pointStudent;
    }

    public Student(String classStudent, double pointStudent) {
        this.classStudent = classStudent;
        this.pointStudent = pointStudent;
    }



    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "pointStudent=" + pointStudent +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
