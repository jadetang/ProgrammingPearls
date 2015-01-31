package dudu.pp.chapter13;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jadetang on 15-1-31.
 */
public class IntSetImpWithTreeSet extends IntSet {

    private Set innerSert;
    private int maxElement;

    public IntSetImpWithTreeSet(int size, int max) {
        super(size, max);
        innerSert = new TreeSet();
        maxElement = max;
    }

    @Override
    public void insert(int t) {
        innerSert.add(t);
    }

    @Override
    public int size() {
        return innerSert.size();
    }

    @Override
    public int[] report() {
        int[] result = new int[innerSert.size()];
        int index = 0;
        for (Object i : innerSert) {
            result[index++] = (int) i;
        }
        return result;
    }
}
