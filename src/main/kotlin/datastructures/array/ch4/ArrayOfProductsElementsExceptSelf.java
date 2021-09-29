package datastructures.array.ch4;

/**
 * <p>
 * In this problem, you have to implement the  {@code  int[] findProduct(int[] arr) } method which will modify
 * arr in such a way that in the output, each index i will contain the product of all elements present
 * in arr except the element stored on that index i.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int[] findProduct(int[] arr)
 *  </pre>
 *
 * </dd>
 * <br/>
 * <dt><strong>Input</strong></dt>
 * <dd>An array of integers. This array can be of any (valid) size and elements can be repeated.</dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>AAn array with products stored at each position.</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *   arr = {1,2,3,4}
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *    arr = {24,12,8,6}
 * </pre>
 * </dd>
 * </dl>
 */
public class ArrayOfProductsElementsExceptSelf {
    // 0(n)
    public int[] findProduct(int[] arr) {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int[] result = new int[n];

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        // Initializing temp to 1 for product on right side
        temp = 1;

        // Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }

    // O(n^2)
    public int[] findProductBruteForce(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i= " + i);
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                System.out.println("j= " + j);
                if (i != j) {
                    product = product * arr[j];
                    System.out.println("Product: " + product);
                    System.out.println("num: " + arr[j]);
                }
            }
            result[i] = product;
        }
        return result;
    }
}
