public class Solution {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int rows, int columns) {
        if (rows < 0 || columns < 0 || rows >= grid.length || columns >= grid[0].length || grid[rows][columns] == '0'){
            return;
        }
        grid[rows][columns] = '0';
        dfs(grid, rows + 1, columns);
        dfs(grid, rows - 1, columns);
        dfs(grid, rows, columns + 1);
        dfs(grid, rows, columns - 1);
    }
}