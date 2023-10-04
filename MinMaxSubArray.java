  public static int maxSubArray(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; ++i) {
            currSum += arr[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static int minSubArray(int[] arr){
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; ++i) {
            currSum += arr[i];
            minSum = Math.min(minSum, currSum);
            currSum = Math.min(currSum, 0);
        }
        return minSum;
    }
