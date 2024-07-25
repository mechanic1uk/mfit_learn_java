import birds.Cuckoo;
import birds.Parrot;
import birds.Sparrow;
import geometric.ClosedPolyline;
import geometric.Point;

public class Main {
    public static void main(String[] args) {


        ClosedPolyline cpln = new ClosedPolyline(new Point(1,2),new Point(3,4),new Point(5,5));
        System.out.println(cpln);
        cpln.addLastPoint(new Point(4,  1));
        System.out.println(cpln);
        System.out.println(cpln.lenght());
    }

}


