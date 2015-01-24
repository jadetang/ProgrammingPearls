package dudu.pp.chapter11;

import dudu.pp.Utils;

/**
 * Created by jadetang on 15-1-24.
 */
public class Sort {


    public static void insertSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                Utils.exechange(array, j - 1, j);
            }
        }
    }

    public static void insertSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int t = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] > t; j--) {
                array[j] = array[j - 1];
            }
            array[j] = t;
        }
    }


    public static void quickSort1(int[] array) {
        Utils.shuffle(array);
        quickSort1(array, 0, array.length - 1);

    }

    public static void quickSort2(int[] array) {
        Utils.shuffle(array);
        quickSort2(array, 0, array.length - 1);

    }


    private static void quickSort1(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int m = partition(array, low, high);
        quickSort1(array, low, m - 1);
        quickSort1(array, m + 1, high);
    }


    private static void quickSort2(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int m = partition2(array, low, high);
        quickSort2(array, low, m - 1);
        quickSort2(array, m + 1, high);
    }


    /**
     * partition an array,
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high + 1;
        while (true) {
            while (array[++i] < pivot) {
                if (i == high) {
                    break;
                }
            }
            while (array[--j] > pivot) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            Utils.exechange(array, i, j);
        }
        Utils.exechange(array, low, j);
        return j;
    }

    private static int partition2(int[] array, int low, int high) {
        int index = low;
        int p = array[low];
        for (int j = low + 1; j <= high; j++) {
            if (array[j] < p) {
                Utils.exechange(array, ++index, j);
            }
        }
        Utils.exechange(array, low, index);
        return index;
    }


}
