public class Solution {

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(productOfArrAyExceptSelfOptimized(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(productOfArrAyExceptSelfOptimized(new int[]{-1, 1, 0, -3, 3})));
        System.out.println(java.util.Arrays.toString(productOfArrAyExceptSelfOptimized(new int[]{0, 0})));
        System.out.println(java.util.Arrays.toString(productOfArrAyExceptSelfOptimized(new int[]{5})));
        System.out.println(java.util.Arrays.toString(productOfArrAyExceptSelfOptimized(new int[]{2, 3})));
        System.out.println(java.util.Arrays.toString(productOfArrAyExceptSelfOptimized(new int[]{})));
    }

    public static int[] productOfArrayExceptSelf(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        if (inputArray.length >= 1) {
            for (int i = 0; i < inputArray.length; i++) {
                int product = 1;
                for (int j = 0; j < inputArray.length; j++) {
                    if (j != i) {
                        product *= inputArray[j];
                    }
                }
                outputArray[i] = product;
            }
            return outputArray;
        }
        return inputArray;
    }

    public static int[] productOfArrAyExceptSelfOptimized(int[] inputArray) {
        if (inputArray == null) return null;
        if (inputArray.length == 0) return new int[0];
        int[] outputArray = new int[inputArray.length];
        outputArray[0] = 1;

        for (int i = 1; i < inputArray.length; i++) {
            outputArray[i] = outputArray[i - 1] * inputArray[i - 1];
        }

        int rightProduct = 1;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            outputArray[i] *= rightProduct;
            rightProduct *= inputArray[i];
        }
        return outputArray;
    }
}