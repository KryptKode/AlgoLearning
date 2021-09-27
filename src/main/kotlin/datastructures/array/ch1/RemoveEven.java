package datastructures.array.ch1;

/**
 * n this problem, you have to implement the {@code  int [] removeEven(int[] arr) } method,
 * which removes all the even elements from the array and returns back updated array.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int[] removeEven(int[] arr);
 *  </pre>
 * </dd>
 * <dt><strong>Input</strong></dt>
 * <dd>An array with integers.</dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>An array with only odd integers.</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *      arr = {1, 2, 4, 5, 10, 6, 3}
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *      arr = {1, 5, 3}
 * </pre>
 * </dd>
 * </dl>
 */
public class RemoveEven {

    public int[] removeEven(int[] arr) {
        int oddNums = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddNums++;
            }
        }

        int [] result = new int[oddNums];
        int index = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }
}
