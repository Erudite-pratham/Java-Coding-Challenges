package Day4;

public class RotatingArray {
    public static void main(String[] args) {
        int d = 3;
        int[] arr = {-1, -2, -3, 4, 5, 6, 7};
        int n = arr.length;


        for (int i = n / 2; i > 0; i++) {
            reverseArray(arr, i, 0, n);
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void reverseArray(int[] arr, int front, int end, int d) {

        int i = 0;
        while (i < arr.length / 2) {

            int temp = arr[front + d];
            arr[front] = arr[end - front - 1];
            arr[end - front - 1] = temp;
            i++;
        }
    }
}
