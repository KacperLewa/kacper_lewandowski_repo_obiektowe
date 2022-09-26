import java.util.ArrayList;
import java.util.Random;
public class Zad1_listy{
    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>(100);
        for(int i=0; i<100; i++){
            list.add(r.nextInt(10)+1);
        }
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if(a>8){
                System.out.println(a);
            }
        }
    }
}