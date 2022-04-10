package arraysandhashing;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class Duplicates {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(!set.contains(num)) {
                set.add(num);
            } else {
                return true;
            }

        }
        return false;
    }
}
