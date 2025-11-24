public class Solution {

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(shiftZeroes(new int[]{0, 1, 0, 3, 12})));
        System.out.println(java.util.Arrays.toString(shiftZeroes(new int[]{0})));
        System.out.println(java.util.Arrays.toString(shiftZeroes(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(shiftZeroes(new int[]{0, 0, 0})));
        System.out.println(java.util.Arrays.toString(shiftZeroes(new int[]{4, 0, 5})));
        System.out.println(java.util.Arrays.toString(shiftZeroes(new int[]{})));
    }

    public static int[] shiftZeroes(int[] inputArray) {
        if (inputArray == null) return null;

        int lastNonZero = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] != 0) {
                int temp = inputArray[lastNonZero];
                inputArray[lastNonZero] = inputArray[i];
                inputArray[i] = temp;
                lastNonZero++;
            }
        }
        return inputArray;
    }
}