

public class Main {
    public static void main(String[] args) {

       Point p1 = new Point(1,5);
       Point p2 = new Point(2,8);
       Point p3 = new Point(5,3);
       Polyline pln1 = new Polyline();
       pln1.addPoint(p1,p2,p3);
       Polyline pln2 = new Polyline(pln1.getFirstPoint(), new Point(2,-5), new Point(4,-8), pln1.getLastPoint());
       System.out.println(pln1);
       System.out.println(pln2);
       pln1.getFirstPoint().setXY(11,22);
       pln1.getLastPoint().setXY(33,32);
       System.out.println(pln1);
       System.out.println(pln2);


    }

}


/*



3.1.2, 3.2.3, 3.2.4, 3.3.3, 3.3.5
 */