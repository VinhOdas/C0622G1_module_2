package ss5_Access_Modifier.practice.stactic_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Vinhodas";

    public Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "Odassama";
    }
    void diplay(){
        System.out.println(rollno + " " + name + " " + college);
    }

}
