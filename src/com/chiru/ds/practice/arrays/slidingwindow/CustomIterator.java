/*
package com.chiru.ds.practice.arrays.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class CustomIterator extends ArrayList<String> implements Iterator {

    static List<String> listStrings = Arrays.asList("CHIRU","RAM","MADAM");

    private int currentIndex=0;


    public boolean isPalindrom(String word){

        StringBuilder stringBuilder = new StringBuilder(word);
        return word.equals(stringBuilder.reverse());

    }

    public static void main(String[] args) {


    }

    @Override
    public boolean hasNext() {
       return currentIndex < listStrings.size();
    }

    @Override
    public Object next() {
        String current = listStrings.get(currentIndex++);
        boolean success = isPalindrom(current);

        if(success){
            
        }
        return ;
    }
}
*/
