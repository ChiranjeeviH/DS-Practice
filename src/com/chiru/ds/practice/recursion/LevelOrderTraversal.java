package com.chiru.ds.practice.recursion;

/*
Given a root of a binary tree with n nodes, the task is to find its level order traversal. Level order traversal of a tree is breadth-first traversal for the tree.

Examples:

Input: root[] = [1, 2, 3]

Output: [[1], [2, 3]]
Input: root[] = [10, 20, 30, 40, 50]

Output: [[10], [20, 30], [40, 50]]
Input: root[] = [1, 3, 2, N, N, N, 4, 6, 5]

Output: [[1], [3, 2], [4], [6, 5]]
Constraints:

1 ≤ number of nodes ≤ 105
0 ≤ node->data ≤ 109

Time Complexity: O(n)Auxiliary Space: O(n)
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}


public class LevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        levelOrderHelper(root, 0, result);

        return result;

    }

    private void levelOrderHelper(Node root, int level, ArrayList<ArrayList<Integer>> result) {

        if(root == null){
            return;
        }

        if(level == result.size()){
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.data); // add current level data;

        levelOrderHelper(root.left,level+1,result);
        levelOrderHelper(root.right, level+1, result);
    }


    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println(new LevelOrderTraversal().levelOrder(root));

    }
}
