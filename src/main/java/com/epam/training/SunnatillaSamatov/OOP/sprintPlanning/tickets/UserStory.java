package com.epam.training.SunnatillaSamatov.OOP.sprintPlanning.tickets;

import java.util.Arrays;

public class UserStory extends Ticket {

    private UserStory[] userStories;
    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        userStories = new UserStory[dependsOn.length];
        System.arraycopy(dependsOn,0,userStories,0,dependsOn.length);


    }

    @Override
    public void complete() {
        int incomplete=0;
        for (UserStory userStory:this.getDependencies()) {
            if(!userStory.isCompleted()){
                incomplete+=1;
            }
        }
        if(incomplete==0){
            super.complete();
        }


    }

    public UserStory[] getDependencies() {
        UserStory[] userStoryCopies = new UserStory[userStories.length];
        System.arraycopy(userStories,0,userStoryCopies,0,userStories.length);
        return userStoryCopies;
    }

    @Override
    public String toString() {
        return "[US "+super.getId()+"] "+super.getName();
    }


}
