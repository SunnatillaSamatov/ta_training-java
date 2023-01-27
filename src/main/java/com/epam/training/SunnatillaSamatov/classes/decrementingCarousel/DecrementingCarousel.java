package com.epam.training.SunnatillaSamatov.classes.decrementingCarousel;



public class DecrementingCarousel {
    int maxCarouselCapacity;
    boolean accumulatingState=true;
    boolean runningState = false;
    boolean createCarouselRun =true;
    int counter = 0;
    int[] carousel;


    public DecrementingCarousel(int capacity) {
        if(capacity>0){
            maxCarouselCapacity=capacity;
            carousel = new int[maxCarouselCapacity];
        }else {
            throw new IllegalArgumentException("Illegal argument is inserted");
        }

    }

    public boolean addElement(int element){
        if(counter<maxCarouselCapacity && accumulatingState && element>0){
            carousel[counter]=element;
            counter+=1;
            return true;
        }else {
            return false;
        }

    }

    public CarouselRun run(){
       accumulatingState=false;
       runningState=true;
       if(createCarouselRun){
           CarouselRun carouselRun = new CarouselRun( carousel, maxCarouselCapacity);
           createCarouselRun=false;
           return carouselRun;
       }else{
           return null;
       }

    }
}
