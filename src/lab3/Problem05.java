package lab3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Problem05 {

    @Test
    void testP04Success() {
        int[] arr = {5, -3, 6, 1, 9, 4};
        int max = Problem04.findMaxElement(arr);
        assertEquals(9, max);
    }

    @Test
    void testP04EmptyArray(){
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            Problem04.findMaxElement(arr);
        });
    }


    @Test
    void testP03(){
        int[] testCases = {121, 12321, 123, -121, 1};
        boolean[] expected = {true, true, false, false, true};

        for (int i = 0; i < testCases.length; i++) {
            boolean actual = Problem03.isPalindrome(testCases[i]);
            assertEquals(expected[i],actual);
        }
    }
}