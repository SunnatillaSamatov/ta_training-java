package com.epam.training.SunnatillaSamatov.OOP.sprintPlanning.tickets;

public class Ticket {
    private int id;
    private String name;
    private int estimate;
    private boolean complete=false;
    public Ticket(int id, String name, int estimate) {
        this.id=id;
        this.name=name;
        this.estimate=estimate;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isCompleted() {
        return this.complete;
    }

    public void complete() {
         this.complete=true;
    }

    public int getEstimate() {
        return this.estimate;
    }
}
