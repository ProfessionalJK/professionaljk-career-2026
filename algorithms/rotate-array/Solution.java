public class Solution {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(java.util.Arrays.toString(rotateArray(new int[]{1, 2}, 3)));
        System.out.println(java.util.Arrays.toString(rotateArray(new int[]{1, 2, 3}, 0)));
        System.out.println(java.util.Arrays.toString(rotateArray(new int[]{1}, 10)));
        System.out.println(java.util.Arrays.toString(rotateArray(new int[]{1, 2, 3, 4}, 1)));
    }

    public static int[] rotateArray(int[] inputArray, int k) {
        if (inputArray == null) return null;
        k %= inputArray.length;
        reverse(inputArray, 0, inputArray.length-1);
        reverse(inputArray, 0, k-1);
        reverse(inputArray, k, inputArray.length-1);
        return inputArray;
    }

    public static void reverse(int[] inputArray, int left, int right) {
        while (left < right) {
            int temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left++;
            right--;
        }
    }
}