package dudu.pp.chapter11;

import com.google.common.base.Stopwatch;
import dudu.pp.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by jadetang on 15-1-24.
 */
public class SortTest {
    @Test
    public void testInsertSort1() throws Exception {
        int[] unSort = Utils.randomInts(10, 10, true);
        Sort.insertSort1(unSort);
        Utils.prints(unSort);
        Assert.assertTrue(Utils.isSorted(unSort));
    }

    @Test
    public void testInsertSort2() throws Exception {
        int[] unSort = Utils.randomInts(10, 10, true);
        Sort.insertSort2(unSort);
        Utils.prints(unSort);
        Assert.assertTrue(Utils.isSorted(unSort));
    }

    @Test
    public void performance() throws Exception {
        int[] unsort = Utils.randomInts(100000, 1500000, false);
        int[] unsort2 = Arrays.copyOf(unsort, unsort.length);
        Stopwatch stopwatch = Stopwatch.createStarted();
        Sort.insertSort1(unsort);
        System.out.println("insert sort 1 take:" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "mm");
        stopwatch.reset().start();
        Sort.insertSort2(unsort2);
        System.out.println("insert sort 2 take:" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "mm");
        Assert.assertTrue(Utils.isSorted(unsort));
        Assert.assertTrue(Utils.isSorted(unsort2));
    }

    @Test
    public void quickSortPerformance() throws Exception{
        int[] unsort = Utils.randomInts(10000000, 15000000, false);
        int[] unsort2 = Arrays.copyOf(unsort, unsort.length);
        int[] unsort3 = Arrays.copyOf(unsort, unsort.length);
        int[] unsort4 = Arrays.copyOf(unsort, unsort.length);
        sort("qsort1",unsort);
        sort("qsort2",unsort2);
        sort("system",unsort3);
        sort("qsortWithCutOff",unsort4);
    }


    private void sort(String name,int[] unsort){
        Stopwatch stopwatch = Stopwatch.createStarted();
        switch (name){
            case "qsort1":
                Sort.quickSort1(unsort);
                break;
            case "qsort2":
                Sort.quickSort2(unsort);
                break;
            case "system":
                Arrays.sort(unsort);
                break;
            case "qsortWithCutOff":
                Sort.quickSortWithCutOff(unsort);
                break;
            default: throw new UnsupportedOperationException();
        }
        System.out.println(name+ " take:" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "mm");
        Assert.assertTrue(Utils.isSorted(unsort));
    }


    @Test
    public void testQuickSort() throws Exception {
        for (int i = 0; i < 10000; i++) {
            int[] unsort = Utils.randomInts(200, 20000);
            Sort.quickSort1(unsort);
            Assert.assertTrue(Utils.isSorted(unsort));

        }
    }



}
