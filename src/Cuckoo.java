import java.util.Random;
public class Cuckoo extends Bird {
    @Override
    public void isSing(){
        Random rnd = new Random();
        int count = rnd.nextInt(10)+1;
        for (int i = 0; i < count; i++){
            System.out.print("ку-ку ");
        }
    }
}


