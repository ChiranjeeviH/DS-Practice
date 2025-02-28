package com.chiru.ds.practice.tree.easy;

/*
Given a binary tree, convert the binary tree to its Mirror tree.

Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

Examples:

Input: root[] = [1, 2, 3, N, N, 4]
Output: [1, 3, 2, N, 4]
Explanation:

In the inverted tree, every non-leaf node has its left and right child interchanged.
Input: root[] = [1, 2, 3, 4, 5]
Output: [1, 3, 2, N, N, 5, 4]
Explanation:

In the inverted tree, every non-leaf node has its left and right child interchanged.
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

Time Complexity: O(n)Auxiliary Space: O(1)
 */

import com.chiru.ds.practice.tree.medium.DiameterOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class MirrorTree {

    void mirror(Node node) {

        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while(!queue.isEmpty()) {

            Node currentNode = queue.poll();

            Node temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

        }
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        //root.left.right = new Node(11);



        new MirrorTree().mirror(root);

        System.out.println(root);
    }
}
