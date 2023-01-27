package com.epam.training.SunnatillaSamatov.classes.triangle;

class Triangle {
    private double x1 ;
    private double y1 ;
    private double x2 ;
    private double y2 ;
    private double x3 ;
    private double y3 ;
    public Triangle(Point a, Point b, Point c) {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        if( (x3-x2)*(y2-y1)==(x2-x1)*(y3-y2)){
            throw new IllegalArgumentException("Result: Exception because such a triangle would be degenerative.");
        }else {
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
            this.x3=x3;
            this.y3=y3;

        }
    }

    public double area() {
        return 0.5*Math.abs( (x1-x3)*(y2-y1) - (x1-x2)*(y3-y1) );
    }

    public Point centroid(){
        return new Point(((double) 1/3)*(x1+x2+x3),((double) 1/3)*(y1+y2+y3));
    }

}
