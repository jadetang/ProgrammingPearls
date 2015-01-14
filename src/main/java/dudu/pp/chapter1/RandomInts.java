package dudu.pp.chapter1;

import java.util.Arrays;
import java.util.Random;

import static com.google.common.base.Preconditions.checkArgument;


/**
 * Created by jadetang on 15-1-14.
 */
public class RandomInts {

    /**
     * generate k integers less than n without duplicate
     * @return
     */

    public static Integer[] randomIntegers(int k, int n) {
        checkArgument(k <= n);
        Integer[] ints = new Integer[k];
        int select = k;
        int remain = n;
        Random  r= new Random();
        for (int i = 0, index = 0; i < n; i++, remain--) {
            if (Math.abs(r.nextInt()) % remain < select) {
                ints[index] = i;
                index++;
                select--;
            }
        }
        return ints;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.asList(randomIntegers(2, 5)));
    }


}
