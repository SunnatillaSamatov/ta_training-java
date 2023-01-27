package com.epam.training.SunnatillaSamatov.abstractclasses.taskcarousel;

import java.util.ArrayList;
import java.util.List;

public class TaskCarousel {

    private int capacity;
    private List<Task> tasks;
    private int executeCounter=0;

    public TaskCarousel(int capacity) {
        if(capacity>0){
            this.capacity=capacity;
            this.tasks = new ArrayList<>();

        }
    }

    public boolean addTask(Task task) {

        if(task==null || task.isFinished() || this.isFull() ){
            return false;
        } else{
            tasks.add(task);

            return true;
        }

    }

    public boolean execute() {
        if(executeCounter>=tasks.size()){
            executeCounter=0;
        }

        if(isEmpty()){
            return false;
        } else {
            Task task = tasks.get(executeCounter);
            task.execute();
            if(task.isFinished()) tasks.remove(executeCounter);
            else executeCounter++;


            return true;
        }

    }

    public boolean isFull() {

        return tasks.size()==capacity;

    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

}
