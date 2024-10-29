package org.example;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        //create an empty stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();

        //Loop through every character in the string
        for (char c : s.toCharArray()) {

            //if the character is an opening brack, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                //if the character is a closing bracket

                //if the stack is empty, there is no matching opening bracket, returns false
                if (stack.isEmpty()) {
                    return false;
                }

                //otherwise, get the top of the stack and check if its the matching opening bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else { //otherwise brackets do not match so return false
                    return false;
                }
            }
        }

        //if the stack is empty, all opening brackets have been closed so return true
        //otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
}
