package org.nnn4eu.nfishe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void checkLength(){
        //given
        int min = 5;
        String pass ="12345";
        //when
        boolean actual=PasswordChecker.checkLength(pass,min);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkDigits(){
        //given
        int min = 5;
        String pass ="12345";
        //when
        boolean actual=PasswordChecker.checkDigits(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkUpperCase(){
        //given
        String pass ="asDfg";
        //when
        boolean actual=PasswordChecker.checkUpperCase(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkLowerCase(){
        //given
        String pass ="asDfg";
        //when
        boolean actual=PasswordChecker.checkLowerCase(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkSpecialChar(){
        //given
        String pass ="asDfg_";
        //when
        boolean actual=PasswordChecker.checkSpecialChar(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }

}
