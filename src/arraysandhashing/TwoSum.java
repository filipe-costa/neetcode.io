package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    // O(n^2) solution
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                if(num1 + num2 == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    // O(n) solution
    public int[] twoSumII(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                result[0] = map.get(target - numbers[i]);
                result[1] = i;

                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
