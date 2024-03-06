package Day3;

public class ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 0, 7, 0, 3, 0, 4};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                arr[i] = 0;
                index++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
