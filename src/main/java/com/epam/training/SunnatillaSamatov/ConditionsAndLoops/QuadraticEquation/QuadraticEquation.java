package com.epam.training.SunnatillaSamatov.ConditionsAndLoops.QuadraticEquation;

import java.util.Locale;
import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = Math.sqrt(b*b-4*a*c);
        if(D>0){
            System.out.println((-b-D)/(2*a) +" "+(-b+D)/(2*a));
        }else if (D==0) {
            System.out.println((-b-D)/(2*a));
        }else{
            System.out.println("no roots");
        }

    }

}