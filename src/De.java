import java.util.Random;


public class De {

    public static int lanceDe(int min, int max) {
        Random rd = new Random();
        int rnd = rd.nextInt(max - min + 1) + min;
        return rnd;
    }

}