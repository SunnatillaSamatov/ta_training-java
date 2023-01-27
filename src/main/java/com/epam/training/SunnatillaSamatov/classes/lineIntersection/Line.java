package com.epam.training.SunnatillaSamatov.classes.lineIntersection;

public class Line {
    int k;
    int b;
    public Line(int k, int b) {
        this.k=k;
        this.b=b;
    }

    public Point intersection(Line other) {
        if (this.k==other.k){
            return null;
        }else{
            return new Point((other.b-this.b)/(this.k-other.k), (this.k*other.b-this.b*other.k)/(this.k-other.k) );

        }

    }

}
