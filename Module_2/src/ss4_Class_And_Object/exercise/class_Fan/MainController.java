package ss4_Class_And_Object.exercise.class_Fan;

public class MainController {
    public static void main(String[] args) {
        ClassFan classFan1 = new ClassFan(2, true,10, "red");

        ClassFan classFan2 = new ClassFan(3, false,10, "black");

        System.out.println(classFan1);
        System.out.println(classFan2);
    }

}
//    ClassFan classFan1 = new ClassFan;
//        classFan1.setSpeed(3);
//        classFan1.setRadius(10);
//        classFan1.setColor("yello");
//        classFan1.setOn(true);
//        ClassFan classFan2 = new ClassFan();
//ClassFan classFan2 = new ClassFan;
//        classFan2.setSpeed(2);
//        classFan2.setRadius(5);
//        classFan2.setColor("blue");
//        classFan2.setOn(false);