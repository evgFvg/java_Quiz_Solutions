import java.util.HashMap;

public class SubArraySumCounter {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 2, -3, 5, -8};
        int[] arr2 = {-5, 2, 3, -3};
        int res = getSubArraySumNumber(arr, 5);
        System.out.println(res);
//        res = SubArraySumCounter.getSubArraySumNumber(arr2, -3);
//        System.out.println(res);
    }

    public static int getSubArraySumNumber(int[] arr, int k) {
        int res = 0;
        int diff = 0;
        int sum = 0;
        int prevCount = 0;
        HashMap<Integer, Integer> sumKeeper = new HashMap<>();
        sumKeeper.put(0, 1);

        for (int i : arr) {
            sum += i;
            diff = sum - k;
            res += sumKeeper.getOrDefault(diff, 0);
            prevCount = sumKeeper.getOrDefault(sum, 0);
            sumKeeper.put(sum, prevCount + 1);
        }

        /*int res = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i; j < arr.length; ++j) {
                sum += arr[j];
                res += (k == sum ? 1 : 0);
            }
            sum = 0;
        }*/
        return res;
    }
}