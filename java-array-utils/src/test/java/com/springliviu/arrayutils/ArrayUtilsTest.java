package com.springliviu.arrayutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void testSum() {
        assertEquals(6, ArrayUtils.sum(new int[]{1,2,3}));
    }

    @Test
    void testReverse() {
        assertArrayEquals(new int[]{3,2,1}, ArrayUtils.reverse(new int[]{1,2,3}));
    }

    @Test
    void testFindMinMax() {
        assertArrayEquals(new int[]{1,5}, ArrayUtils.findMinMax(new int[]{3,1,5,2}));
    }

    @Test
    void testRemoveDuplicates() {
        assertArrayEquals(new int[]{1,2,3}, ArrayUtils.removeDuplicates(new int[]{1,2,1,3,2}));
    }

    @Test
    void testLinearSearch() {
        assertEquals(2, ArrayUtils.linearSearch(new int[]{4,5,6}, 6));
        assertEquals(-1, ArrayUtils.linearSearch(new int[]{}, 1));
    }

    @Test
    void testBinarySearch() {
        int[] arr = {1,3,5,7};
        assertEquals(2, ArrayUtils.binarySearch(arr, 5));
        assertEquals(-1, ArrayUtils.binarySearch(arr, 4));
    }
}