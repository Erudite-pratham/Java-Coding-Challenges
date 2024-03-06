package Day4;

public class RotatingArray {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, 4, 5, 6, 7, 9};
        int d = 5;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1 - d);
        reverseArray(arr, arr.length - d, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int[] arr, int front, int end) {
        while (front < end) {
            int temp = arr[front];
            arr[front] = arr[end];
            arr[end] = temp;
            front++;
            end--;
        }
    }
}
