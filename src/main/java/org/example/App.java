
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;


import java.util.Calendar;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String strage = scan.next();

        System.out.print("At what age would you like to retire? ");
        String strretireage = scan.next();

        int age1 = Integer.parseInt(strage);
        int age2 = Integer.parseInt(strretireage);

        int total = age2 - age1;

        int year = Calendar.getInstance().get(Calendar.YEAR);

        int totalyear = year + total;

        System.out.print("You have "+total+" years left until you can retire.\n");
        System.out.print("It's "+year+", so you can retire in "+totalyear+".");




    }
}
