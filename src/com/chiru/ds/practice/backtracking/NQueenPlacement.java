package com.chiru.ds.practice.backtracking;

/*
The n-queens puzzle is the problem of placing n queens on a (n × n) chessboard such that no two queens can attack each other. Note that two queens attack each other if they are placed on the same row, the same column, or the same diagonal.

Given an integer n, find all distinct solutions to the n-queens puzzle.
You can return your answer in any order but each solution should represent a distinct board configuration of the queen placements, where the solutions are represented as permutations of [1, 2, 3, ..., n]. In this representation, the number in the ith position denotes the row in which the queen is placed in the ith column.
For eg. below figure represents a chessboard [3 1 4 2].

Examples:

Input: n = 1
Output: [1]
Explaination: Only one queen can be placed in the single cell available.
Input: n = 4
Output: [[2 4 1 3 ] [3 1 4 2 ]]
Explaination: There are 2 possible solutions for n = 4.
Input: n = 2
Output: []
Explaination: There are no possible solutions for n = 2.
Constraints:
1 ≤ n ≤ 10

Time Complexity: O(n!)Auxiliary Space: O(n^2)
 */

import java.util.ArrayList;

public class NQueenPlacement {

    public ArrayList<ArrayList<Integer>> nQueen(int n) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> board = new ArrayList<>();

        // Rows occupied
        boolean[] rows = new boolean[n + 1];

        // Major diagonals (row + j) and Minor diagonals (row - col + n)
        boolean[] diag1 = new boolean[2 * n + 1];
        boolean[] diag2 = new boolean[2 * n + 1];

        // Start solving from the first column
        nQueenUtil(1, n, board, rows, diag1, diag2, res);
        return res;

    }

    // Utility function for solving the N-Queens
    // problem using backtracking.
    static void nQueenUtil(int j, int n, ArrayList<Integer> board, boolean[] rows,
                           boolean[] diag1, boolean[] diag2, ArrayList<ArrayList<Integer>> res) {

        if (j > n) {
            // A solution is found
            res.add(new ArrayList<>(board));
            return;
        }

        for (int i = 1; i <= n; ++i) {
            if (!rows[i] && !diag1[i + j] && !diag2[i - j + n]) {

                // Place queen
                rows[i] = diag1[i + j] = diag2[i - j + n] = true;
                board.add(i);

                // Recurse to the next column
                nQueenUtil(j + 1, n, board, rows, diag1, diag2, res);

                // Remove queen (backtrack)
                board.remove(board.size() - 1);
                rows[i] = diag1[i + j] = diag2[i - j + n] = false;
            }
        }
    }



    public static void main(String[] args) {

        int n = 8;
        ArrayList<ArrayList<Integer>> res = new NQueenPlacement().nQueen(n);

        for (ArrayList<Integer> solution : res) {
            System.out.print("[");
            for (int i = 0; i < solution.size(); i++) {
                System.out.print(solution.get(i));
                if (i != solution.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}
