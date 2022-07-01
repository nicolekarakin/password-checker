package org.nnn4eu.nfishe;

import java.util.List;
import java.util.stream.Collectors;

public class PasswordCheckerStream {

    public static final String specialChars="-_(){}[].,";

    public static boolean checkHasWhiteChars(String pass){
        return pass.matches("\\S+");
    }
    public static boolean checkAll( String pass, int min){
        if(!checkHasWhiteChars(pass)) return false;
        List<Character> charsStart = pass.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> chars = charsStart.stream()
                .filter(a -> Character.isUpperCase(a)||Character.isLowerCase(a)||Character.isDigit(a)||specialChars.contains(String.valueOf(a)))
                .collect(Collectors.toList());
        return !chars.isEmpty() && checkLength(pass,min);
    }
    public static boolean checkUpperCase(String pass) {
        List<Character> charsStart = pass.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> chars = charsStart.stream()
                .filter(a -> Character.isUpperCase(a))
                .collect(Collectors.toList());
        return !chars.isEmpty();
    }

    public static boolean checkDigits(String pass) {
        List<Character> charsStart = pass.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> chars = charsStart.stream()
                .filter(a -> Character.isDigit(a))
                .collect(Collectors.toList());
        return !chars.isEmpty();

    }

    public static boolean checkLowerCase(String pass) {
        List<Character> charsStart = pass.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> chars = charsStart.stream()
                .filter(a -> Character.isLowerCase(a))
                .collect(Collectors.toList());
        return !chars.isEmpty();
    }

    public static boolean checkSpecialChar(String pass) {

        List<Character> charsStart = pass.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> chars = charsStart.stream()
                .filter(a ->specialChars.contains(String.valueOf(a)))
                .collect(Collectors.toList());
        return !chars.isEmpty();
    }

    public static boolean checkLength(String pass, int min) {
        return pass.length()>=min;
    }
}
