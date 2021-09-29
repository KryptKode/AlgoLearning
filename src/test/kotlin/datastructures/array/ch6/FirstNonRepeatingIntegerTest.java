package datastructures.array.ch6;

import datastructures.array.ch5.MinimumValueInArray;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNonRepeatingIntegerTest {

    @Test
    public void test1() {
        int[] inputs = new int[]{4, 4, 4, 3};
        FirstNonRepeatingInteger sut = new FirstNonRepeatingInteger();
        int result = sut.findFirstUnique(inputs);
        assertThat(result, CoreMatchers.is(3));
    }

    @Test
    public void test2() {
        int[] inputs = new int[]{4, 5, 1, 2, 0, 4};
        FirstNonRepeatingInteger sut = new FirstNonRepeatingInteger();
        int result = sut.findFirstUnique(inputs);
        assertThat(result, CoreMatchers.is(5));
    }
}