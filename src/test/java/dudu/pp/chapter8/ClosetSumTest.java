package dudu.pp.chapter8;

import dudu.pp.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jadetang on 15-1-20.
 */
public class ClosetSumTest {


    int[] array = new int[]{1,-3,7};
    int[] array2 = new int[]{1,-1,7};



    @Test
    public void test1() throws Exception{
        Assert.assertEquals(ClosetSum.ClosetZero(array),1);
        Assert.assertEquals(ClosetSum.ClosetZero(array2),0);
    }

    @Test
    public void test2() throws Exception{
        int[] randomArray = Utils.randomInts(10,20,false);
        Utils.prints(randomArray);
        System.out.println(ClosetSum.ClosetZero(randomArray));
    }

}
