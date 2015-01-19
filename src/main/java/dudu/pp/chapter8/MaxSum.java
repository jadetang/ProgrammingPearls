package dudu.pp.chapter8;

/**
 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 if the integers of array are all negative,the max sum = 0.
 * Created by jadetang on 15-1-19.
 */
public class MaxSum {


    public static int maxSumN3(int[] A){
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int sum = 0;
                for (int k = i; k <=j ; k++) {
                    sum += A[k];
                }
                result = Math.max(sum,result);
            }
        }
        return result;
    }

    public static int maxSumN2(int[] A){
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                result = Math.max(sum,result);
            }
        }
        return result;
    }

    public static int maxSumDivAndConquer(int[] A){
        return max(A,0,A.length-1);
    }

    private static int max(int[] A,int low,int high) {
        if(low>high){
            return 0;
        }
        if(low == high ){
            return Math.max(0,A[low]);
        }
        int m = (low+high)/2;
        int leftSum = 0;
        int tempSum = 0;
        for (int i = m; i >=low ; i--) {
            tempSum +=A[i];
            leftSum = Math.max(tempSum,leftSum);
        }
        tempSum = 0;
        int rightSum = 0;
        for (int i = m+1; i <=high ; i++) {
            tempSum +=A[i];
            rightSum = Math.max(tempSum,rightSum);
        }
        return Math.max(Math.max(leftSum+rightSum,max(A,low,m)),max(A,m+1,high));
    }


    public static int maxSumN(int[] A){
        int maxSofar = 0;
        int maxPending = 0;
        for (int i = 0; i < A.length; i++) {
            maxPending = Math.max(maxPending+A[i],0);
            maxSofar = Math.max(maxPending,maxSofar);
        }
        return maxSofar;
    }



}
