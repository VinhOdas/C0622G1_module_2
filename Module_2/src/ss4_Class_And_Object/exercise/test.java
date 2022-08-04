package ss4_Class_And_Object.exercise;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Tên:" +student.name);
        System.out.println("Lớp:" +student.classStudent);
        System.out.println("Địa chỉ:" +student.address);
        System.out.println("tuổi:" +student.age);
        System.out.println("Điểm:" +student.score);
    }
    static class Student{
            String name,classStudent,address;
            int age;
            double score;

    }
}
