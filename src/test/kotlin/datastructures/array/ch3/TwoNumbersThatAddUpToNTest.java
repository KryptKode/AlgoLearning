package datastructures.array.ch3;


import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;

public class TwoNumbersThatAddUpToNTest {

    @Test
    public void test1() {
        TwoNumbersThatAddUpToN upToN = new TwoNumbersThatAddUpToN();
        int[] arr = new int[]{1, 21, 3, 14, 5, 60, 7, 6};
        int n = 81;
        int[] result = upToN.findSumBruteForce(arr, n);
        assertThat(Arrays.equals(result, new int[]{21, 60}) || Arrays.equals(result, new int[]{60, 21}), CoreMatchers.is(true));
    }

    @Test
    public void test2() {
        TwoNumbersThatAddUpToN upToN = new TwoNumbersThatAddUpToN();
        int[] arr = new int[]{9, 4, 7, 2, 6};
        int n = 17;
        int[] result = upToN.findSumBruteForce(arr, n);
        assertThat(Arrays.equals(result, new int[]{9, 4, 7, 2, 6}) || Arrays.equals(result, new int[]{2, 4, 6, 7, 9}), CoreMatchers.is(true));
    }

    @Test
    public void test3() {
        TwoNumbersThatAddUpToN upToN = new TwoNumbersThatAddUpToN();
        int[] arr = new int[]{5, 11, 4, 6};
        int n = 10;
        int[] result = upToN.findSumBruteForce(arr, n);
        assertThat(Arrays.equals(result, new int[]{5, 5}) || Arrays.equals(result, new int[]{6, 4}) || Arrays.equals(result, new int[]{4, 6}), CoreMatchers.is(true));
    }


    @Test
    public void test1WithSort() {
        TwoNumbersThatAddUpToN upToN = new TwoNumbersThatAddUpToN();
        int[] arr = new int[]{1, 21, 3, 14, 5, 60, 7, 6};
        int n = 81;
        int[] result = upToN.findSumBySorting(arr, n);
        assertThat(Arrays.equals(result, new int[]{21, 60}) || Arrays.equals(result, new int[]{60, 21}), CoreMatchers.is(true));
    }

    @Test
    public void test2WithSort() {
        TwoNumbersThatAddUpToN upToN = new TwoNumbersThatAddUpToN();
        int[] arr = new int[]{9, 4, 7, 2, 6};
        int n = 17;
        int[] result = upToN.findSumBySorting(arr, n);
        assertThat(Arrays.equals(result, new int[]{9, 4, 7, 2, 6}) || Arrays.equals(result, new int[]{2, 4, 6, 7, 9}), CoreMatchers.is(true));
    }

    @Test
    public void test3WithSort() {
        TwoNumbersThatAddUpToN upToN = new TwoNumbersThatAddUpToN();
        int[] arr = new int[]{5, 11, 4, 6};
        int n = 10;
        int[] result = upToN.findSumBySorting(arr, n);
        assertThat(Arrays.equals(result, new int[]{5, 5}) || Arrays.equals(result, new int[]{6, 4}) || Arrays.equals(result, new int[]{4, 6}), CoreMatchers.is(true));
    }
}