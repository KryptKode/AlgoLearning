package datastructures.array.ch7;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SecondMaxValueTest {

    @Test
    public void test1() {
        int[] inputs = new int[]{9, 2, 3, 6};
        SecondMaxValue sut = new SecondMaxValue();
        int result = sut.findSecondMaximum(inputs);
        assertThat(result, CoreMatchers.is(6));
    }

    @Test
    public void test2() {
        int[] inputs = new int[]{4, 2, 1, 5, 0};
        SecondMaxValue sut = new SecondMaxValue();
        int result = sut.findSecondMaximum(inputs);
        assertThat(result, CoreMatchers.is(4));
    }
}