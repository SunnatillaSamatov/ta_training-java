package com.epam.training.SunnatillaSamatov.optional;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {

        if(values != null && values.length>0){
            int max=values[0];
            for (int item:values) {
                if(item>max) max = item;
            }
            return OptionalInt.of(max);
        }else {
            return OptionalInt.empty();
        }


    }
}
