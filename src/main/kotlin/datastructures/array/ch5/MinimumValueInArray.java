package datastructures.array.ch5;

/**
 * <p>
 * In this problem, you have to implement the {@code int findMinimum(int[] arr) } method,
 * which will traverse the whole array and find the smallest number in the array.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int findMinimum(int[] arr)
 *  </pre>
 *
 * </dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>The smallest number in the array..</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *  arr = {9, 2, 3, 6}
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *    2
 * </pre>
 * </dd>
 * </dl>
 */
public class MinimumValueInArray {

    //O(n)
    public int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
