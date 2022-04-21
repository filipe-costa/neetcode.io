package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void should_return_index_3() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        assertEquals(3, BinarySearch.search(arr, 4));
    }

    @Test
    public void should_return_minus_1() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.search(arr, 6));
    }
}