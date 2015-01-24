package dudu.pp.chapter1;

import dudu.pp.Utils;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author tangsicheng
 * @version 1.0
 * @since 1.0
 */
public class BitSetSort {
    /**
     * sort a array using bit set,the element of array should
     * be unique
     * @param array
     * @return
     */
    public static int[] bitSetSort(int[] array) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < array.length; i++) {
            bitSet.set(array[i],true);
        }
        int[] result = new int[array.length];
        for (int i = 0,index = 0; i < bitSet.length(); i++) {
            if(bitSet.get(i)){
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int size = 1000;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Utils.shuffle(array);

        System.out.println("before sort");
        System.out.println(Arrays.asList(array));
        System.out.println(Arrays.asList(bitSetSort(array)));
    }


}
