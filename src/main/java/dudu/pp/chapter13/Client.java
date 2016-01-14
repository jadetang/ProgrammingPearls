package dudu.pp.chapter13;

import com.google.common.base.Stopwatch;
import dudu.pp.Utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.base.Stopwatch.createStarted;

/**
 * Created by jadetang on 15-1-31.
 */
public class Client {

    private IntSet intset;
    private Long setUpTime;
    private Long outPutTime;


    public Client(int size, int max, String implName) {
        checkArgument(size <= max);
        switch (implName) {
            case "IntSetImpWithTreeSet":
                intset = new IntSetImpWithTreeSet(size, max);
                break;
            case "IntSetImpWithArray":
                intset = new IntSetImpWithArray(size, max);
                break;
            case "InSetImpWithLinkedList":
                intset = new InSetImpWithLinkedList(size, max);
                break;
            case "InSetImplWithBinaryTree":
                intset = new InSetImplWithBinaryTree(size, max);
                break;
            case "IntSetImplWithBitSet":
                intset = new IntSetImplWithBitSet(size, max);
                break;
            default:
                throw new IllegalArgumentException();
        }
        Random r = new Random();
        Stopwatch stopwatch = createStarted();
        while (intset.size() < size) {
            intset.insert(r.nextInt(max + 1)%max);
        }
        setUpTime = stopwatch.elapsed(TimeUnit.MILLISECONDS);
    }


    public void benchMark() {
        Stopwatch stopwatch = createStarted();
        int[] result = intset.report();
        outPutTime = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        checkState(Utils.isSorted(result));
        checkState(Utils.distinct(result));
        log();
    }


    public static int[] bobFloyd(int size,int max){
        IntSet set = new InSetImplWithBinaryTree(size,max);
        for (int j = max-size; j < max; j++) {
            int t = Utils.bigRand() % (j+1);
            int oldsize = set.size();
            set.insert(t);
            if (set.size() == oldsize) // t already in S
                set.insert(j);
        }
        return set.report();
    }





    private void log() {
        System.out.printf("%s with %d element,take %d mm to setup and %d mm " +
                "to collect\n", intset.getClass().getSimpleName(), intset.size(), setUpTime, outPutTime);
    }
}
