package org.nnn4eu.nfishe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings={"absd7S.","HGFz5-","terw_dj8Z"})
    void checkAll(String s){
        Assertions.assertTrue(PasswordCheckerStream.checkAll(s,5));
    }

    @ParameterizedTest
    @ValueSource(strings={"absd7s.","HGFz578","terw_djqZ","wuzrtw","aA7-"})
    void checkAll_False(String s){
        Assertions.assertFalse(PasswordCheckerStream.checkAll(s,5));
    }

}
