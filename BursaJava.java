class BursaProblem {
    public static void main(String[] args) {
        int[] arr = {6,12,3,5,1,4,9,2};
        int[] res = solveBursa(arr);
        for(int i: res) {
            System.out.println(i);
        }
    }
    public static int[] solveBursa(int[] arr){
        int[] indexes = new int[3];
        int profit = Integer.MIN_VALUE;
        int curSum = 0;
        int offset = 0;
        for(int i = 0; i < arr.length - 1; ++i) {
            curSum += (arr[i + 1] - arr[i]);
            offset++;

            if(curSum < 0) {
                curSum = 0;
                offset = 0;
            }
            if(curSum > profit){
                profit = curSum;
                indexes[0] = i - offset  + 1;
                indexes[1] = i + 1;
            }
        }
        indexes[2] = profit;

        return indexes;
    }
}
