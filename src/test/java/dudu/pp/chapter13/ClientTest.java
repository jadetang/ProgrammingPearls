package dudu.pp.chapter13;

import dudu.pp.Utils;
import org.testng.annotations.Test;

public class ClientTest {

    private int size = 1000000;
    private int maxElement = 9000000;

    @Test
    public void testBenchMark() throws Exception {
        help("IntSetImpWithTreeSet");
        help("IntSetImpWithArray");
        help("InSetImpWithLinkedList");
    }

    @Test void singleTest() throws Exception{

        /*help("IntSetImpWithTreeSet");
        help("InSetImplWithBinaryTree");
        help( "IntSetImplWithBitSet");*/
    }


    private void help(String implName){
        help(size,maxElement,implName);
    }

    private void help(int size, int maxElement, String implName) {
        Client c = new Client(size,maxElement,implName);
        c.benchMark();
    }


    @Test
    public void testBobFloyd() throws Exception{
        Utils.prints(Client.bobFloyd(10,100));
    }


}