package org.nnn4eu.nfishe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordChecker {

    public static boolean checkUpperCase(String pass) {
        char ch;
        boolean ok = false;
        for (int i = 0; i < pass.length() && !ok; i++) {
            ch = pass.charAt(i);
            if (Character.isUpperCase(ch)) {
                ok = true;
            }
        }
        return ok;
    }


    public static boolean checkDigits(String pass) {
        char ch;
        boolean ok = false;
        for (int i = 0; i < pass.length() && !ok; i++) {
            ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                ok = true;
            }
        }
        return ok;
    }

    public static boolean checkLowerCase(String pass) {
        char ch;
        boolean ok = false;
        for (int i = 0; i < pass.length() && !ok; i++) {
            ch = pass.charAt(i);
            if (Character.isLowerCase(ch)) {
                ok = true;
            }
        }
        return ok;
    }

    public static boolean checkSpecialChar(String pass) {
        String specialChars="-_(){}[].,";
        char ch;
        boolean ok = false;
        for (int i = 0; i < pass.length() && !ok; i++) {
            ch = pass.charAt(i);
            if (specialChars.contains(String.valueOf(ch))) {
                ok = true;
            }
        }
        return ok;
    }

    public static boolean checkLength(String pass, int min) {
        return pass.length()>=min;
    }
}
