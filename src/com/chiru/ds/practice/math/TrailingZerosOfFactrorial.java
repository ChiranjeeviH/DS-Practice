package com.chiru.ds.practice.math;

import java.math.BigInteger;

public class TrailingZerosOfFactrorial {


    public static int trailingZerosOfFactorial(int number){

        BigInteger factorial = new BigInteger("1");

        for(int i=2;i<=number;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        int count =0;

        while(!factorial.equals(0)){

            BigInteger[] reminder = factorial.divideAndRemainder(new BigInteger("10"));

            if(reminder[1].equals(new BigInteger("0"))){
                count++;
            }else{
                return count;
            }
            factorial = reminder[0];
        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println(trailingZerosOfFactorial(10));

    }
}
