package Day4;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int pointer1 = 0, pointer2 = 0;
        int[] arr1 = {1, 2, 3, 4, 5,};
        int[] arr2 = {1, 2, 3, 6, 7,};
        ArrayList<Integer> ans = new ArrayList<>();

        while (pointer1 < arr1.length || pointer2 < arr2.length) {

//            if (pointer1 == arr1.length) {
//                ans.add(arr2[pointer2]);
//                pointer2++;
//                continue;
//            }

//            if (pointer2 == arr2.length) {
//                ans.add(arr1[pointer1]);
//                pointer1++;
//                continue;
//            }

            if (pointer2 == arr2.length || (pointer1 < arr1.length && arr1[pointer1] < arr2[pointer2])) {
                ans.add(arr1[pointer1]);
                pointer1++;
            } else if (pointer1 == arr1.length || arr1[pointer1] > arr2[pointer2]) {
                ans.add(arr2[pointer2]);
                pointer2++;
            } else {
                ans.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }

        System.out.println(ans);
    }
}
