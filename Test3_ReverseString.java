package com.test3.invertsstring;

public class Test3_ReverseString {

    public String reverseString(String text) {
        if (text.trim().equals("") || text == null) {
            throw new IllegalArgumentException("There is no valid String argument, Please input a valid String ");
        }
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        return rev;
    }

    public String reverseString2(String input) {
        String rev = "";
        if (input.trim().equals("") || input == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(input);
        rev = sb.reverse().toString();

        return rev;

    }
}
