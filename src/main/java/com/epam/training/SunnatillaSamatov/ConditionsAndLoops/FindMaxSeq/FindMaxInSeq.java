package com.epam.training.SunnatillaSamatov.ConditionsAndLoops.FindMaxSeq;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        // Put your code here
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int maxValue=input;
        do{
            if(input==0){
                break;
            }else if(input>maxValue){
                maxValue=input;
            }
            input = sc.nextInt();
        }while(true);

        return maxValue;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
