package com.epam.training.SunnatillaSamatov.abstractclasses.figures;

class Circle extends Figure{

	private double x1;
	private double y1;
	private double Radius;



	public Circle(Point point1, double doubleRadius){
		this.x1=point1.getX();
		this.y1=point1.getY();
		this.Radius=doubleRadius;
	}
	@Override
	public double area() {

		return Math.PI*Radius*Radius;
	}

	@Override
	public String pointsToString() {
		return  "(" +x1+","+y1+")";
	}


	@Override
	public String toString() {
		return "Circle[" +
				"(" + x1 +
				"," + y1 +
				")" + Radius +
				"]";
	}

	@Override
	public Point leftmostPoint() {
		return new Point(x1-Radius,y1);
	}



}
