public class Main {
    public static void main(String[] args) {

    //1.2.1
    Line l1 = new Line(1,1,10,15);
    Line l2 = new Line(4,5,7,9);
    Line l3 = new Line(10,21,9,65);
    Line l4 = new Line(l1.getStartPoint(), l2.getEndPoint());




        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        l1.setStartPoint(new Point(999,333));
        l2.setStartPoint(new Point(99,33));
        l3.setStartPoint(new Point(9,100));
        l2.setEndPoint(new Point(9,100));
        Point p1 = l3.getStartPoint();


        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

    }

}

