package dudu.pp.chapter2;

import dudu.pp.Utils;

/**
 * rotate a array without using extra space
 * @author tangsicheng
 * @version 1.0
 * @since 1.0
 */
public class RotateVector {


    //TODO make it correct
    /*public static void rotateLeft(Object[] source, int offset) {
        offset = offset % source.length;
        for (int i = 0; i < offset; i++) {
            move(source, i, offset);
        }
    }

    private static void move(Object[] array, int index, int offset) {
        Object temp = array[index];
        while (index + offset < array.length) {
            array[index] = array[index + offset];
            index += offset;
        }
        array[index] = temp;
    }*/

    public static void rotateLeft2(int[] array, int offset){
        Utils.reverse(array, 0, offset - 1);
        Utils.reverse(array, offset, array.length - 1);
        Utils.reverse(array, 0, array.length - 1);
    }

    public static void rotateLeft3(Object[] array,int offset){
        int n = array.length;
        int gcd = Utils.gcd(n,offset);
        for (int i = 0; i < gcd; i++) {
            Object temp = array[i];
            int index = i;
            while(true){
                int k = index + gcd;
                if (k >= n)  k -= n;
                if (k == i) break;
                array[index] = array[k];
                index = k;
            }
            array[index] = temp;
        }
    }




}
