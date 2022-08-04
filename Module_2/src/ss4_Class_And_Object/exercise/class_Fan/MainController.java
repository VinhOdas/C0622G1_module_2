package ss4_Class_And_Object.exercise.class_Fan;

public class MainController {
    public static void main(String[] args) {
        final int slow = 1;
        final int medium = 2;
        final int hard = 3;
        ClassFan classFan1 = new ClassFan();
        classFan1.setSpeed(3);
        classFan1.setRadius(10);
        classFan1.setColor("yello");
        classFan1.setOn(true);
        ClassFan classFan2 = new ClassFan();
        classFan1.setSpeed(2);
        classFan1.setRadius(5);
        classFan1.setColor("blue");
        classFan1.setOn(false);
        System.out.println(classFan1.toString());
        System.out.println(classFan2.toString());
    }

}
