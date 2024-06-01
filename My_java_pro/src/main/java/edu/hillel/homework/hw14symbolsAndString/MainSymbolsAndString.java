package edu.hillel.homework.hw14symbolsAndString;

import java.util.Arrays;

class MainSymbolsAndString {

    public static void main(String[] args) {
        MainSymbolsAndString symbolsAndString = new MainSymbolsAndString();
        System.out.println(symbolsAndString.findSymbolOccurance("Hello world", ' '));
        System.out.println(symbolsAndString.findWordPosition("Apollo", "pollo"));
        System.out.println(symbolsAndString.findWordPosition("Apple", "Plant"));
        System.out.println(symbolsAndString.stringReverse("Hello"));
        System.out.println(symbolsAndString.isPalindrome("ERE"));
        System.out.println(symbolsAndString.isPalindrome("ERe"));

    }

    private long findSymbolOccurance(String string, char symbol) {
        return Arrays.stream(string.split(""))
                .filter(s -> s.charAt(0) == symbol)
                .count();
    }

    private int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    private StringBuilder stringReverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse();
    }

    private boolean isPalindrome(String string) {
        char[] charArray = string.toCharArray();
        int arrayLength = charArray.length;

        for (int i = 0, j = arrayLength - 1; i < arrayLength / 2; i++, j--) {
            if (charArray[i] != charArray[j]) {
                return false;
            }
        }
        return true;
    }
}
