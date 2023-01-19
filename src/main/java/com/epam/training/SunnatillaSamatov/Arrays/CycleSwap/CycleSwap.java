package com.epam.training.SunnatillaSamatov.Arrays.CycleSwap;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length!=0){
            int lastElement = array[array.length-1];
            System.arraycopy(array,0,array,1,array.length-1);
            array[0]=lastElement;
        }

    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length!=0){
            int[] lastShiftingElements = Arrays.copyOfRange( array, array.length-shift, array.length);
            int[] initialShiftingElements = Arrays.copyOfRange( array, 0, array.length-shift);

            System.arraycopy(lastShiftingElements, 0, array, 0, lastShiftingElements.length);

            System.arraycopy(initialShiftingElements, 0, array, lastShiftingElements.length, initialShiftingElements.length);

        }


    }
}
