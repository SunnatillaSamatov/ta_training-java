package com.epam.training.SunnatillaSamatov.ConditionsAndLoops.Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int counter = 0;
        int sum = 0;
        do{
            int input = scanner.nextInt();
            if(input==0){
                break;
            }
            sum = sum + input;
            counter++;

        }while(true);
        System.out.println(sum/counter);
    }

}