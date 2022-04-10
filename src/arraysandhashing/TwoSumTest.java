package arraysandhashing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private static TwoSum twoSum;

    @BeforeAll
    static void init() {
        twoSum = new TwoSum();
    }

    @Test
    public void should_return_correct_correct_output_when_target_is_9() {
        int[] expected = new int[]{0, 1};
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        assertArrayEquals(expected, twoSum.twoSumII(arr, target));
    }

    @Test
    public void should_return_correct_output_when_target_is_6() {
        int[] expected = new int[]{1, 2};
        int[] arr = new int[]{3,2,4};
        int target = 6;
        assertArrayEquals(expected, twoSum.twoSumII(arr, target));
    }
}