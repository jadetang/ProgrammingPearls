package dudu.pp;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jadetang on 15-1-18.
 */
public class UtilsTest {

    private Integer[] sorted = new Integer[ ]{1,2,3,4,5,6,7,8,9};


    @Test
    public void testBinarySearch() throws Exception {
        Assert.assertEquals(Utils.binarySearch(sorted, 2), new Integer(1));
    }
}
