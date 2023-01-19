package com.epam.training.SunnatillaSamatov.Arrays.MaxMethod;

public class MaxMethod {
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int element:values) {
            if(element>maxValue){
                maxValue=element;
            }
        }

        return maxValue;
    }
}
