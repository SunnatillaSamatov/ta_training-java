package com.epam.training.SunnatillaSamatov.OOP.graduallyDecreasingCarousel;

public class NewCarouselRun extends CarouselRun{

	int gradualIncrementCounter = 1;
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
				gradualIncrementCounter+=1;
			}
		}

		return output;
	}

	public int itarateLoop(){
		int output=-1;

		if(startIndex==carouselArray.length){
			startIndex=0;
			gradualIncrementCounter+=1;
		}

		for (int i = startIndex; i < carouselArray.length; i++) {
			if(carouselArray[i]>0){

				output=carouselArray[i];
				carouselArray[i]=carouselArray[i]-gradualIncrementCounter;

				startIndex=i+1;
				break;
			}

		}
		return output;
	}


}
