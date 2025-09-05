package lab3;

import java.util.Arrays;

public class Problem02 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,13};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr){
        if(arr != null && arr.length > 0)
            reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int startIndex, int endIndex){
        if(startIndex < endIndex && startIndex >= 0 && endIndex < arr.length){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            reverse(arr, startIndex+1, endIndex-1);
        }
    }
}
