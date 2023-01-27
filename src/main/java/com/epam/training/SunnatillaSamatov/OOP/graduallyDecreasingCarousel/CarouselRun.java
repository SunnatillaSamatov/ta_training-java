package com.epam.training.SunnatillaSamatov.OOP.graduallyDecreasingCarousel;

public class CarouselRun {

     int[] carouselArray;
     int startIndex = 0;

    public CarouselRun(int[] carousel) {
        carouselArray = new int[carousel.length];
        System.arraycopy(carousel,0,carouselArray,0,carousel.length);
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
            if (item<=0){
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


    public int itarateLoop(){
        int output=-1;

        if(startIndex==carouselArray.length){
            startIndex=0;
        }

        for (int i = startIndex; i < carouselArray.length; i++) {
            if(carouselArray[i]!=0){

                output=carouselArray[i];
                carouselArray[i]=carouselArray[i]-1;
                startIndex=i+1;
                break;
            }

        }
        return output;
    }

    public void print(){
        for (int item:carouselArray
        ) {
            System.out.println(item);
        }
    }

}
