package com.epam.training.SunnatillaSamatov.abstractclasses.taskcarousel;

public class CountDownTask implements Task{
    private int initialValue;
    public CountDownTask(int value) {

        if(value<0){
            this.initialValue=0;
        }else {
            this.initialValue=value;
        }
    }

    public int getValue() {
        return this.initialValue;
    }


    @Override
    public void execute() {
        if(this.initialValue!=0){
            this.initialValue-=1;
        }
    }

    @Override
    public boolean isFinished() {

        if(this.initialValue==0){
            return true;
        }else{
            return false;
        }
    }
}
