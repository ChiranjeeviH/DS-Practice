package com.chiru.ds.practice.prefixsum;

public class MinimumSizeSubArraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int prefix=0;

        int length=0;
        int min=0;


        for(int num:nums){
            prefix+=num;
            length++;
            if(prefix>=target){
                min = Math.min(length,min);
                prefix=0;
            }
        }

        return min;

    }

    public static void main(String[] args) {
        System.out.println(new MinimumSizeSubArraySum().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println(new MinimumSizeSubArraySum().minSubArrayLen(4, new int[]{1,4,4}));
        System.out.println(new MinimumSizeSubArraySum().minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}
