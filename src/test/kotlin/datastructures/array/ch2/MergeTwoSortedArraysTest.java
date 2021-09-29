package datastructures.array.ch2;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MergeTwoSortedArraysTest {

    @Test
    public void test1() {
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 6, 7, 8};
        int[] result = mergeTwoSortedArrays.mergeArrays(arr1, arr2);
        assertThat(result, CoreMatchers.is(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void test2() {
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int[] arr1 = new int[]{1, 3, 3, 4, 4, 5};
        int[] arr2 = new int[]{3, 5, 6, 7, 8};
        int[] result = mergeTwoSortedArrays.mergeArrays(arr1, arr2);
        assertThat(result, CoreMatchers.is(new int[]{1, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8}));
    }
}