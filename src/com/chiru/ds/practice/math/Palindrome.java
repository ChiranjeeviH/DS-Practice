package com.chiru.ds.practice.math;

public class Palindrome {

    public static boolean isPalindrome(int number){

        int reverse=0;
        int temp = number;

        while(number > 0){
            int rem = number%10;
            reverse= reverse*10 + rem;
            number = number/10;
        }

        return reverse==temp;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(78987));
    }
}
