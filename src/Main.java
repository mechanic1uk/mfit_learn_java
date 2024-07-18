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



       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(f);










    }

}
