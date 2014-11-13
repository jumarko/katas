package com.example.jumar.katas.wrapper;

public class Wrapper {

    public static String wrap(String string, int columnNumber) {

        if (string.length() <= columnNumber) {

            return string;

        }

        final int lastSpaceIndex = string.substring(0, columnNumber).lastIndexOf(' ');

        if (lastSpaceIndex != -1) {

            return string.substring(0, lastSpaceIndex)
                    + "\n"
                    + wrap(string.substring(lastSpaceIndex + 1), columnNumber);

        } else {

            return string.substring(0, columnNumber)
                    + "\n"
                    + wrap(string.substring(columnNumber), columnNumber);
        }

    }
}
