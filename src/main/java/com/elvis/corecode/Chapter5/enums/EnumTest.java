package com.elvis.corecode.Chapter5.enums;

import java.util.Scanner;

public class EnumTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:SMALL,MEDIUM,LARGE,EXTRA_LARGE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if(size == Size.EXTAL_LARGE) {
            System.out.println("Good job--you paid attention to the_.");
        }
    }

}

enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTAL_LARGE("XL");
    
    private String abbreviation;

    private Size(String pAbbreviation) {
        abbreviation = pAbbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
    
}