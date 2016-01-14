package dudu.pp.chapter13;

/**
 * Created by jadetang on 15-1-31.
 */
public abstract class IntSet {
    public IntSet(int size, int max) {
    }

    public abstract void insert(int t);

    public abstract int size();

    public abstract int[] report();

    public abstract boolean find(int x);

}
