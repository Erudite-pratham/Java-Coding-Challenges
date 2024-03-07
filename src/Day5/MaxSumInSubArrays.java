package Day5;

public class MaxSumInSubArrays {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            maxSum = Math.max(maxSum, arr[i - 1] + arr[i]);
        }

        System.out.println(maxSum);
    }
}
