package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, MathUtils.factorial(0), "Factoriel de 0 doit être 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, MathUtils.factorial(5), "Factoriel de 5 doit être 120");
        assertEquals(720, MathUtils.factorial(6), "Factoriel de 6 doit être 720");
    }

    @Test
    void testFactorialOfLargeNumber() {
        assertEquals(3628800, MathUtils.factorial(10), "Factoriel de 10 doit être 3628800");
    }

    @Test
    void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1),
                "Factoriel d'un nombre négatif doit lancer IllegalArgumentException");
    }
}
