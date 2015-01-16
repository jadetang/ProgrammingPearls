/*
package dudu.pp.chapter2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

*/
/**
 * @author tangsicheng
 * @version 1.0
 * @since 1.0
 *//*

public class MissingInteger {


    */
/**
     * return a integer not in the array
     *
     * @param array
     * @return
     *//*

    public static Integer missingInteger(Integer[] array) {
        List<Integer> list = new LinkedList<>(Arrays.asList(array));
        return missingInteger(list, 0x40000000);
    }

    private static Integer missingInteger(List<Integer> array, int mask) {
        if (array.size() == 0) {
            return mask;
        }
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        for(Integer i:array){
            if( (i&mask) == 0 ){
                left.add(i);
            }else {
                right.add(i);
            }
        }
        if(left.size()<right.size()){
            return missingInteger(left,((mask>>1)|mask));
        }else {
            return missingInteger(right,((mask>>1)|mask));
        }
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,0b1100000000000000000000000000000,0b1110000000000000000000000000000};
        System.out.println(Integer.toBinaryString(missingInteger(array)));
    }
}
*/
