public class Solution {

    public static void main(String[] args) {
        System.out.println(searchRotatedArray(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(searchRotatedArray(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    public static int searchRotatedArray(int[] array, int element) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == element) return mid;

            if(array[left] <= array[mid]) {
                if (element >= array[left] &&  element < array[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (element > array[mid] && element <= array[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}