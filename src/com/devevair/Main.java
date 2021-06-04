package com.devevair;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hurra my first java app");
        int number = 100;   // long, double, byte, short, float
        String name = "Developer"; //boolean, char
        Date date = new Date(); // this need to import java.util.Date
        byte theByte = -128;
        short theShort = 8989;
        long theLong = 78783833432L;
        boolean is = true;
        char nameInitial = 'E';
        float theFloat = 3.14F;

        String dev = new String("developer");
        System.out.println(dev.toUpperCase());
        System.out.println(dev.charAt(1));
        String code = "dev"
        System.out.println(dev.contains("dev")); // this is a boolean
        System.out.println(code.equals(dev)); //this is a boolean
        LocalDate now = LocalDate.now();  // you need to import java.time.LocalDate
        System.out.println(now.getMonth());

    }
}
