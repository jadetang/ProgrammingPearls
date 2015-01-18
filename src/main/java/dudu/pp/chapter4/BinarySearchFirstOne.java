package dudu.pp.chapter4;

import dudu.pp.Utils;

import java.util.Arrays;

/**
 * using binary search the most left element in array
 * Created by jadetang on 15-1-18.
 */
public class BinarySearchFirstOne {

    public static Integer binarySearchFirstOne(Comparable[] array, Comparable t) {
        int index = Utils.binarySearch(array, t);
        if (index == -1) {
            return index;
        } else {
            Comparable[] sub = Arrays.copyOf(array, index);
            int subIndex = Utils.binarySearch(sub, t);
            return subIndex != -1 ? subIndex : index;
        }
    }


    public static Integer binarySearchFirstOne2(Comparable[] array, Comparable t) {
        int low = -1;
        int high = array.length;
        while (low + 1 != high) {
            int m = (low + high) / 2;
            int cmp = t.compareTo(array[m]);
            if (cmp > 0) {
                low = m;
            }else {
                high = m;
            }
        }
        int index = high;
        if ( index>=array.length || array[index] != t ){
            index = -1;
        }
        return index;
    }


}
