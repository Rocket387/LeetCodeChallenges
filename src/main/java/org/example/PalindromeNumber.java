package org.example;

/*
Given an integer x, return true if x is a
palindrome, and false otherwise.
If x is negative, return false.

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //check if number is negative, return false if it is as
        //palindromes cannot be negative
        if (x < 0) {
            return false;
        }

        //inititalize variables
        int reversed = 0; //stores reversed value of the number
        int temp = x; //temporary placeholder to manipulate input number

        //loop until temp  0
        while (temp != 0) {
            //extract last digit of temp using % 10
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            //divide temp by 10 to remove last digit
            temp /= 10;
        }
        //compare reversed value to original (x)
        //if equal then x is palindrome (true)
        return (reversed == x);
    }

    public static void main(String[] args) {

        PalindromeNumber example = new PalindromeNumber();

        System.out.println(example.isPalindrome(464));
    }
}
