public class Main {
    public static void main(String[] args) {

    //1.2.1
        Point p1 = new Point(1,3);
        Point p2 = new Point(23,8);
        Point p3 = new Point(5,10);
        Point p4 = new Point(25,10);

        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);
        Line l3 = new Line(l1.getStartPoint(), l2.getEndPoint());
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println();

//
          p2.setXY(11,23);
          p1.setXY(999,777);
          p3.setXY(88,27);
          p4.setXY(66,44);


        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println();

        p1 = new Point (33,23);
        p2 = new Point (22,99);
        p3 = new Point (66,77);
        p4 = new Point (44,34);
        l1.setStartPoint(p1);
        l2.setStartPoint(p3);
        l1.setEndPoint(p2);
        l2.setEndPoint(p4);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);






    }

}

