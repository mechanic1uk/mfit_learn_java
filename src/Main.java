import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       City a = new City("A");
       City b = new City("B");
       City c = new City("C");
       City d = new City("D");
       City e = new City("E");
       Map <City, Integer>  listcity = new HashMap<>();
       listcity.put(b,100);
       listcity.put(c,200);
       listcity.put(d,300);
       listcity.put(e,400);
       City f = new City("F", listcity);
       f.addPath(a,1);
       System.out.println(f);


       a.addPath(b,11);
       a.addPath(c,21);

       System.out.println(a);
       System.out.println(f);

       a.removePath(b);
       f.removePath(a);
       f.removePath(d);
       f.removePath(e);
       System.out.println(a);
       System.out.println(f);
       f.removePath(e);


       f.addPath(b,99);










    }

}
