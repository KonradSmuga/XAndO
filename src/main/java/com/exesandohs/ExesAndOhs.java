package com.exesandohs;

public class ExesAndOhs {

    public boolean checkXO(String input) {
        int a = 0;
        int b = 0;

        String lowerCaseInput = input.toLowerCase();
        for (int i = 0; i <= lowerCaseInput.length() - 1; i++) {

            char[] chars = lowerCaseInput.toCharArray();
            if (chars[i] == 'x') {
                a++;

            } else if (chars[i] == 'o') {
                b++;
            }
        }
        if (a == b) {
            return true;
        }

        System.out.println(a);
        System.out.println(b);
        return false;

    }

}
