package lab3;

public class Problem04 {

    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4};
        System.out.println(findMaxElement(arr));
    }

    public static int findMaxElement(int[] arr){
        if(arr == null || arr.length == 0) throw new IllegalArgumentException("Empty array error");
        return findMax(arr, 0, arr[0]);
    }

    private static int findMax(int[] arr, int index, int max){
        max = Math.max(arr[index], max);
        if(index == arr.length - 1) return max;
        return  findMax(arr, index + 1, max);
    }
}
