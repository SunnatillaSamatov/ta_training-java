package com.epam.training.SunnatillaSamatov.ConditionsAndLoops.PizzaSplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        int numberOfPieces = sc.nextInt();
        int sum = numberOfPieces;
        while (true){
            if(sum%numberOfPeople==0){
                break;
            }else {
                sum = sum +numberOfPieces;
            }

        }
        System.out.println(sum/numberOfPieces);

    }
}
