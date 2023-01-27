package com.epam.training.SunnatillaSamatov.abstractclasses.figures;

class Triangle extends Figure{

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;

	public Triangle(Point point1, Point point2, Point point3){
		this.x1=point1.getX();
		this.y1=point1.getY();
		this.x2=point2.getX();
		this.y2=point2.getY();
		this.x3=point3.getX();
		this.y3=point3.getY();

	}
	@Override
	public double area() {

		double xa=this.x1;
		double ya=this.y1;
		double xb=this.x2;
		double yb=this.y2;
		double xc=this.x3;
		double yc=this.y3;

		return 0.5*(Math.abs( (xa-xc)*(yb-ya) - (xa-xb)*(yc-ya)) );
	}

	@Override
	public String pointsToString() {
		return  "(" +x1+","+y1+")"+
				"(" +x2+","+y2+")"+
				"(" +x3+","+y3+")";
	}

	public String toString(){

		return super.toString();
	}

	@Override
	public Point leftmostPoint() {
		Point[] points = {new Point(x1,y1),new Point(x2,y2),new Point(x3,y3)};
		Point minPoint =points[0];
		for (Point point:points) {
			if(point.getX()<minPoint.getX()){
				minPoint=point;
			}
		}

		return minPoint;
	}

}
