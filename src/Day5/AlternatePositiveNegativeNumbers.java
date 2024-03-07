package Day5;

import java.util.LinkedList;
import java.util.Queue;

public class AlternatePositiveNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int n = arr.length;
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for (int j : arr) {
            if (j >= 0) {
                pos.add(j);
            } else {
                neg.add(j);
            }
        }

        for (int i = 0; i < n; i++) {

            if ((i % 2 == 0 || neg.isEmpty()) && !pos.isEmpty()) {
                arr[i] = pos.poll();
            } else {
                arr[i] = neg.poll();
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
