package org.example;

import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ValidParenthesisTest {

    private final ValidParentheses instance = new ValidParentheses();
    @Test
    public void ValidParenthesisTrue() {

        boolean result = instance.isValid("(){}");

        assertTrue(result);
    }

    @Test
    public void ValidParenthesisFalse() {

        boolean result = instance.isValid("(){]");

        assertFalse(result);

    }
}
