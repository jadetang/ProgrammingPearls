package dudu.pp.chapter2;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by jadetang on 15-1-18.
 */
public class RotateVectorTest {

    private Integer[] array;
    private Integer[] expected;

    @BeforeTest
    public void setUp() throws Exception {
        array = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        expected = new Integer[]{6,7,8,9,10,1,2,3,4,5};
    }

    @Test
    public void testOne() throws Exception {
        RotateVector.rotateLeft3(array,5);
        System.out.println(Arrays.asList(array));
        Assert.assertEquals(array,expected);
    }
}
