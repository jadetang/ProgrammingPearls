package dudu.pp.chapter13;

import java.util.Arrays;

/**
 * Created by jadetang on 15-1-31.
 */
public class IntSetImpWithArray extends IntSet {

    private int[] array;
    private int size;

    public IntSetImpWithArray(int size, int max) {
        super(size, max);
        array = new int[size + 1];
        array[0] = max;
        this.size = 0;
    }

    @Override
    public void insert(int t) {
        int i = 0;
        for (; array[i] < t; i++) {
        }
        if (array[i] == t) {
            return;
        }
        int j = size;
        for (; j >= i; j--) {
            array[j + 1] = array[j];
        }
        array[i] = t;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] report() {
        return Arrays.copyOf(array, array.length - 1);
    }
}
