package com.epam.training.SunnatillaSamatov.generics.beawaredogs.house;

import java.util.ArrayList;
import java.util.List;

public class House<Object> {

    private final List<Object>  residents = new ArrayList<>() ;

    public void enter(Object resident) {
        if(residents.size()==0){
            residents.add(resident);
        }else{
            if(residents.get(0).getClass().equals(resident.getClass().getSuperclass())){
                residents.add(resident);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
