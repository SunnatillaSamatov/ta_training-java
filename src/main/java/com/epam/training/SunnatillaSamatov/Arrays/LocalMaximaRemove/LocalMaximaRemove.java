package com.epam.training.SunnatillaSamatov.Arrays.LocalMaximaRemove;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){


        boolean[] boolArray = new boolean[array.length];
        int counter = 0;
        int j = 0;
        if(array[0]>array[1]){
            boolArray[0]=true;
            counter+=1;
        }
        if(array[array.length-1]>array[array.length-2]){
            boolArray[array.length-1] = true;
            counter+=1;
        }
        for (int i = 1; i < array.length-1 ; i++) {

            if(array[i] > array[i-1] && array[i] > array[i+1]){
                boolArray[i]=true;
                counter+=1;
            }
        }
        if(counter==0){
            return array;
        }else {
            int [] newArray= new int[array.length-counter];
            for (int i = 0; i < array.length; i++) {
                if(!boolArray[i]){
                    newArray[j]=array[i];
                    j++;
                }
            }

            return newArray;
        }

    }
}
