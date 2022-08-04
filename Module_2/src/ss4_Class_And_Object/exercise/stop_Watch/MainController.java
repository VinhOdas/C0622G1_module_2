package ss4_Class_And_Object.exercise.stop_Watch;

import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start());
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * array.length);

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(stopWatch.stop());
        System.out.println("thời gian đếm số");
        System.out.println(stopWatch.getElapsedTime() + ": mili giây");

    }
}
