package dudu.pp.chapter13;

import java.util.BitSet;

/**
 * Created by jadetang on 15-1-31.
 */
public class IntSetImplWithBitSet extends IntSet{

    private BitSet innerSet;

    public IntSetImplWithBitSet(int size, int max) {
        super(size, max);
        innerSet = new BitSet(max);
    }

    @Override
    public void insert(int t) {
        innerSet.set(t);
    }

    @Override
    public int size() {
        return innerSet.cardinality();
    }

    @Override
    public int[] report() {
        int[] result = new int[size()];
        int index = 0;
        for (int i = 0; i < innerSet.length(); i++) {
            if(innerSet.get(i)){
                result[index++] = i;
            }
        }
        return result;
    }

    @Override
    public boolean find(int x) {
        return innerSet.get(x);
    }
}
