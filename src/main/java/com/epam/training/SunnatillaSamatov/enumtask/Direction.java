package com.epam.training.SunnatillaSamatov.enumtask;

import java.util.Optional;

import static java.lang.Math.abs;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {

        if(degrees>=360) degrees=degrees%360;
        else if (degrees<0) degrees=degrees+360;


        switch (degrees){

            case 0:
                return  Direction.N;
            case 45:
                return Direction.NE;
            case 90:
                return Direction.E;
            case 135:
                return Direction.SE;
            case 180:
                return Direction.S;
            case 225:
                return Direction.SW;
            case 270:
                return Direction.W;
            case 315:
                return Direction.NW;
            default:
                return null;
        }

    }

    public static Direction closestToDegrees(int degrees) {
        if(degrees>=360) degrees=degrees%360;
        else if (degrees<0) degrees=degrees+360;

        if(degrees<=22) degrees=0;
        else if (degrees>=23 && degrees<=67) degrees=45;
        else if (degrees>=68 && degrees<=112) degrees=90;
        else if (degrees>=113 && degrees<=157) degrees=135;
        else if (degrees>=158 && degrees<=202) degrees=180;
        else if (degrees>=203 && degrees<=247) degrees=225;
        else if (degrees>=248 && degrees<=292) degrees=270;
        else if (degrees>=293 && degrees<=337) degrees=315;
        else if (degrees>=338 && degrees<=359) degrees=0;
        return Direction.ofDegrees(degrees);
    }

    public Direction opposite() {
        if(degrees>=360) degrees=degrees%360;
        else if (degrees<0) degrees=degrees+360;

        switch (degrees){
            case 0:
                return  Direction.S;
            case 45:
                return Direction.SW;
            case 90:
                return Direction.W;
            case 135:
                return Direction.NW;
            case 180:
                return Direction.N;
            case 225:
                return Direction.NE;
            case 270:
                return Direction.E;
            case 315:
                return Direction.SE;
            default:
                return null;
        }
    }

    public int differenceDegreesTo(Direction direction) {

        if(this.degrees!=0 && direction.degrees!=0){

            return abs(this.degrees-direction.degrees);

        }else {

            int difference1 = abs(this.degrees-direction.degrees);

            int thisDegree=0;
            int directionDegree=0;

            if(this.degrees==0) thisDegree=360;
            else thisDegree=this.degrees;

            if(direction.degrees==0) directionDegree=360;
            else directionDegree=direction.degrees;

            int difference2 = abs(thisDegree-directionDegree);

            return Math.min(difference2,difference1);
        }

    }
}
