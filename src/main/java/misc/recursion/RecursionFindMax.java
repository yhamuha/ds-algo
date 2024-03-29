package misc.recursion;

/**
 *  The {@code RecursionFindMax} class
 *  find Max element of array
 */
public class RecursionFindMax {

    /**
     * driver method
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        System.out.println(findMax(arr, 4));
    }

    /**
     * looking for a replaces
     * @param arr       input array
     * @param n         size of array
     * @return int      max element of array
     */
    static int findMax(int[] arr, int n) {
        // min base case
        if (n == 1) return arr[0];
        // min size task
        // put to stack areas each elem of array
        int maxElementIn_N_minus_1_arr = findMax(arr, n - 1);
        // current task and return
        return maxElementIn_N_minus_1_arr > arr[n - 1]
                ? maxElementIn_N_minus_1_arr
                : arr[n - 1];
    }
}
