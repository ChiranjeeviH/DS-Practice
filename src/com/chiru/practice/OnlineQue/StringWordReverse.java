package com.chiru.practice.OnlineQue;

import java.util.regex.Pattern;

public class StringWordReverse {

	public static void main(String[] args) {
		
		String s = "Today is Wednesday";
		String finalString = "";
		String finalString1 = "";
		int endPosition = s.length();
		
		//Method-1
		String[] sArray = s.split(" ");
		for(int i=sArray.length-1;i>=0;i--) {
			finalString+=sArray[i]+" ";
		}
		System.out.println(finalString);
		
		
		//Method-2
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ' || i==0) {
				finalString1+=s.substring(i,endPosition)+" ";
				endPosition=i;
			}
		}
		System.out.println(finalString1);
		
		//Method-3
		
		
		// Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
  
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = pattern.split(s);
        String result = "";
  
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
    	
		
	}

}
