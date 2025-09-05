package lab3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Problem04Test {

    @Test
    void caseSuccess() {
        int[] arr = {5, -3, 6, 1, 9, 4};
        int max = Problem04.findMaxElement(arr);
        assertEquals(9, max);
    }

    @Test
    void caseEmptyArray(){
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            Problem04.findMaxElement(arr);
        });
    }
}