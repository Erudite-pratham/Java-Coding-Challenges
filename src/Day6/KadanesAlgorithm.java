package Day6;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};
        int n = arr.length;

        long sum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }


        System.out.println(maxSum);
    }
}
