package Day2;

public class IsArraySorted {

    static void isArraySorted(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }

        System.out.println("Is Array Sorted : " + flag);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        isArraySorted(arr);
    }
}
