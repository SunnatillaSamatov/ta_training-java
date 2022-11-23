package com.epam.training.SunnatillaSamatov.FirstProgramsInJava.meet_strangers;


import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner sc = new Scanner(System.in);
        int numberInput = sc.nextInt();
        if(numberInput>0){
            String[] stringInput = new String[numberInput];
            sc.nextLine();
            for (int i = 0; i < numberInput; i++) {
                stringInput[i]=sc.nextLine();
            }

            for (String item:stringInput) {
                System.out.println("Hello, "+item);
            }

        }else if(numberInput==0){
            System.out.println("Oh, it looks like there is no one here");
        }else {
            System.out.println("Seriously? Why so negative?");
        }

    }
}
