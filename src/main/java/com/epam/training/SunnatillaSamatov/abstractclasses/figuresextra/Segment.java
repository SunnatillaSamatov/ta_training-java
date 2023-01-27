package com.epam.training.SunnatillaSamatov.abstractclasses.figuresextra;

class Segment {
    double startX;
    double startY;
    double endX;
    double endY;
    public Segment(Point start, Point end) {
        if(start.getX()==end.getX() && start.getY()==end.getY()){
            throw new IllegalArgumentException("The same end points");
        }
        this.startX=start.getX();
        this.startY=start.getY();
        this.endX=end.getX();
        this.endY=end.getY();
    }

    double length() {
        return Math.sqrt(Math.pow(endX-startX,2)+Math.pow(endY-startY,2));

    }

    Point middle() {
        return new Point((startX+endX)/2,(startY+endY)/2);
    }

    Point intersection(Segment another) {
        double denominator,Px=0,Py=0;
        double x1 =this.startX;
        double y1 =this.startY;
        double x2 =this.endX;
        double y2 =this.endY;

        double x3 =another.startX;
        double y3 =another.startY;
        double x4 =another.endX;
        double y4 =another.endY;
        double t,u;
        denominator = ( x1-x2 )*( y3-y4 )- ( y1-y2 )*( x3-x4 );
        if(denominator==0){
            return null;
        }
        t= ( (x1-x3)*(y3-y4) - (y1-y3)*(x3-x4) )/denominator;
        u= ( (x1-x3)*(y1-y2) - (y1-y3)*(x1-x2) )/denominator;
        if(t>=0 && t<=1 && u>=0 && u<=1){
            Px = x1+t*(x2-x1);
            Py = y1+t*(y2-y1);

        }else return null;

        return new Point(Px,Py);
    }

}
