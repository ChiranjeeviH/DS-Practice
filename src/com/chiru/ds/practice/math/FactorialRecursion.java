package com.chiru.ds.practice.math;

public class FactorialRecursion {

    public static long factorialRecursion(int number){

        if(number <= 1){
            return 1;
        }

        return number * factorialRecursion(number-1);
    }


    public static void main(String[] args) {

        System.out.println(factorialRecursion(4));
    }
}
