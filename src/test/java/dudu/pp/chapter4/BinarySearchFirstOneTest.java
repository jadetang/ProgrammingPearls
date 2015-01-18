package dudu.pp.chapter4;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jadetang on 15-1-18.
 */
public class BinarySearchFirstOneTest {

    private Integer[] sorted = new Integer[ ]{1,2,3,4,5,6,7,8,9};
    private Integer[] duplicated = new Integer[ ]{1,2,2,3,3,4,5,6,7};
    private Integer[] empty = new Integer[]{};
    private BinarySearchFirstOne s = new BinarySearchFirstOne();



    @Test
    public void testBinarySearchFirstOne() throws Exception {
        Assert.assertEquals(s.binarySearchFirstOne(sorted, 2), new Integer(1));
        Assert.assertEquals(s.binarySearchFirstOne2(sorted, 2), new Integer(1));
        Assert.assertEquals(s.binarySearchFirstOne(empty, 2), new Integer(-1));
        Assert.assertEquals(s.binarySearchFirstOne2(empty, 2), new Integer(-1));
        Assert.assertEquals(s.binarySearchFirstOne(duplicated, 3), new Integer(3));
        Assert.assertEquals(s.binarySearchFirstOne2(duplicated, 3), new Integer(3));

    }
}
