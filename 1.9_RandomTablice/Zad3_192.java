import java.util.Random;
import java.util.Scanner;
class Zad3_192{
    public static void main (String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int tab[] = new int [100];
        System.out.println("Podaj ilośc wykonania działań");
        int a = sc.nextInt();
        int srd = 0;
        int z = 0;
        //dodawanie
        for(int i=0; i<tab.length; i++){
            tab[i]=r.nextInt(10000)-5000;
        }
        //sortowanie
        for (int i = 0; i<tab.length; i++) {
            for (int j = 1; j<tab.length; j++) {
             if (tab[j]<tab[j-1]) {
                    int wieksza = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = wieksza;
                }
            }
        }
        while (z<a){
            //średnia
            for(int i=0; i<tab.length; i++){
                srd = srd + tab[i];
            }
            //min
            int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        //max
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        
            System.out.println("Średnia wynosi: "+srd/tab.length);
            System.out.println("Rozstęp wynosi: "+(max-min));
            System.out.println("Mediana wynosi: "+tab[tab.length/2]);
            z++;
        }
    }
}