package org.nnn4eu.nfishe;

import java.util.Scanner;

public class PassInput {

    public static String input(int min){
        System.out.print("Pass should be:\n at least "+min+" characters long \nhave upper and lower case letters \nat least one of -_(){}[].,\n");
        boolean ok=false;
        String pass="";
        Scanner scan = new Scanner(System.in);
        while(!ok){
            System.out.print("Enter a valid pass : \n");
            pass=scan.nextLine();
            ok=PasswordCheckerStream.checkAll(pass,min);
        }
        return pass;
    }


}
