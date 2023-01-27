package com.epam.training.SunnatillaSamatov.OOP.halvingCarousel;

public class NewCarouselRun extends CarouselRun{


	public NewCarouselRun(int[] carousel) {
		super(carousel);
	}

	public boolean isFinished() {
		return super.isFinished();
	}

	@Override
	public int next() {
		int output=-1;

		while(!isFinished() && output==-1){
			output = this.itarateLoop();
			if (output==-1){
				super.startIndex=0;
			}
		}

		return output;
	}

	public int itarateLoop(){
		int output=-1;

		if(startIndex==carouselArray.length){
			startIndex=0;
		}

		for (int i = startIndex; i < carouselArray.length; i++) {
			if(carouselArray[i]!=0){

				output=carouselArray[i];
				carouselArray[i]=carouselArray[i]/2;
				startIndex=i+1;
				break;
			}

		}
		return output;
	}
}
