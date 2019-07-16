package com.exesandohs;

public class ExesAndOhs {

    public boolean checkXO(String input) {
        int a = 0;
        int b = 0;

        String lowerCaseInput = input.toLowerCase();
        char[] chars = lowerCaseInput.toCharArray();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (chars[i] == 'x') {
                a++;
            } else if (chars[i] == 'o') {
                b++;
            }
        }
        return a == b;
    }
}