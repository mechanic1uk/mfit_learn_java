import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       City a = new City("A");
       City b = new City("B");
       City c = new City("C");
       City d = new City("D");
       City e = new City("E");
       City f = new City("F");

       a.addPath(b,5);
       a.addPath(f,1);
       a.addPath(d,6);
       b.addPath(c,3);
       b.addPath(a,5);
       c.addPath(a,6);
       c.addPath(b,3);
       d.addPath(a,6);
       d.addPath(e,2);
       e.addPath(f,2);
       f.addPath(b,1);
       f.addPath(e,2);

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(f);










    }

}
