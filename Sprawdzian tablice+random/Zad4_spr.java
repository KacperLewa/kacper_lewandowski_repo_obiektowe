import java.util.Random;
import java.util.Scanner;
class Zad4_spr{
    public static void main(String[] args){
        Random r = new Random();
        int o = r.nextInt(50-20+1)+20;
        int min = 50;
        int tab[] = new int[15];
        for(int i=0; i<tab.length; i++){
            tab[i]=o;
            o = r.nextInt(50-20+1)+20;
        }
        for(int i=0; i<tab.length; i++){
            if (tab[i]<min){
                min = tab[i];
            }
        }
        System.out.println("Najmniejsz liczba to:"+min);
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}