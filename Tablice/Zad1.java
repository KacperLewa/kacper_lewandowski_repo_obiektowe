import java.util.Random;
public class Zad1{
    public static void main(String[] args){
        Random r = new Random();
        int p = 0;
        int n = 0;
        int [] tab = new int[1000];
        for(int i=0;i<tab.length;i++){
            tab[i] = r.nextInt(100)+1;
            if(tab[i]%2==0){
                p=p+1;
            } else {
                n=n+1;
            }
        }
        System.out.println("Liczb parzystych jest "+p+" ,a nieparzystych "+n);
    }
}