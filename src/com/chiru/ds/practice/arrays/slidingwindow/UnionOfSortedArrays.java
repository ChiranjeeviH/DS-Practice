package com.chiru.ds.practice.arrays.slidingwindow;

import java.util.ArrayList;


public class UnionOfSortedArrays {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();


        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }

        for (int k = i; k < a.length; k++) {
            result.add(a[k]);
        }
        for (int k = j; k < b.length; k++) {
            result.add(b[k]);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println((findUnion(new int[]{7, 9, 10, 14, 17}, new int[]{1, 7, 13, 18, 19})));
    }

}
