package Day2;

public class SecondLargest {

    static int secondLargest(int[] arr) {
        int first = -1, second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && first != arr[i]) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }
}
