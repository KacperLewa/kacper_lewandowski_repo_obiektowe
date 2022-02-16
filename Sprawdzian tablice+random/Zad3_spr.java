import java.util.Random;
import java.util.Scanner;
class Zad3_spr{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int o = r.nextInt(5-2+1)+2;
        String tab[] = new String[o];
        for(int i=0; i<tab.length; i++){
            String a = sc.nextLine();
            tab[i]=a;
        }
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}