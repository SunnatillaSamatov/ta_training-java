package com.epam.training.SunnatillaSamatov.OOP.sprintPlanning;


import com.epam.training.SunnatillaSamatov.OOP.sprintPlanning.tickets.Bug;
import com.epam.training.SunnatillaSamatov.OOP.sprintPlanning.tickets.Ticket;
import com.epam.training.SunnatillaSamatov.OOP.sprintPlanning.tickets.UserStory;

public class Sprint {

    private int capacity;
    private int ticketsLimit;

    private Ticket[] tickets;

    private int counter=0;

    public Sprint(int capacity, int ticketsLimit) {

        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
        tickets = new Ticket[ticketsLimit];

    }

    public boolean addUserStory(UserStory userStory) {
       if (userStory==null || userStory.isCompleted()) {
           return false;
       }else if(userStory.getEstimate()+getTotalEstimate()<=capacity && getTickets().length +1 <= ticketsLimit){
           int incomplete=0;
           boolean output = false;
           for (UserStory userStoryy:userStory.getDependencies()) {
               if(!userStoryy.isCompleted()){
                   incomplete+=1;

               }
           }

           if(incomplete==0){
               userStory.complete();
               tickets[counter]=userStory;
               counter+=1;
               output = true;

           }
           return output;
       } else return false;
    }

    public boolean addBug(Bug bugReport) {
        if(bugReport==null || bugReport.isCompleted()) {
            return false;
        }else if(bugReport.getEstimate()+getTotalEstimate()<=capacity && getTickets().length +1 <= ticketsLimit){
            tickets[counter]=bugReport;
            counter+=1;
            return true;
        }else return false;
    }

    public Ticket[] getTickets() {
        int index = 0;
        for (Ticket ticket:tickets) {
            if (ticket==null){
                break;
            }else index+=1;
        }
        Ticket[] ticketsCopy = new Ticket[index];
        System.arraycopy(tickets,0,ticketsCopy,0,index);
        return ticketsCopy;
    }

    public int getTotalEstimate() {
        int sum=0;
        for (Ticket ticket:this.getTickets()) {
            sum+=ticket.getEstimate();
        }
        return sum;
    }
}
