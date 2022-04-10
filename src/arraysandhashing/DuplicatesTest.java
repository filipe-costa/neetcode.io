package arraysandhashing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {
    private static Duplicates duplicates;

    @BeforeAll
    static void init() {
        duplicates = new Duplicates();
    }

    @Test
    public void should_return_true() {
        int[] arr = new int[]{1,2,3,1};
        assertTrue(duplicates.containsDuplicate(arr));
    }

    @Test
    public void should_return_false() {
        int[] arr = new int[]{1,2,3,4};
        assertFalse(duplicates.containsDuplicate(arr));
    }
}