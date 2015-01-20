package dudu.pp.chapter8;

import java.util.Arrays;

/**
 * Created by jadetang on 15-1-20.
 */
public class ClosetSum {
    /**
     * find the sum of subarray closest to 0 in given array
     * @param array
     * @return
     */
    public static int ClosetZero(int[] array){
        int[] cumulative = cumulative(array);
        Arrays.sort(cumulative);
        int min = Integer.MAX_VALUE;
        for (int i = 1 ; i < cumulative.length; i++) {
            int tempSum = Math.abs(cumulative[i] - cumulative[i-1]);
            min = Math.min(tempSum,min);
        }
        return min;
    }

    private static int[] cumulative(int[] array) {
        int[] result = new int[array.length+1];
        result[0] = 0;
        for (int i = 0; i < array.length; i++) {
            result[i+1] = result[i]+array[i];
        }
        return result;
    }


}
