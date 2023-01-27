package com.epam.training.SunnatillaSamatov.abstractclasses.figuresextra;

class Quadrilateral extends Figure{

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;

	public Quadrilateral(Point point1, Point point2,Point point3, Point point4){

		checkPointsForNull(point1, point2, point3, point4);
		checkPointsForCoincidence(point1, point2, point3, point4);
		checkInternalAngleForConvex(point1, point2, point3, point4);

		double denominator,t,u;
		double x1 =point1.getX();
		double y1 =point1.getY();
		double x2 =point3.getX();
		double y2 =point3.getY();

		double x3 =point2.getX();
		double y3 =point2.getY();
		double x4 =point4.getX();
		double y4 =point4.getY();

		denominator = ( x1-x2 )*( y3-y4 )- ( y1-y2 )*( x3-x4 );
		if(denominator!=0){
			t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
			u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / denominator;
			if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
				this.x1 = x1;
				this.y1 = y1;
				this.x2 = x2;
				this.y2 = y2;
				this.x3 = x3;
				this.y3 = y3;
				this.x4 = x4;
				this.y4 = y4;
			}else {
				throw new IllegalArgumentException("Not Convex as expected");
			}
		}else {
			throw new IllegalArgumentException("Not Convex");
		}

	}

	@Override
	public Point centroid() {

		Point c1 = new Triangle(new Point(x1,y1), new Point(x2,y2), new Point(x3,y3)).centroid();
		Point c2 = new Triangle(new Point(x1,y1), new Point(x2,y2), new Point(x4,y4)).centroid();
		Point c3 = new Triangle(new Point(x1,y1), new Point(x3,y3), new Point(x4,y4)).centroid();
		Point c4 = new Triangle(new Point(x2,y2), new Point(x3,y3), new Point(x4,y4)).centroid();
		return new Segment( c1, c2 ).intersection(new Segment( c3,c4 ));

	}

	@Override
	public boolean isTheSame(Figure figure) {

		boolean output = false;
		int counter =0;
		double delta =0.0001;
		if(figure instanceof Quadrilateral){
			Quadrilateral q = (Quadrilateral) figure;
			double[][] qpoints = { {q.x1,q.y1},{q.x2,q.y2},{q.x3,q.y3},{q.x4,q.y4} };
			double[][] thispoints = { {x1,y1}, {x2,y2}, {x3,y3}, {x4,y4} };
			for (int i = 0; i < qpoints.length; i++) {
				for (int j = 0; j < qpoints.length; j++) {
					if(Math.abs(thispoints[i][0] - qpoints[j][0])<=delta && Math.abs( thispoints[i][1]-qpoints[j][1])<=delta){
						counter+=1;
						break;
					}
				}

			}
			if(counter==4){
				output=true;
			}
		}

		return output;
	}


	private static void checkPointsForNull(Point point1, Point point2, Point point3, Point point4) {
		if(point1 ==null | point2 ==null | point3 ==null | point4 ==null){
			throw new IllegalArgumentException("Null point exists");
		}
	}

	private static void checkPointsForCoincidence(Point point1, Point point2, Point point3, Point point4) {
		double x1 =point1.getX();
		double y1 =point1.getY();
		double x2 =point3.getX();
		double y2 =point3.getY();

		double x3 =point2.getX();
		double y3 =point2.getY();
		double x4 =point4.getX();
		double y4 =point4.getY();
		if((x1==x2 && y1==y2) || (x1==x3 && y1==y3) || (x1==x4 && y1==y4 ) ){
			throw new IllegalArgumentException("Points are coincides");
		} else if ((x2==x3 && y2==y3 ) || (x2==x4 && y2==y4) ) {
			throw new IllegalArgumentException("Points are coincides");
		} else if ((x3==x4 && y4==y3)) {
			throw new IllegalArgumentException("Points are coincides");
		}
	}

	public static void checkInternalAngleForConvex(Point point1, Point point2, Point point3, Point point4){
		checkAngleLessThan180degree(point1, point2, point4);
		checkAngleLessThan180degree(point2, point1, point3);
		checkAngleLessThan180degree(point3, point2, point4);
		checkAngleLessThan180degree(point4, point3, point1);

	}

	private static void checkAngleLessThan180degree(Point point1, Point point2, Point point3){
		double x1 =point1.getX();
		double y1 =point1.getY();
		double x2 =point2.getX();
		double y2 =point2.getY();
		double x3 =point3.getX();
		double y3 =point3.getY();

		double P12 = Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
		double P13 = Math.sqrt( (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1) );
		double P23_2 =  (x3-x2)*(x3-x2) + (y3-y2)*(y3-y2) ;

		double arccos = Math.toDegrees(Math.acos( (P12*P12 + P13*P13 - P23_2 ) / ( 2*P12*P13 )));
		if(Math.abs(arccos-180)<=0.0001){
			throw new IllegalArgumentException("illegal Points");
		}

	}

}
