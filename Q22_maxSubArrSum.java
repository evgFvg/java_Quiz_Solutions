public  class Main {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(getMaxSubArrSum(arr));
    }

    public static int getMaxSubArrSum(int[] arr) {
        int currSum = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length; ++i) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}