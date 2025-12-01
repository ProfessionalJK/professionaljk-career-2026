public class Solution {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 4));
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
    }

    public static int binarySearch(int[] array, int element) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == element) return mid;
            if (array[mid] < element)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}