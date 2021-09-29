package datastructures.array.ch4;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfProductsElementsExceptSelfTest {

    @Test
    public void test1BruteForce() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{1, 2, 3, 4};
        int[] result = sut.findProductBruteForce(input);
        assertThat(result, CoreMatchers.is(new int[]{24, 12, 8, 6}));
    }

    @Test
    public void test2BruteForce() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{2, 5, 9, 3, 6};
        int[] result = sut.findProductBruteForce(input);
        assertThat(result, CoreMatchers.is(new int[]{810, 324, 180, 540, 270}));
    }

    @Test
    public void test3BruteForce() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{0, 1, 2};
        int[] result = sut.findProductBruteForce(input);
        assertThat(result, CoreMatchers.is(new int[]{2, 0, 0}));
    }

    @Test
    public void test4BruteForce() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{11, 2, 5, 7, 2};
        int[] result = sut.findProductBruteForce(input);
        assertThat(result, CoreMatchers.is(new int[]{140, 770, 308, 220, 770}));
    }

    @Test
    public void test1() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{1, 2, 3, 4};
        int[] result = sut.findProduct(input);
        assertThat(result, CoreMatchers.is(new int[]{24, 12, 8, 6}));
    }

    @Test
    public void test2() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{2, 5, 9, 3, 6};
        int[] result = sut.findProduct(input);
        assertThat(result, CoreMatchers.is(new int[]{810, 324, 180, 540, 270}));
    }

    @Test
    public void test3() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{0, 1, 2};
        int[] result = sut.findProduct(input);
        assertThat(result, CoreMatchers.is(new int[]{2, 0, 0}));
    }

    @Test
    public void test4() {
        ArrayOfProductsElementsExceptSelf sut = new ArrayOfProductsElementsExceptSelf();
        int[] input = new int[]{11, 2, 5, 7, 2};
        int[] result = sut.findProduct(input);
        assertThat(result, CoreMatchers.is(new int[]{140, 770, 308, 220, 770}));
    }
}