package dudu.pp.chapter4;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jadetang on 15-1-18.
 */
public class BinarySearchRecursiveTest {



    private Integer[] sorted = new Integer[ ]{1,2,3,4,5,6,7,8,9};


    @Test
    public void testBinarySearch() throws Exception {
        Assert.assertEquals(BinarySearchRecursive.binarySearchRecursive(sorted, 2), new Integer(1));
    }
}
