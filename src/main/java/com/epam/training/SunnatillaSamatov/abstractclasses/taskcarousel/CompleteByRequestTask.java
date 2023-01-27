package com.epam.training.SunnatillaSamatov.abstractclasses.taskcarousel;

public class CompleteByRequestTask implements Task {
    private boolean isFinished;
    private boolean isCompleted;

    @Override
    public void execute() {

        if(isCompleted){
            isFinished=true;
        }
    }

    @Override
    public boolean isFinished() {

        return isFinished;
    }

    public void complete() {

        isCompleted=true;
    }
}
