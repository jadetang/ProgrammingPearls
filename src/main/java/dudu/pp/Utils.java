package dudu.pp;

import java.util.Arrays;
import java.util.Random;

/**
 * @author tangsicheng
 * @version 1.0
 * @since 1.0
 */
public class Utils {

    private static Random random;    // pseudo-random number generator
    private static long seed;        // pseudo-random number generator seed

    // static initializer
    static {
        // this is how the seed was set in Java 1.4
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    public static void shuffle(Object[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + uniform(N-i);     // between i and N-1
            Object temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
    public static int uniform(int N) {
        if (N <= 0) throw new IllegalArgumentException("Parameter N must be positive");
        return random.nextInt(N);
    }

    public static void exechange(Object[] array, int l, int r){
        Object temp  = array[l];
        array[l] = array[r];
        array[r] = temp ;
    }

    public static void reverse(Object[] array,int from,int to){
        for (int i = 0; i  <= (to - from ) / 2; i++) {
            exechange(array,from+i,to-i);
        }
    }


    public static void main(String[] args) {
        Integer[] a = new Integer[]{5, 4, 3, 2, 1, 6, 7, 8, 9, 10, 11, 12};
        reverse(a,5,a.length-1);
        System.out.println(Arrays.asList(a));
    }


}
