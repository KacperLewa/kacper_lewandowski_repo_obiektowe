import java.util.Scanner;
public class Blackjack{
    public static void main(String[] args){
        InfoGracza ig = new InfoGracza();
        Instrukcja i = new Instrukcja();
        Scanner sc = new Scanner(System.in);
        i.info();
        ig.losuj();
        ig.dobierz();
        ig.setGraczPKT(ig.getPKT());
        ig.kartaGracza();
        while(ig.getGraczPKT()<21){
            String a = sc.nextLine();
            if(a.equals("HIT") && ig.getGraczPKT()<21){
                ig.dobierz();
                ig.setGraczPKT(ig.getGraczPKT()+ig.getPKT());
                ig.kartaGracza();
            } else{
                break;
            }
        }
        if(ig.getGraczPKT()>21){
            System.out.println("Niestety przegrałeś :(");
            System.exit(0);
        }
        ig.graKrupiera();
        if(ig.getGraczPKT()==ig.getKrupierPKT()){
            System.out.println("Remis");
        } else if(ig.wynik()==true){
            System.out.println("Brawo! Udało ci się wygrać.");
        } else {
            System.out.println("Niestety przegrałeś :(");
        }
        System.out.println(ig.getGraczPKT());

    }
}