import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][]{{1, 4},{4, 5}})));
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][]{{1, 4},{0, 0}})));
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][]{{1, 4}})));
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][]{})));
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else {
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}