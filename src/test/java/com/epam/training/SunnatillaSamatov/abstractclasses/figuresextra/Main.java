package com.epam.training.SunnatillaSamatov.abstractclasses.figuresextra;

public class Main {
    public static void main(String[] args) {

//        Quadrilateral q= new Quadrilateral(new Point(-1, -1), new Point(1, 1), new Point(2, 2), new Point(3, -3));
//        q.centroid();
//        Quadrilateral q1 = new Quadrilateral(new Point(0,0), new Point(0, 2), new Point(0, 5), new Point(1, 1));
//        q1.centroid();
        Quadrilateral q2 = new Quadrilateral(new Point(1,1), new Point(1, -1), new Point(-1, -1),new Point(-2,2));
        q2.centroid();

//        double Ua, Ub, numerator_a, numerator_b, denominator;
//        double x1 = 1;
//        double y1 = 1;
//        double x2 = -1;
//        double y2 = -1;
//        double x3 = 1;
//        double y3 = -1;
//        double x4 = -2;
//        double y4 = 2;
//
//        denominator=(y4-y3)*(x1-x2)-(x4-x3)*(y1-y2);
//        if (denominator == 0){
//            if ( (x1*y2-x2*y1)*(x4-x3) - (x3*y4-x4*y3)*(x2-x1) == 0 && (x1*y2-x2*y1)*(y4-y3) - (x3*y4-x4*y3)*(y2-y1) == 0)  System.out.print("Отрезки пересекаются");
//            else System.out.print("Отрезки не пересекаются");
//        }
//        else{
//            numerator_a=(x4-x2)*(y4-y3)-(x4-x3)*(y4-y2);
//            numerator_b=(x1-x2)*(y4-y2)-(x4-x2)*(y1-y2);
//            Ua=numerator_a/denominator;
//            Ub=numerator_b/denominator;
//            double x= Ua*x1 + (1-Ua)*x2;
//            double y = Ua*y1 + (1-Ua)*y2;
//            if (Ua >=0 && Ua <=1 && Ub >=0 && Ub <=1)   System.out.print("Отрезки пересекаются "+"x "+x+" y "+y);
//            else    System.out.print("Отрезки не пересекаются");
//        }
    }

}
