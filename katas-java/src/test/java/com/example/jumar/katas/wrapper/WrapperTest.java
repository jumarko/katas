package com.example.jumar.katas.wrapper;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WrapperTest {

    @Test
    public void wrapEmptyString() {
        checkWrap("", 0, "");
        checkWrap("", 1, "");
        checkWrap("", 10, "");
    }



    @Test
    public void wrapStringShorterThanColumnNumber() {
        checkWrap("ahoj", 5, "ahoj");
        checkWrap("Len tak", 7, "Len tak");
        checkWrap("abeceda", 8, "abeceda");
    }


    private static void checkWrap(String inputString, int columnNumber, String expectedString) {
        assertThat(Wrapper.wrap(inputString, columnNumber), is(expectedString));
    }
}
