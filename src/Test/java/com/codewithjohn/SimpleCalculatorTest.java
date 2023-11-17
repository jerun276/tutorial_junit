package com.codewithjohn;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SimpleCalculatorTest {

    private SimpleCalculator simpleCalculator=null;

    @BeforeAll
    void beforeAll(){
        this.simpleCalculator = new SimpleCalculator();
    }

    @Test
    @DisplayName("Adding 2 with 2 equals 4")
    void test1() {

        var actualResult = this.simpleCalculator.add(2, 2);
        assertEquals(4, actualResult);
    }

    @Test
    @DisplayName("Adding 3 with 2 equals 5")
    void test2() {

        var actualResult = this.simpleCalculator.add(3, 2);
        assertEquals(5, actualResult);
    }

    @Test
    @DisplayName("Adding 9 with 10 equals 19")
    void test3() {

        var actualResult = this.simpleCalculator.add(9, 10);
        assertTrue(actualResult==19);
    }
}