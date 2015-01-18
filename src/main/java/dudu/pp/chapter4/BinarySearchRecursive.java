package dudu.pp.chapter4;

/**
 * Created by jadetang on 15-1-18.
 */
public class BinarySearchRecursive {


    public static Integer binarySearchRecursive(Comparable[] array, Comparable t) {
        return search(array, 0, array.length - 1, t);
    }

    private static Integer search(Comparable[] array, int low, int high, Comparable t) {
        if (high < low) return -1;
        int m = (low + high) / 2;
        int cmp = t.compareTo(array[m]);
        if (cmp > 0) {
            return search(array, low + 1, high, t);
        } else if (cmp < 0) {
            return search(array, low, high - 1, t);
        } else {
            return m;
        }
    }
}