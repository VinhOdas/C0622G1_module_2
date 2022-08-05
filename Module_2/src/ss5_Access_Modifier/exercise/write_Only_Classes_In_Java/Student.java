package ss5_Access_Modifier.exercise.write_Only_Classes_In_Java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
