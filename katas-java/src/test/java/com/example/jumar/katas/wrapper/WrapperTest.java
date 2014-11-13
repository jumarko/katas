package com.example.jumar.katas.wrapper;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WrapperTest.DegenerateTests.class,
        WrapperTest.WrapWordsTest.class
})
public class WrapperTest {

     public static class DegenerateTests {

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

     }

     public static class WrapWordsTest {

         @Test
         public void splitOneWord() {
             checkWrap("word", 2, "wo\nrd");
         }

         @Test
         public void splitOneWordTwoTimes() {
             checkWrap("oneword", 3, "one\nwor\nd");
         }

         @Test
         public void splitOneWordManyTimes() {
             checkWrap("onesingleword", 3, "one\nsin\ngle\nwor\nd");
         }

         @Test
         public void wrapOnWordBoundary() {
             checkWrap("word word", 5, "word\nword");
         }

         @Test
         public void wrapThreeWordsBoundary() {
             checkWrap("word word word", 5, "word\nword\nword");
         }

         @Test
         public void wrapTwoWordsAfterSpace() {
             checkWrap("word word", 6, "word\nword");
         }

         @Test
         public void wrapThreeWordsAfterFirstSpace() {
             checkWrap("word word word", 6, "word\nword\nword");
         }

         @Test
         public void wrapThreeWordsAfterSecondSpace() {
             checkWrap("word word word", 11,
                     "word word\nword");
         }

         @Test
         public void wrapJustBeforeWordBoundary() throws Exception {
             checkWrap("word word", 4, "word\nword");
         }

         @Test
         public void wrapWordsAfterSpace() {
             checkWrap("Ahoj len tak som si vsimol, ze robis nieco zaujimave", 10,
                     "Ahoj len\ntak som si\nvsimol, ze\nrobis\nnieco\nzaujimave");
         }
     }


    private static void checkWrap(String inputString, int columnNumber, String expectedString) {
        assertThat(Wrapper.wrap(inputString, columnNumber), is(expectedString));
    }
}
