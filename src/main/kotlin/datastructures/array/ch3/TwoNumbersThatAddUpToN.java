package datastructures.array.ch3;

/**
 * <p>
 * In this problem, you have to implement the {@code  int[] findSum(int[] arr, int n) }  method,
 * which will take a number n, and an array arr as input and returns an array of two integers that add up to n in an array.
 * You are required to return only one such pair. If no such pair is found then simply return the array.
 *
 * <dl>
 * <dt><strong>Method Prototype</strong></dt>
 * <dd>
 *   <pre>
 *  int[] findSum(int[] arr, int n)
 *  </pre>
 *
 * </dd>
 * <br/>
 * <dt><strong>Output</strong></dt>
 * <dd>An array with two integers a and b that add up to a given number or the original array in case a pair is not found.</dd>
 * <br/>
 * <br/>
 * <dt><strong>Sample Input</strong></dt>
 * <dd>
 *  <pre>
 *    arr = {1, 21, 3, 14, 5, 60, 7, 6}
 *    value = 27
 * </pre>
 * </dd>
 * <dt><strong>Sample Output</strong></dt>
 * <dd>
 *  <pre>
 *    arr = {21, 6} or {6, 21}
 * </pre>
 * </dd>
 * </dl>
 */
public class TwoNumbersThatAddUpToN {

    // O(n^2)
    public int[] findSumBruteForce(int[] arr, int n) {
        int[] result = new int[2];
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == n){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }
        return arr;
    }


    // O(nlogn)
    public int[] findSumBySorting(int[] arr, int n) {

        //Helper sort function that uses the Quicksort Algorithm
        sort(arr, 0, arr.length - 1);   //Sort the array in Ascending Order

        int Pointer1 = 0;    //Pointer 1 -> At Start
        int Pointer2 = arr.length - 1;   //Pointer 2 -> At End

        int[] result = new int[2];
        int sum = 0;

        while (Pointer1 != Pointer2) {

            sum = arr[Pointer1] + arr[Pointer2];  //Calulate Sum of Pointer 1 and 2

            if (sum < n)
                Pointer1++;  //if sum is less than given value => Move Pointer 1 to Right
            else if (sum > n)
                Pointer2--;
            else {
                result[0] = arr[Pointer1];
                result[1] = arr[Pointer2];
                return result; // containing 2 number
            }
        }
        return arr;
    }

    //Helper Function to sort given Array (Quick Sort)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is <= to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

}
