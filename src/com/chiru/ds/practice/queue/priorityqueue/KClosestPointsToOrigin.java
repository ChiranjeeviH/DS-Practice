
package com.chiru.ds.practice.queue.priorityqueue;

/*
Given an array of points where each point is represented as points[i] = [xi, yi] on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

The distance between two points on the X-Y plane is the Euclidean distance, defined as:

sqrt( (x2 - x1)2 + (y2 - y1)2 )

Note: You can return the k closest points in any order, driver code will sort them before printing.

Examples:

Input: k = 2, points[] = [[1, 3], [-2, 2], [5, 8], [0, 1]]
Output: [[-2, 2], [0, 1]]
Explanation: The Euclidean distances from the origin are:
Point (1, 3) = sqrt(10)
Point (-2, 2) = sqrt(8)
Point (5, 8) = sqrt(89)
Point (0, 1) = sqrt(1)
The two closest points to the origin are [-2, 2] and [0, 1].
Input: k = 1, points = [[2, 4], [-1, -1], [0, 0]]
Output: [[0, 0]]
Explanation: The Euclidean distances from the origin are:
Point (2, 4) = sqrt(20)
Point (-1, -1) = sqrt(2)
Point (0, 0) = sqrt(0)
The closest point to origin is (0, 0).
Constraints:

1 <= k <= points.size() <= 105
-104 <= xi, yi <= 104
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][2];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            // Compare based on squared Euclidean distance to the origin
            int distanceA = a[0] * a[0] + a[1] * a[1];
            int distanceB = b[0] * b[0] + b[1] * b[1];
            return Integer.compare(distanceA, distanceB);
        });

        for (int i = 0; i < points.length; i++) {
            minHeap.offer(points[i]);
        }

        // Poll the top k closest points from the heap
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }


    public static void main(String[] args) {

        KClosestPointsToOrigin solution = new KClosestPointsToOrigin();

        int[][] points = {
                {1, 3},
                {-2, 2},
                {5, 8},
                {0, 1}
        };
        int k = 2;

        int[][] closestPoints = solution.kClosest(points, k);

        // Output the result
        System.out.println(Arrays.deepToString(closestPoints)); // Expected: [[-2, 2], [0, 1]]


    }
}
