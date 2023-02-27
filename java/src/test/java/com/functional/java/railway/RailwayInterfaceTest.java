package com.functional.java.railway;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RailwayInterfaceTest {

    @Test
    void testHappyPath() {
        Result parseResult = getParseResult(36,6);
        Assertions.assertTrue(parseResult instanceof Success);
        Assertions.assertEquals("6", parseResult.apply());
    }

    @Test
    void testUnhappypath() {
        Result parseResult = getParseResult(36,0);
        Assertions.assertTrue(parseResult instanceof Error);
        Assertions.assertEquals("/ by zero", parseResult.apply());
    }

    private static Result getParseResult(int number1, int number2) {
        try{
            int r = number1/number2;
            return new Success(r);
        } catch (Exception e) {
            return new Error(e);
        }
    }
}
