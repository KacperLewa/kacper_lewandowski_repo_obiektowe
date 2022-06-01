import java.util.ArrayList;
import java.util.Random;
class Zadd1_192{
    public static void main (String[] args){
        Random r = new Random();
        int srd = 0;
        ArrayList<Integer> list = new ArrayList<>(2000); 
        //dodawanie
        for(int i=0; i<2000; i++){
            list.add(r.nextInt(10000)+1);
        }
        //sortowanie
        for (int i = 0; i<2000; i++) {
            for (int j = 1; j<2000; j++) {
             if (list.indexOf(j)<list.indexOf(j-1)) {
                    int wieksza = list.indexOf(j-1);
                    wieksza = list.indexOf(j);
                    
                }
            }
        }
        //średnia
        for(int i=0; i<2000; i++){
            srd = srd + list.get(i);
        }
        //min
        int min = list.get(0);
        for (int i = 0; i < 2000; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        //max
        int max = list.get(0);
        for (int i = 0; i < 2000; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Średnia wynosi: "+srd/2000);
        System.out.println("Rozstęp wynosi: "+(max-min));
        System.out.println("Mediana wynosi: "+list.indexOf(1));
    }
}