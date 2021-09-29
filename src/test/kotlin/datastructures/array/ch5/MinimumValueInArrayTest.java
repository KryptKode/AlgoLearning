package datastructures.array.ch5;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumValueInArrayTest {

    @Test
    public void test1() {
        int[] inputs = new int[]{100, 12, 34, 40};
        MinimumValueInArray sut = new MinimumValueInArray();
        int result = sut.findMinimum(inputs);
        assertThat(result, CoreMatchers.is(12));
    }

    @Test
    public void test2() {
        int[] inputs = new int[]{4, 5, 0, 3, 6};
        MinimumValueInArray sut = new MinimumValueInArray();
        int result = sut.findMinimum(inputs);
        assertThat(result, CoreMatchers.is(0));
    }

}