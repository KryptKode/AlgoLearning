package datastructures.array.ch6;

/**
 * <p>
 * In this problem, you have to implement the {@code int findFirstUnique(int[] arr) } method
 * that will look for a first unique integer,
 * which appears only once in the whole array. The function returns -1 if no unique number is found.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int findFirstUnique(int[] arr)
 *  </pre>
 *
 * </dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>The first unique element in the array.</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *  arr = {9, 2, 3, 2, 6, 6}
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *    9
 * </pre>
 * </dd>
 * </dl>
 */
public class FirstNonRepeatingInteger {

    //O(n^2)
    public int findFirstUnique(int[] arr) {
        //Inside Inner Loop Check Each index of outerLoop If it's repeated in array
        //If it's not repeated then return this as first unique Integer
        boolean isRepeated = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            } //end of InnerLoop

            if (!isRepeated) {
                return arr[i];
            }
            else {
                isRepeated = false;
            }

        } //end of OuterLoop
        return - 1;
    }
}
