package com.chiru.ds.practice.tree.medium;

/*
Given a binary tree, the diameter (also known as the width) is defined as the number of edges on the longest path between two leaf nodes in the tree. This path may or may not pass through the root. Your task is to find the diameter of the tree.

Examples:

Input: root[] = [1, 2, 3]

Output: 2
Explanation: The longest path has 2 edges (node 2 -> node 1 -> node 3).

Input: root[] = [5, 8, 6, 3, 7, 9]

Output: 4
Explanation: The longest path has 4 edges (node 3 -> node 8 -> node 5 -> node 6 -> node 9).

Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ node->data ≤ 105

Time Complexity: O(n)Auxiliary Space: O(h)

Algo :
Base Case: If the node is null, the height is -1 (indicating no node). If it’s a leaf, the height is 0.

Recursive Calculation:

Compute the height of the left and right subtrees of a node.
The diameter at that node will be the sum of the heights of its left and right subtrees (this counts the edges from left to right).
Update the global diameter if the sum of the heights at the current node is greater than the current diameter.
Global Result: As we recursively compute the height of subtrees, we also keep track of the largest sum of left and right subtree heights
(which corresponds to the longest path found so far).
 */


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class DiameterOfBinaryTree {

    private int diameter = 0;

    public int diameter(Node root) {

        calculateHeight(root);
        return diameter;
    }

    private int calculateHeight(Node node) {
        // Base case: If the node is null, return -1
        if (node == null) {
            return -1;
        }

        // Recursively calculate the height of the left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // The diameter at the current node is the sum of the heights of the left and right subtrees
        // (number of edges between the farthest leaf nodes)
        diameter = Math.max(diameter, leftHeight + rightHeight + 2);

        // Return the height of the current node, which is 1 + the maximum height of its left or right subtree
        return Math.max(leftHeight, rightHeight) + 1;

    }


    public static void main(String[] args) {

        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(new DiameterOfBinaryTree().diameter(root));

    }
}
