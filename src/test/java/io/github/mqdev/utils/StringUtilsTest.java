package io.github.mqdev.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private StringUtils utils;

    @BeforeEach
    public void setup() {
        utils = new StringUtils();
    }

    @Test
    public void testReverseWithValidString() {
        // Arrange
        String input = "hello";

        // Act
        String result = utils.reverse(input);

        // Assert
        assertEquals("olleh", result);
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        // Arrange
        String input = "A man a plan a canal Panama";

        // Act
        boolean result = utils.isPalindrome(input);

        // Assert
        assertTrue(result);
    }
}
