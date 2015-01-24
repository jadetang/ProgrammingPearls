package dudu.pp;

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

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + uniform(N - i);     // between i and N-1
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static int uniform(int N) {
        if (N <= 0) throw new IllegalArgumentException("Parameter N must be positive");
        return random.nextInt(N);
    }

    public static void exechange(int[] array, int l, int r) {
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
    }

    public static void reverse(int[] array, int from, int to) {
        for (int i = 0; i <= (to - from) / 2; i++) {
            exechange(array, from + i, to - i);
        }
    }


    public static Integer gcd(Integer a, Integer b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static Integer binarySearch(Comparable[] array, Comparable t) {
        int l = 0;
        int h = array.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            int cmp = t.compareTo(array[m]);
            if (cmp > 0) {
                l = m + 1;
            } else if (cmp < 0) {
                h = m - 1;
            } else return m;
        }
        return -1;
    }




    public static int[] randomInts(int n,int k){
        return randomInts(n,k,true);
    }
    public static int[] randomInts(int n,int k,boolean allPositive){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = random.nextInt(k);
            if(!allPositive){
                temp = random.nextBoolean()? temp:-temp;
            }
            result[i] = temp;
        }
        return result;
    }

    public static void prints(int[] array){
        prints(array,0,array.length-1);
    }


    public static void prints(int[] array,int from,int to){
        System.out.print("[ ");
        for (int i = from; i < to; i++) {
            System.out.print(" " + array[i] + ",");
        }
        System.out.println(" " + array[to] + "]");
    }






    public static boolean isSorted(int[] array) {
        for (int i = 1 ; i < array.length ; i++) {
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
}
