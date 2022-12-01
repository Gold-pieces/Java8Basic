package test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private final Sum sum = new Sum();

    @Test
    void sumTest() {
        assertEquals(3, sum.sum(Arrays.asList(1, 2)));
    }

}