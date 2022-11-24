package com.epam.training.SunnatillaSamatov.ConditionsAndLoops.GoDutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        if(bill<0){
            System.out.println("Bill total amount cannot be negative");
        }else{
            int numberOfFriends = sc.nextInt();
            if(numberOfFriends==0 || numberOfFriends<0){
                System.out.println("Number of friends cannot be negative or zero");
            }else {
                int billWithTip = (int) (bill*1.1);
                System.out.println(billWithTip/numberOfFriends);
            }
        }

    }
}
