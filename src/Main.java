import birds.Cuckoo;
import birds.Parrot;
import birds.Sparrow;
import geometric.ClosedPolyline;
import geometric.Point;

public class Main {
    public static void main(String[] args) {


        ClosedPolyline cpln = new ClosedPolyline(new Point(1,2),new Point(2,3),new Point(4,5));
        System.out.println(cpln);
        cpln.addLastPoint(new Point(3,4));
        System.out.println(cpln);
        System.out.println(cpln.lenght());
    }

}


