import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        int x = 10 + ran.nextInt(49 - 1 + 1);
        int[] lottozahlen = new int[6];
        System.out.println(Arrays.toString(lottozahlen));

        for (int i = 0; i < 6; i++) {

            x = 1 + ran.nextInt(50 - 1 + 1);
            lottozahlen[i] = x;
            System.out.println((i + 1) + ". Ziehung : " + x);

        }


    }
}


