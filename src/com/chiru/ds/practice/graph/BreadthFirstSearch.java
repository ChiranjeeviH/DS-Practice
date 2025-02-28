package com.chiru.ds.practice.graph;

/*
BFS - InOrder Traversal

        1
       / \
      2   3
     / \   |
    4   5  6

    The BFS traversal order would be: 1 -> 2 -> 3 -> 4 -> 5 -> 6.

Start at node 1.
The nodes directly connected to 1 are 2 and 3.
From node 2, visit its neighbors 4 and 5.
From node 3, visit its neighbor 6.

we will be creating Adjacency List to store the connected Nodes as follows

1) Create a ArrayList of ArrayList with the size of N+1 => ArrayList<ArrayList<Integer>> bfs = new ArrayList<>(N+1);
2) Traverse and store for each node with what nodes its connected directly.

0 => {} -> Empty list
1 => {2,3}
2 => {1,4,5}
3 => {1,6}
4 => {2}
5 => {2}
6 => {3}

we need 3 data structures to solve the problem
1) Adjacency List to maintain all of its neighbours to store
2) Queue to pop the elements to see what first inserted would be first one to go out
3) Visited boolean array to mark the elements , if we have visited already.

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adjacencyList){

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        queue.add(0);
        visited[0] = true;
        ArrayList<Integer> bfs = new ArrayList<>();

        while (!queue.isEmpty()){

            Integer node = queue.poll();
            bfs.add(node + 1); // Add 1 to convert the index back to 1-based node value

            for(Integer it:adjacencyList.get(node)){

                if(!visited[it]){
                    visited[it] = true;
                    queue.add(it);
                }
            }
        }

        return bfs;

    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        adjacencyList.get(0).add(1); // 1 -> 2
        adjacencyList.get(0).add(2); // 1 -> 3
        adjacencyList.get(1).add(0); // 2 -> 1
        adjacencyList.get(1).add(3); // 2 -> 4
        adjacencyList.get(1).add(4); // 2 -> 5
        adjacencyList.get(2).add(0); // 3 -> 1
        adjacencyList.get(2).add(5); // 3 -> 6
        adjacencyList.get(3).add(1); // 4 -> 2
        adjacencyList.get(4).add(1); // 5 -> 2
        adjacencyList.get(5).add(2); // 6 -> 3

        System.out.println(new BreadthFirstSearch().bfsOfGraph(V,adjacencyList));

    }
}
