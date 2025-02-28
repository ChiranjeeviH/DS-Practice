package com.chiru.ds.practice.graph;

public class WordSearch {
    // Directions: Up, Down, Left, Right
    private static final int[] dirX = {-1, 1, 0, 0};
    private static final int[] dirY = {0, 0, -1, 1};

    static public boolean isWordExist(char[][] mat, String word) {
        if (mat == null || mat.length == 0 || word == null || word.length() == 0) {
            return false;
        }

        int n = mat.length;
        int m = mat[0].length;

        // Visited matrix to keep track of the visited cells
        boolean[][] visited = new boolean[n][m];

        // Start DFS from every cell in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the current cell matches the first character of the word
                if (mat[i][j] == word.charAt(0)) {
                    // Start DFS to find the word from the current cell
                    if (dfs(mat, word, i, j, 0, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // DFS helper function
    private static boolean dfs(char[][] mat, String word, int i, int j, int index, boolean[][] visited) {
        // Base case: If we have matched the whole word, return true
        if (index == word.length()) {
            return true;
        }

        // If out of bounds or current cell does not match the word's current character, return false
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || visited[i][j] || mat[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark the current cell as visited
        visited[i][j] = true;

        // Try all 4 possible directions (Up, Down, Left, Right)
        for (int d = 0; d < 4; d++) {
            int newI = i + dirX[d];
            int newJ = j + dirY[d];

            // Recur to the next character in the word
            if (dfs(mat, word, newI, newJ, index + 1, visited)) {
                return true;
            }
        }

        // Backtrack: Unmark the cell as visited
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(WordSearch.isWordExist(new char[][]{{'T', 'E', 'E'},{'S', 'G', 'K'},{'T', 'E', 'L'}},"GEEK"));
    }
}
