import java.util.Random;
import java.util.Scanner;
class Zad2_spr{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int k=20;
        int tab[] = new int[10];
        for(int i=0; i<tab.length; i++){
            k=k+2;
            tab[i]=k;
        }
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}