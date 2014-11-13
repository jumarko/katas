package com.example.jumar.katas.wrapper;

public class Wrapper {

    private final int columnNumber;

    public static String wrap(String string, int columnNumber) {
        return new Wrapper(columnNumber).wrap(string);
    }

    private Wrapper(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    private String wrap(String string) {
        if (string.length() <= columnNumber) {
            return string;
        }

        final int lastSpaceIndex = string.substring(0, columnNumber).lastIndexOf(' ');

        if (string.charAt(columnNumber) == ' ') {
            return breakLine(string, columnNumber, 1);
        } else if (lastSpaceIndex != -1) {
            return breakLine(string, lastSpaceIndex, 1);
        } else {
            return breakLine(string, columnNumber, 0);
        }
    }

    private String breakLine(String string, int position, int gap) {
        return string.substring(0, position) + "\n"
                    + wrap(string.substring(position + gap), columnNumber);
    }
}
