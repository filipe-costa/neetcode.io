package twopointers;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;

        while(p1 < p2) {
            int value = numbers[p1] + numbers[p2];
            if(value == target) break;

            if(value > target) {
                p2--;
            } else {
                p1++;
            }
        }

        return new int[]{p1 + 1, p2 + 1};
    }
}
