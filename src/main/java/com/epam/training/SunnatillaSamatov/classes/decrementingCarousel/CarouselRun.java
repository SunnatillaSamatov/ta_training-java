package com.epam.training.SunnatillaSamatov.classes.decrementingCarousel;

import java.util.Arrays;

public class CarouselRun  {

    private int[] carouselArray;
    int startIndex = 0;


   public CarouselRun( ){

   }

    public CarouselRun(int[] carousel,int maxCarouselCapacity) {

        int indx = Arrays.binarySearch(carousel,0);
        if(indx<maxCarouselCapacity && indx>0){
            carouselArray = new int[indx];
            System.arraycopy(carousel,0,carouselArray,0,indx);
        }else {
            carouselArray = new int[maxCarouselCapacity];
            System.arraycopy(carousel,0,carouselArray,0,maxCarouselCapacity);
        }

    }

    public int next() {
        int output=-1;

        while(!isFinished() && output==-1){
            output = this.itarateLoop();
            if (output==-1){
                startIndex=0;
            }
        }

       return output;
    }

    public boolean isFinished() {

        int allZeroValueCounter = 0;

        for (int item:carouselArray) {
            if (item==0){
                allZeroValueCounter=allZeroValueCounter+1;
            }
        }
        if (allZeroValueCounter==carouselArray.length){
            return true;
        }
        else {
            return false;
        }
    }

    public void print(){
        for (Integer item:carouselArray) {
            System.out.println(item);
        }
    }

    public int itarateLoop(){
       int output=-1;

        if(startIndex==carouselArray.length){
            startIndex=0;
        }

        for (int i = startIndex; i < carouselArray.length; i++) {
            System.out.println("Start Index "+i);
            if(carouselArray[i]!=0){

                output=carouselArray[i];
                carouselArray[i]=carouselArray[i]-1;
                startIndex=i+1;
                break;
            }

        }
        return output;
    }


}
