package org.nnn4eu.nfishe;

import java.util.List;
import java.util.stream.Collectors;

public class PasswordCheckerStream {

    public static final String specialChars="-_(){}[].,";

    public static boolean checkHasWhiteChars(String pass){
        return pass.matches("\\S+");
    }
    public static boolean checkAll( String pass, int min){
        char o='1';
        char[] flag="0000".toCharArray();
        if(!checkHasWhiteChars(pass)) return false;
        if(!checkLength(pass,min)) return false;
        List<Character> charsStart = pass.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        charsStart.stream()
                .forEach(a->{
                    flag[0]=(Character.isUpperCase(a))?o:flag[0];
                    flag[1]=(Character.isLowerCase(a))?o:flag[1];
                    flag[2]=(Character.isDigit(a))?o:flag[2];
                    flag[3]=(specialChars.contains(String.valueOf(a)))?o:flag[3];
                });
        return "1111".equals(new String(flag));
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
