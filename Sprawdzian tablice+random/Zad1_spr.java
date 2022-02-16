import java.util.Random;
import java.util.Scanner;
class Zad1_spr{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int o = r.nextInt(50-20+1)+20;
        int k = r.nextInt(40)-20;
        double sr = 0;
        int tab[] = new int[o];
        for(int i=0; i<tab.length; i++){
            tab[i]=k;
            sr = sr+k;
            k = r.nextInt(41)-20;
        }
        System.out.println("Średnia wynosi: "+(sr/tab.length));
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}