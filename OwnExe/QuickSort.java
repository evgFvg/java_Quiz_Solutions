import java.util.HashSet;
import java.util.Set;


public class Solution {
    public static void main(String[] args) {
        int[] arr  = { 4,5,2,56,-3,7,0};
        Solution s = new Solution();
        s.qSort(arr);
        for(int y: arr){
            System.out.println(y);
        }
    }
    public void qSort(int[] arr){
        recSort(arr, 0, arr.length - 1);
    }

    private void recSort(int[] arr, int left, int right) {
        if(left < right){
            int pivotIndex = getPivot(arr, left, right);
            recSort(arr, left, pivotIndex - 1);
            recSort(arr, pivotIndex + 1, right);
        }
    }

    private int getPivot(int[] arr, int left, int right) {
        int pivot = arr[right];
        int j = left;
        for(int i = left; i <= right; ++i){
            if(arr[i] < pivot){
                swap(arr, i, j);
                ++j;
            }
        }
        swap(arr, right, j);
        return j;
    }

    private void swap(int[] arr, int lhs, int rhs) {
        int temp = arr[lhs];
        arr[lhs] = arr[rhs];
        arr[rhs] = temp;
    }
}