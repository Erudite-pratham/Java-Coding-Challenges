package Day3;

public class ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 3, 1, 4};
        int index = 0;
        int[] tempArr = new int[arr.length];
        for (int j : arr) {
            if (j != 0) {
                tempArr[index] = j;
                index++;
            }
        }

        for (int i : tempArr) {
            System.out.print(i + " ");
        }
    }
}
