package dudu.pp.chapter8;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jadetang on 15-1-19.
 */
public class MaxSumTest {

    int[] array = new int[]{31,-41,59,26,-53,58,97,-93,-23,84};
    int[] negative = new int[]{-31,-41,-59,-26,-53,-58,-97,-93,-23,-84};




    @Test
    public void testMaxSunN3() throws Exception {
        Assert.assertEquals(MaxSum.maxSumN3(array),187);
        Assert.assertEquals(MaxSum.maxSumN3(negative),0);
    }
    @Test
    public void testMaxSunN2() throws Exception {
        Assert.assertEquals(MaxSum.maxSumN2(array),187);
        Assert.assertEquals(MaxSum.maxSumN2(negative), 0);
    }


    @Test
    public void testMaxSunDVN() throws Exception {
        Assert.assertEquals(MaxSum.maxSumDivAndConquer(array),187);
        Assert.assertEquals(MaxSum.maxSumDivAndConquer(negative),0);
    }
    @Test
    public void testMaxSunN() throws Exception {
    //    Assert.assertEquals(MaxSum.maxSumN(array),187);
     //   Assert.assertEquals(MaxSum.maxSumN(negative),0);
        

        Assert.assertEquals(MaxSum.maxSumN(new int[]{-2,1}),1);




    }
}
