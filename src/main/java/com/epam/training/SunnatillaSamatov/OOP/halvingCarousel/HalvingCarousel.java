package com.epam.training.SunnatillaSamatov.OOP.halvingCarousel;

import java.util.Arrays;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    public boolean addElement(int element){
        return super.addElement(element);
    }

    @Override
    public CarouselRun run(){
        int index = Arrays.binarySearch(super.carousel,0);
        if(!(index<maxCarouselCapacity && index>0)){
            index = maxCarouselCapacity;
        }
        int[] carouselArray = new int[index];
        System.arraycopy(super.carousel,0,carouselArray,0,index);

        if(super.accumulatingState){
            NewCarouselRun carouselRun = new NewCarouselRun(carouselArray);
            super.accumulatingState=false;
            return carouselRun;
        }else{
            return null;
        }
    }





}
