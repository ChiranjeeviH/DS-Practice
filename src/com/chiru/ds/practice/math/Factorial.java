package com.chiru.ds.practice.math;

public class Factorial {

    public static long factorial(int number){

        if(number == 0 || number == 1){
            return 1;
        }else if(number ==2){
            return 2;
        }

        long factorial = 1;

        for(int i=number;i>1;i--){
            factorial = factorial*i;
        }

        return factorial;
    }


    public static void main(String[] args) {

        System.out.println(factorial(50));
    }
}
