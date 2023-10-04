/*Given a non-empty array nums contains positive integers and a positive integer target.
Find the first subarray in nums that sums up to target and return the begin and end index of
this subarray. If there is no such subarray, return [-1, -1].

Example 1:

Input: nums = [4, 3, 5, 7, 8], target = 12
Output: [0, 2]
Explanation: 4 + 3 + 5 = 12. Although 5 + 7 = 12, [4, 3, 5] is the first subarray that sums up to 12.
Example 2:

Input: nums = [1, 2, 3, 4], target = 15
Output: [-1, -1]
Explanation: Thers is no such subarray that sums up to 15.*/

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] res = s.printSubArrayIndexesWithSum(new int[]{1, 4, 20, 3, 10, 5}, 15);
        for (int r : res) {
            System.out.println(r);
        }
    }

    public int[] printSubArrayIndexesWithSum(int[] nums, int target) {
        int sum = 0;
        for (int end = 0, start = 0; end < nums.length; ++end) {
            sum += nums[end];
            while (sum >= target) {
                if (target == sum) {
                    return new int[]{start, end};
                }
                sum -= nums[start];
                ++start;
            }
        }
        return new int[]{-1, -1};
    }
}