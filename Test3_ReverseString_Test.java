package com.test3.invertsstring;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Test3_ReverseString_Test {

    @Test
    @Parameters(method = "parametersToTestAdd")
    public void givenInputString_whenReverseString_thenReturnReverse(String input, String expectedText) {
        // Given
        Test3_ReverseString test = new Test3_ReverseString();

        // WHEN
        String actualResult = test.reverseString(input);

        // THEN
        assertEquals(expectedText, actualResult);
    }

    private Object[] parametersToTestAdd() {
        return new Object[]{
                new Object[]{"Benny", "ynneB"},
                new Object[]{"Dimitrii", "iirtimiD"},
                new Object[]{"Werner", "renreW"},
        };
    }

    @Test
    @Parameters(method = "parametersToTestAdd2")
    public void givenInputString_whenReverseString2_thenReturnReverse(String input, String expectedText) {
        // Given
        Test3_ReverseString test = new Test3_ReverseString();

        // WHEN
        String actualResult = test.reverseString2(input);

        // THEN
        assertEquals(expectedText, actualResult);
    }

    private Object[] parametersToTestAdd2() {
        return new Object[]{
                new Object[]{"Benny", "ynneB"},
                new Object[]{"Dimitrii", "iirtimiD"},
                new Object[]{"Werner", "renreW"},
                new Object[]{"", null}
        };
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNoInput_whenReverseString_thenThrowException() {
        // Given
        Test3_ReverseString test = new Test3_ReverseString();
        String input = "";

        // WHEN
        test.reverseString(input);
    }
}
