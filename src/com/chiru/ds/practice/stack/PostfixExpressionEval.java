package com.chiru.ds.practice.stack;

/*
You are given an array of strings arr that represents a valid arithmetic expression written in Reverse Polish Notation (Postfix Notation). Your task is to evaluate the expression and return an integer representing its value.

Key Details:

The valid operators are '+', '-', '*', and '/'.
Each operand is guaranteed to be a valid integer or another expression.
The division operation between two integers always rounds the result towards zero, discarding any fractional part.
No division by zero will occur in the input.
The input is a valid arithmetic expression in Reverse Polish Notation.
The result of the expression and all intermediate calculations will fit in a 32-bit signed integer.
Examples:

Input: arr = ["2", "3", "1", "*", "+", "9", "-"]
Output: -4
Explanation: If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.
Input: arr = ["100", "200", "+", "2", "/", "5", "*", "7", "+"]
Output: 757
Explanation: If the expression is converted into an infix expression, it will be ((100 + 200) / 2) * 5 + 7  = 150 * 5 + 7 = 757.
Constraints:

1 <= arr.size() <= 105
arr[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-104, 104]
 */

import java.util.Arrays;
import java.util.Stack;

public class PostfixExpressionEval {

    public int evaluate(String[] arr) {

        Stack<String> postfix = new Stack<>();

        for(String arrEle:arr){

            if(arrEle.equals("*") || arrEle.equals("+") || arrEle.equals("/") || arrEle.equals("-")) {
                if (!postfix.isEmpty() && postfix.size() > 1) {

                    int number1 = Integer.parseInt(postfix.pop());
                    int number2 = Integer.parseInt(postfix.pop());

                    String result = "";

                    switch (arrEle) {
                        case "+":
                            result = String.valueOf(number2 + number1);
                            break;
                        case "-":
                            result = String.valueOf(number2 - number1);
                            break;
                        case "*":
                            result = String.valueOf(number2 * number1);
                            break;
                        case "/":
                            result = String.valueOf(number2 / number1);
                            break;
                    }

                    postfix.push(result);
                }
            }else{
                    postfix.push(arrEle);
                }
            }

        return Integer.parseInt(postfix.pop());
    }


    public static void main(String[] args) {

        System.out.println(new PostfixExpressionEval().evaluate(new String[]{"2", "3", "1", "*", "+", "9", "-"}));

    }
}
