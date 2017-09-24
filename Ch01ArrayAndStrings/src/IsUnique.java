/*
From, Cracking the Coding Interview, 6th Edition
Chapter 1. Arrays and Strings

1.1 Is Unique: Implement an algorithm to determine if a string
has all unique characters.

Here we are assuming, it is an ASCII string
*/

public class IsUnique {
    public static void main(String[] args) {
        test("Hello, World!");
        test("HTML");
        test("a");
        test("Aa");
        test("");
        test("  ");
        test("S p a c e");
    }

    private static boolean isStringUnique(String s) {
        // ASCII has only 128 unique characters
        if (s.length() > 128) {
            return false;
        }

        int[] aCharSet = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            if(aCharSet[value] > 0) {
                return false;
            } else {
                aCharSet[value]++;
            }
        }

        return true;
    }

    private static void test(String s) {
        System.out.println(s + ": " + isStringUnique(s));
    }
}
