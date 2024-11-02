package com.chiru.ds.practice.math;

public class CountNumberOfDigits {

    public static int countNumberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countNumberOfDigits(7));
    }
}
