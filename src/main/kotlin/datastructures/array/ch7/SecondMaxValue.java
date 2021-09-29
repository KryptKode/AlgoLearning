package datastructures.array.ch7;

/**
 * <p>
 * In this problem, you have to implement the {@code int findSecondMaximum(int[] arr) } method,
 * which will traverse the whole array and return the second largest element present in the array.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int findSecondMaximum(int[] arr)
 *  </pre>
 *
 * </dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>Second largest element present in the array.</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *  arr = {9,2,3,6}
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *    6
 * </pre>
 * </dd>
 * </dl>
 */
public class SecondMaxValue {

    public int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }

        for (int item : arr) {
            if(item < max && item > secondMax){
                secondMax = item;
            }
        }

        return secondMax;
    }
}
