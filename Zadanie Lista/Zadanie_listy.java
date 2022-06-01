import java.util.ArrayList;
import java.util.Random;
class Zadanie_listy{
    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>(100);
        for(int i=0; i<100; i++){
            list.add(r.nextInt(100)+1);
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
        int min = list.get(0);
        for (int i = 0; i < 100; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Min "+min);
        
        int max = list.get(0);
        for (int i = 0; i < 100; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max "+max);
    }
}