package practice.examples;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 * Example:
 * Input:
 *  11110
 *  11010
 *  11000
 *  00000
 * Output: 1
 *
 * Input:
 *  11000
 *  11000
 *  00100
 *  00011
 * Output: 3
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int noOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    noOfIslands += dfs(grid, i, j);
                }
            }
        }
        return noOfIslands;
    }

    private static int dfs(char[][] inputGrid, int i, int j) {
        if (i >= inputGrid.length || i < 0 || j < 0 || j >= inputGrid[i].length || inputGrid[i][j] == '0') {
            return 0;
        }
        inputGrid[i][j] = '0';
        dfs(inputGrid, i + 1, j);
        dfs(inputGrid, i - 1, j);
        dfs(inputGrid, i, j + 1);
        dfs(inputGrid, i, j - 1);
        return 1;
    }
}
