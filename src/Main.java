import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

      Polyline pln = new Polyline();
      Polyline pln2 = new Polyline( new Point(1,2), new Point(2,3 ), new Point(3,4));
      pln.addPoint(new Point(33,2));
      System.out.println(pln);

      System.out.println(pln2);


    }






    }

}
