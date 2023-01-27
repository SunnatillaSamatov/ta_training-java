package com.epam.training.SunnatillaSamatov.OOP.graduallyDecreacingCarouselWithLimit;

public class NewCarouselRun extends CarouselRun{

	int gradualIncrementCounter = 1;
	int runLimit=0;
	int actionLimit;
	public NewCarouselRun(int[] carousel, int actionLimit) {

		super(carousel);
		this.actionLimit=actionLimit;
	}
	@Override
	public boolean isFinished() {
		int allZeroValueCounter = 0;

		for (int item:carouselArray) {
			if (item<=0){
				allZeroValueCounter=allZeroValueCounter+1;
			}
		}
		if (allZeroValueCounter==carouselArray.length || runLimit==actionLimit){
			return true;
		}
		else {
			return false;
		}

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
			if(carouselArray[i]>0){

				output=carouselArray[i];
				carouselArray[i]=carouselArray[i]-1;
				runLimit+=1;
				startIndex=i+1;
				break;
			}

		}
		return output;
	}


}
