package com.epam.training.SunnatillaSamatov.abstractclasses.figuresextra;

class Triangle extends Figure {

	private double x1 ;
	private double y1 ;
	private double x2 ;
	private double y2 ;
	private double x3 ;
	private double y3 ;

	public Triangle(Point a, Point b, Point c) {

		if(a==null | b==null | c==null){
			throw new IllegalArgumentException("Null point exists");
		}
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

	public Point centroid(){

		return new Point(((double) 1/3)*(x1+x2+x3),((double) 1/3)*(y1+y2+y3));
	}

	@Override
	public boolean isTheSame(Figure figure) {
		boolean output = false;
		int counter =0;
		double delta =0.0001;
		if(figure instanceof Triangle){
			Triangle q = (Triangle) figure;
			double[][] qpoints = { {q.x1,q.y1},{q.x2,q.y2},{q.x3,q.y3} };
			double[][] thispoints = { {x1,y1}, {x2,y2}, {x3,y3} };
			for (int i = 0; i < qpoints.length; i++) {
				for (int j = 0; j < qpoints.length; j++) {
					if(Math.abs(thispoints[i][0] - qpoints[j][0])<=delta && Math.abs( thispoints[i][1]-qpoints[j][1])<=delta){
						counter+=1;
						break;
					}
				}

			}
			if(counter==3){
				output=true;
			}
		}

		return output;


	}


}
