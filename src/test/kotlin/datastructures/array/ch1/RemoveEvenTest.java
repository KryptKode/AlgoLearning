package datastructures.array.ch1;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveEvenTest {
    int[][] inputs = new int[][]{{1, 2, 4, 5, 10, 6, 3}, {32, 37, 10, 40, 11, 5}, {7, 4, 9, 0, 2}};
    int[][] expected = new int[][]{{1, 5, 3}, {37, 11, 5}, {7, 9}};

    @Test
    public void testRemoveEven(){
        for (int i = 0; i < inputs.length; i++) {
            RemoveEven removeEven = new RemoveEven();
            int [] result = removeEven.removeEven(inputs[i]);
            assertThat(result, CoreMatchers.is(expected[i]));
        }
    }
}