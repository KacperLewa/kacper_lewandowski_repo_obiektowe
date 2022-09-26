import java.util.ArrayList;
import java.util.Random;
public class Zad2_listy{
    Random r = new Random();
    ArrayList<Integer> list = new ArrayList<>(100);
    ArrayList<Integer> list2 = new ArrayList<>(100);
    for(int i=0; i<100; i++){
        list.add(r.nextInt(100)+1);
    }
    for(int z=0; z<100; z++){
        int a = list.get(z);
        int b = 0;
        for(int j=0; j<100; j++){
            int c = list.get(j);
            
        }
    }
}