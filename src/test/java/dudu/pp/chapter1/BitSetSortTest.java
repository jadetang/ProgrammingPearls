package dudu.pp.chapter1;

import com.google.common.base.Stopwatch;
import dudu.pp.Utils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by jadetang on 15-1-14.
 */
public class BitSetSortTest {

    int[] array;

    @BeforeTest
    public void setUp() throws Exception {
        array = RandomInts.randomIntegers(15000000, 200000000);
        Utils.shuffle(array);
    }

    @Test
    public void testBitSetSort() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        int[] sorted = BitSetSort.bitSetSort(array);
        System.out.println("bieset sort take " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

        stopwatch.reset();
        stopwatch.start();
        Arrays.sort(array);
        System.out.println("Arrays sort take " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

        Assert.assertTrue(Utils.isSorted(sorted));


    }

}
