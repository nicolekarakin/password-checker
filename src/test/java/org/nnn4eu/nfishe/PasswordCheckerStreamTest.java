package org.nnn4eu.nfishe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordCheckerStreamStreamTest {

    @Test
    void checkLength(){
        //given
        int min = 5;
        String pass ="12345";
        //when
        boolean actual=PasswordCheckerStream.checkLength(pass,min);
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
        boolean actual=PasswordCheckerStream.checkDigits(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkUpperCase(){
        //given
        String pass ="asDfg";
        //when
        boolean actual=PasswordCheckerStream.checkUpperCase(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkUpperCase_Fail(){
        //given
        String pass ="assfg";
        //when
        boolean actual=PasswordCheckerStream.checkUpperCase(pass);
        boolean expected=false;
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void checkLowerCase(){
        //given
        String pass ="asDfg";
        //when
        boolean actual=PasswordCheckerStream.checkLowerCase(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkSpecialChar(){
        //given
        String pass ="asDfg_";
        //when
        boolean actual=PasswordCheckerStream.checkSpecialChar(pass);
        boolean expected=true;
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkSpecialChar_False(){
        //given
        String pass ="asDfgyutw8678";
        //when
        boolean actual=PasswordCheckerStream.checkSpecialChar(pass);
        boolean expected=false;
        //then
        Assertions.assertEquals(expected,actual);
    }

}
