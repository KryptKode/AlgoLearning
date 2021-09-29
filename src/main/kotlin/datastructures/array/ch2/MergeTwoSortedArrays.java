package datastructures.array.ch2;

/**
 * n this problem, you have to implement the {@code  int [] removeEven(int[] arr) } method,
 * which removes all the even elements from the array and returns back updated array.
 * In this problem, given two sorted arrays, you have to implement the
 * {@code int[] mergeArrays(int[] arr1, int[] arr2)}
 * method, which returns an array consisting of all elements of both arrays in a sorted way.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int[] mergeArrays(int[] arr1, int[] arr2)
 *  </pre>
 *  Here arr1 and arr2 are sorted already.
 * </dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>Merged array consisting of all elements of both arrays in a sorted way.</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *     arr1 = {1, 3, 4, 5}
 *     arr2 = {2, 6, 7, 8}
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *    arr = {1, 2, 3, 4, 5, 6, 7, 8}
 * </pre>
 * </dd>
 * </dl>
 */
public class MergeTwoSortedArrays {

    //O(n+m)
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
