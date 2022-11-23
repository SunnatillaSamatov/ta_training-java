package com.epam.training.SunnatillaSamatov.DataTypes;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour =seconds/3600;
        int min = (seconds-hour*3600)/60;
        int second = seconds-hour*3600-min*60;
        hour =(hour>=24)?0:hour;

        System.out.println(hour+":"+min/10+min%10+":"+second/10+second%10);


    }
}
