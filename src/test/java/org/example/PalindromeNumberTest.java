package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class PalindromeNumberTest {

    PalindromeNumber instance = new PalindromeNumber();
    @Test
    public void PalindromeTrue(){

        int x = 323;
        assertTrue(instance.isPalindrome(x));
    }

    @Test
    public void PalindromeNegativeNumberReturnFalse(){

        int x = -323;
        assertFalse(instance.isPalindrome(x));
    }

}