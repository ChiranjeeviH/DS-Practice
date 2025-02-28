package com.chiru.ds.practice.tree.easy;

/*
Given a binary tree, find its height.

The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children.

Examples:

Input: root[] = [12, 8, 18, 5, 11]

Output: 2
Explanation: One of the longest path from the root (node 12) goes through node 8 to node 5, which has 2 edges.
Input: root[] = [1, 2, 3, 4, N, N, 5, N, N, 6, 7]

Output: 3
Explanation: The longest path from the root (node 1) to a leaf node 6 with 3 edge.
Constraints:
1 <= number of nodes <= 105
0 <= node->data <= 105

Time Complexity: O(n)  Auxiliary Space: O(n)
 */

import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    int height(Node node) {

        int level = -1;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){

            int queueSize = queue.size();

            for(int i=0;i<queueSize;i++){
                Node currentNode = queue.poll();

                assert currentNode != null;
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }
            level++;
        }


        return level;

    }

    public static void main(String[] args) {

        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(new BinaryTreeHeight().height(root));
    }
}
