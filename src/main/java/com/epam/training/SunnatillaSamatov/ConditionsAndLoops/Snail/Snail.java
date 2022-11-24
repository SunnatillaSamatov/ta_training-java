package com.epam.training.SunnatillaSamatov.ConditionsAndLoops.Snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if(h>a && a>b){
            System.out.println((h-a)/(a-b)+1);
        }
        if((a==b || b>a) && a<h){
            System.out.println("Impossible");
        }
        if(  a>=h){
            System.out.println(1);
        }
    }
}
