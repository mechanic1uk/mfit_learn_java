import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    Polyline pln = new Polyline();

    Polyline pln2 = new Polyline(new Point(1,2), new Point(2,3), new Point(3,4));

    Polyline pln3 = new Polyline(
            pln2.getFirstPoint(),
            new Point(-2,3),
            new Point(5,-4),
            pln2.getLastPoint());
   System.out.println(pln);
   System.out.println(pln2);
   System.out.println(pln3);

   pln.addPoint(pln2.getFirstPoint(), pln3.getPoint(3));
   System.out.println(pln);







    }

}
