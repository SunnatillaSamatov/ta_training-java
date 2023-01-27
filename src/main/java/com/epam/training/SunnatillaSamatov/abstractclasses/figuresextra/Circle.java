package com.epam.training.SunnatillaSamatov.abstractclasses.figuresextra;

class Circle extends Figure{

	private double x1;
	private double y1;
	private double Radius;

	public double getX1() {
		return x1;
	}

	public double getY1() {
		return y1;
	}

	public double getRadius() {
		return Radius;
	}

	public Circle(Point point1, double Radius){
		if(point1==null |  Radius<=0){
			throw new IllegalArgumentException("Error inputs");
		}else{
			this.x1=point1.getX();
			this.y1=point1.getY();
			this.Radius=Radius;
		}
	}
	public Point centroid(){
		return new Point(x1,y1);
	}

	@Override
	public boolean isTheSame(Figure figure)  {
		boolean output=false;

		double delta = 0.000001d;
		if(figure instanceof Circle){
			Circle circle = (Circle) figure;
			if(Math.abs(circle.getX1()-this.getX1())<=delta && Math.abs(circle.getY1()-this.getY1())<=delta && Math.abs(circle.getRadius()-this.getRadius())<=delta){
				output= true;
			}
		}

		return output;
	}


}
