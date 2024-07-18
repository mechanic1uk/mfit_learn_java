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
        Line l4 = new Line(1,33,22,13);


        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);



    }

}

