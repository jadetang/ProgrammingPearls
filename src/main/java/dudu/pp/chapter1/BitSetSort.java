package dudu.pp.chapter1;

import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import dudu.pp.Utils;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;

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
    public static int[] bitSetSort(Integer[] array) {
        checkUnique(array);

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

    private static void checkUnique(Integer[] array) {
        Set s = Sets.newHashSet(Arrays.asList(array));
        checkArgument(s.size() == array.length, "element in array are not unique");
    }

    public static void main(String[] args) {
        int size = 1000;
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Utils.shuffle(array);

        System.out.println("before sort");
        System.out.println(Arrays.asList(array));
        System.out.println(Ints.asList(bitSetSort(array)));
    }


}
