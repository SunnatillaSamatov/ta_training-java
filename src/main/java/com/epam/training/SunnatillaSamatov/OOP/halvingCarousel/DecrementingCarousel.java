package com.epam.training.SunnatillaSamatov.OOP.halvingCarousel;

import java.util.Arrays;

public class DecrementingCarousel {
    int maxCarouselCapacity;
    boolean accumulatingState=true;

    int counter = 0;
    int[] carousel;


    public DecrementingCarousel(int capacity) {
        super();
        if(capacity>0){
            maxCarouselCapacity = capacity;
            carousel = new int[capacity];
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


        int index = Arrays.binarySearch(carousel,0);
        if(!(index<maxCarouselCapacity && index>0)){
            index = maxCarouselCapacity;
        }
        int[] carouselArray = new int[index];
        System.arraycopy(carousel,0,carouselArray,0,index);

        if(accumulatingState){
            CarouselRun carouselRun = new CarouselRun(carouselArray);
            accumulatingState=false;
            return carouselRun;
        }else{
            return null;
        }

    }

}
